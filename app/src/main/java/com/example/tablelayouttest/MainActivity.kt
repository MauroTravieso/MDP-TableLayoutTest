package com.example.tablelayouttest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TableRow
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun click(view : View) {
        // Create a new table row
        val tableRow = TableRow(getApplicationContext())

        //Set the new table row layout parameters
        val layoutParams = TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT)
        tableRow.setLayoutParams(layoutParams)

        // Add values into the row by calling addView()

        tableRow.addView(editText1,1)

        tableRow.addView(editText2,2)

        // Add the created row into the layout
        tableLayoutId.addView(tableRow)

    }
}

