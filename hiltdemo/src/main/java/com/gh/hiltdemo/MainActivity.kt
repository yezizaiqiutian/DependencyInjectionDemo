package com.gh.hiltdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModelProvider
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var truck1 : Truck1
    @Inject
    lateinit var truck2 : Truck2
    @Inject
    lateinit var truck3 : Truck3
    @Inject
    lateinit var truck4 : Truck4
    @Inject
    lateinit var okHttpClient5 : OkHttpClient5
    @Inject
    lateinit var retrofit5: Retrofit5
    @Inject
    lateinit var retrofit6: Retrofit5
    @Inject
    lateinit var retrofit8: Retrofit8
    @Inject
    lateinit var mainViewModel9: MainViewModel

    private val viewModel10: MainViewModel2 by lazy { ViewModelProvider(this)[MainViewModel2::class.java] }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //无参数的注入
        findViewById<View>(R.id.btn_001).setOnClickListener {
            truck1.deliver()
        }

        //有参数的注入
        findViewById<View>(R.id.btn_002).setOnClickListener {
            truck2.deliver()
        }

        //抽象参数的注入
        findViewById<View>(R.id.btn_003).setOnClickListener {
            truck3.deliver()
        }

        //抽象参数不同实现的注入
        findViewById<View>(R.id.btn_004).setOnClickListener {
            truck4.deliver()
        }

        //三方参数的注入
        findViewById<View>(R.id.btn_005).setOnClickListener {
            okHttpClient5.net()
        }

        //有参数的三方参数的注入
        findViewById<View>(R.id.btn_006).setOnClickListener {
            retrofit5.net()
        }

        //有参数的三方参数的注入(测试单例)
        findViewById<View>(R.id.btn_007).setOnClickListener {
            retrofit6.net()
        }

        //Context参数的注入
        findViewById<View>(R.id.btn_008).setOnClickListener {
            retrofit8.net()
        }

        //ViewModel参数的注入
        findViewById<View>(R.id.btn_009).setOnClickListener {
            mainViewModel9.net()
        }

        //ViewModel参数的注入(正常获取VM)
        findViewById<View>(R.id.btn_0010).setOnClickListener {
            viewModel10.net()
        }

    }
}