package com.example.applicationlearn

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivityA : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnreult.setOnClickListener {
            val name=txtname.text.toString()
            val university=txtspinner.selectedItem
            var gender=""
            if (radMALE.isChecked)
                gender="Male"
            else
                gender="Female"
            var intrests=""
            if (chered.isChecked)
                intrests +="read"
            if(chepro.isChecked)
                intrests +="programming"

            txtres.setText("the name is $name\n university is $university\n grnder is$gender\nintrests is$intrests")
        }
        btnclar.setOnClickListener {
            txtname.text.clear()
            txtres.text.clear()
        }
        button11.setOnClickListener {
            val i = Intent(this, MainActivity2::class.java)
            startActivity(i)
        }
    }
}