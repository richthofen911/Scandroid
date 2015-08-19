package net.callofdroidy.scadroid

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.{View, Menu}
import android.view.View.OnClickListener
import android.widget.TextView
;

import scala.Unit;

class MainActivity extends AppCompatActivity {

    //how to set val tv_display as global?

    override def onCreate(savedInstanceState: Bundle): Unit= {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tv_display = findViewById(R.id.tv_display).asInstanceOf[TextView]

        findViewById(R.id.btn_change).setOnClickListener(new OnClickListener {
            override def onClick(v: View) = {
                tv_display.setText("Hi Scala")
            }
        })


    }

}
