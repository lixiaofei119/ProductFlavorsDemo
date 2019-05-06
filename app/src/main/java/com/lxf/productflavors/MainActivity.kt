package com.lxf.productflavors

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide

/**
 * 通过配置productFlavors实现多版本差异化
 * productFlavors使用：https://juejin.im/post/5a30cef8f265da4310485ec8#comment
 * @author lxf
 * @date 2019/5/5
 * @version 1.0.0
 */
class MainActivity : AppCompatActivity() {

    val imageUrl = "https://ss2.bdstatic.com/70cFvnSh_Q1YnxGkpoWK1HF6hhy/it/u=2097124721,3074829049&fm=26&gp=0.jpg"
    val imageUrl2 =
        "https://timgsa.baidu.com/timg?image&quality=80&size=b10000_10000&sec=1557038504&di=68319f9012fbadc6ef35daa45e5d2bb2&src=http://pic29.nipic.com/20130531/8786105_102319220000_2.jpg"
    lateinit var tv_version_code: TextView
    lateinit var iv_main_first: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv_version_code = this.findViewById(R.id.tv_version_code)
        iv_main_first = this.findViewById(R.id.iv_main_first)

        val versionName = packageManager.getPackageInfo(packageName, 0).versionName
        tv_version_code.text = "包名：$packageName;版本：$versionName"
        when (BuildConfig.FLAVOR) {
            "ceshi" -> {
                Glide.with(this).load(imageUrl).into(iv_main_first)
            }
            "kaifa" -> {
                Glide.with(this).load(imageUrl2).into(iv_main_first)
            }
            else -> {
            }
        }

        iv_main_first.setOnClickListener { startActivity(Intent(this, SecondActivity::class.java)) }
    }
}
