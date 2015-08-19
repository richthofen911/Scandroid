package net.callofdroidy.scadroid

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.{View, Menu}
import android.view.View.OnClickListener
import android.widget.TextView
;

import scala.Unit;

class MainActivity extends AppCompatActivity {

    override def onCreate(savedInstanceState: Bundle): Unit= {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tv_display: TextView = findViewById(R.id.tv_display).asInstanceOf[TextView]

        findViewById(R.id.btn_change).setOnClickListener(new OnClickListener {
            override def onClick(v: View): Unit = {
                tv_display.setText("Hi Scala")
            }
        })
    }

}
