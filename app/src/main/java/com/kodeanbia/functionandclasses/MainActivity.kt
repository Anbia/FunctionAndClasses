package com.kodeanbia.functionandclasses

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var age:Int? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun makeSimpson(view : View){

        var name = nameText.text.toString()
        if (!ageText.text.toString().equals("")){
            age = ageText.text.toString().toInt()
        }
        var job = jobText.text.toString()

        val simpson = Simpson(name, age, job)

        textView.text = simpson.name + simpson.age + simpson.job

    }

}
