package akshay.mybrowser

import android.app.ProgressDialog
import android.graphics.Bitmap
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.ProgressBar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var pd : ProgressDialog? =null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        wv.settings.javaScriptEnabled = true
        pd = ProgressDialog(this)
        pd!!.setMessage("Please Wait")
        wv.webViewClient = object:  WebViewClient(){
            override fun onPageStarted(view: WebView?, url: String?, favicon: Bitmap?) {
                super.onPageStarted(view, url, favicon)
                pd!!.show()
                pd.setCanceledOnTouchOutside(false)
            }

            override fun onPageFinished(view: WebView?, url: String?) {
                super.onPageFinished(view, url)
                pd!!.dismiss()
            }
        }
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
