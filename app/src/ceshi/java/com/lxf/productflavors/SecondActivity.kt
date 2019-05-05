package com.lxf.producrflavors

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.lxf.productflavors.R
import kotlinx.android.synthetic.ceshi.activity_second.*

class SecondActivity : AppCompatActivity() {

    val imageUrl = "https://timgsa.baidu.com/timg?image&quality=80&size=b10000_10000&sec=1557038961&di=586348b71e79de6171f80c6ee611d441&src=http://pic2.16pic.com/00/10/77/16pic_1077775_b.jpg"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        Glide.with(this).load(imageUrl).into(iv_second)


    }
}
