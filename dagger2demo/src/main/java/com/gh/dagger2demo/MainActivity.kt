package com.gh.dagger2demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //无参数的注入
        findViewById<View>(R.id.btn_001).setOnClickListener {
            val zhaiNan1 = DaggerPlatform1.builder().build().waimai()
            zhaiNan1.eat()
        }

        //有参数的注入
        findViewById<View>(R.id.btn_002).setOnClickListener {
            val zhaiNan2 = DaggerPlatform2.builder().build().waimai()
            zhaiNan2.eat()
        }

        //抽象参数的注入
        findViewById<View>(R.id.btn_003).setOnClickListener {
            val zhaiNan3 = DaggerPlatform3.builder().build().waimai()
            zhaiNan3.eat()
        }

        //抽象参数不同实现的注入
        findViewById<View>(R.id.btn_004).setOnClickListener {
        }

        //三方参数的注入
        findViewById<View>(R.id.btn_005).setOnClickListener {
            val zhaiNan5 = DaggerPlatform5.builder().build().waimai()
            zhaiNan5.eat()
        }

        //+module传参
        findViewById<View>(R.id.btn_005_1).setOnClickListener {
            val zhaiNan5_1 =
                DaggerPlatform5_1
                    .builder()
                    .shangJiaModule5_1(ShangJiaModule5_1("王三狗包子铺"))
                    .build().waimai()
            zhaiNan5_1.eat()
        }

        //有参数的三方参数的注入
        findViewById<View>(R.id.btn_006).setOnClickListener {
        }

        //有参数的三方参数的注入(测试单例)
        findViewById<View>(R.id.btn_007).setOnClickListener {
        }

        //Context参数的注入
        findViewById<View>(R.id.btn_008).setOnClickListener {
        }

        //ViewModel参数的注入
        findViewById<View>(R.id.btn_009).setOnClickListener {
        }

        //ViewModel参数的注入(正常获取VM)
        findViewById<View>(R.id.btn_0010).setOnClickListener {
        }

    }
}