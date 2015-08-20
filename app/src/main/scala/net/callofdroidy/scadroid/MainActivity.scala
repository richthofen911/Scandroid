package net.callofdroidy.scadroid

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.{View, Menu}
import android.view.View.OnClickListener
import android.widget.TextView
import com.android.volley.Response.{ErrorListener, Listener}
import com.android.volley.{VolleyError, Response, Request}
import com.android.volley.toolbox.{Volley, StringRequest}
;

import scala.Unit;

class MainActivity extends AppCompatActivity {

    //how to set val tv_display as global?

    override def onCreate(savedInstanceState: Bundle): Unit= {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tv_display = findViewById(R.id.tv_display).asInstanceOf[TextView]

        val requestTest = new StringRequest(Request.Method.GET, "https://www.google.ca/?gws_rd=ssl", new Response.Listener[String](){
            override def onResponse(response: String) = tv_display.setText(response)
        }, new ErrorListener {
            override def onErrorResponse(error: VolleyError) = tv_display.setText(error.toString)
        })

        findViewById(R.id.btn_change).setOnClickListener(new OnClickListener {
            override def onClick(v: View) = {
                Volley.newRequestQueue(getApplicationContext).add(requestTest)
            }
        })




    }

}
