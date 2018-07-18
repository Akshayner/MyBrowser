package akshay.mybrowser

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        wv.webViewClient = WebViewClient()
    }

    fun load(v:View){
        when(v.id){
            R.id.se -> wv.loadUrl("http://"+et1.text.toString())
            R.id.fb -> wv.loadUrl("http://fb.com")
            R.id.gg -> wv.loadUrl("http://gooogle.com")
            R.id.tw -> wv.loadUrl("http://twitter.com")
            R.id.yt -> wv.loadUrl("http://youtube.com")
            R.id.ht -> wv.loadUrl("")

        }
    }
}
