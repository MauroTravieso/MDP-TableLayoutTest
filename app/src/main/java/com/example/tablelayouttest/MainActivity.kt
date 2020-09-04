package com.example.tablelayouttest

import android.content.Context
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

    //val tableLayout = findViewById(R.id.table_layout_table) as TableLayout
    fun click(view : View) {

        context = getApplicationContext()
        // Create a new table row
        val tableRow = TableRow(context)

        //Set the new table row layout parameters
        val layoutParams = TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT)
        tableRow.setLayoutParams(layoutParams)

        // Add values into the row by calling addView()
        val textView1 = TextView(context)
        textView1.setText(editText1.text.toString())
        tableRow.addView(editText1, 0)

        val textView2 = TextView(context)
        textView2.setText(editText2.text.toString())
        tableRow.addView(editText2,1)

        // Add the created row into the layout
        tableLayoutId.addView(tableRow)

    }
}

