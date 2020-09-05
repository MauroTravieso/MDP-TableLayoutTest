package com.example.tablelayouttest

import android.content.Context
import android.graphics.Color.red
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TableRow
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var context: Context? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun click(view : View) {

        context = getApplicationContext()
        // Create a new table row
        val tableRow = TableRow(context)

        //Set the new table row layout parameters
        val layoutParams = TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT)
        tableRow.setLayoutParams(layoutParams)

        // Add values into the row by calling addView()
        if (!editText1.text.toString().isEmpty() && !editText2.text.toString().isEmpty()) {
            val textView1 = TextView(context)
            textView1.setText(editText1.text.toString())
            textView1.setBackgroundResource(R.color.rowColor)
            tableRow.addView(textView1, 0)

            val textView2 = TextView(context)
            textView2.setText(editText2.text.toString())
            textView2.setBackgroundResource(R.color.rowColor)
            tableRow.addView(textView2, 1)

            // Add the created row into the layout
            tableLayoutId.addView(tableRow)

            editText1.getText().clear()
            editText2.getText().clear()
        }
    }
}

