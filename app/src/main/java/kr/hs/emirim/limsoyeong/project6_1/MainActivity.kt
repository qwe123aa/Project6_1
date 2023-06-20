package kr.hs.emirim.limsoyeong.project6_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CalendarView
import android.widget.Chronometer
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.TimePicker

class MainActivity : AppCompatActivity() {
    lateinit var chrono1 : Chronometer
    lateinit var btnStart : Button
    lateinit var btnDone : Button
    lateinit var rg : RadioGroup
    lateinit var calendar : CalendarView
    lateinit var timePick : TimePicker
    lateinit var textResult : TextView
    var selectedYear : Int = 0
    var selectedMonth : Int = 0
    var selectedDay : Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        chrono1 = findViewById(R.id.chrono1)
        btnStart = findViewById(R.id.btnStart)
        btnDone = findViewById(R.id.btnDone)
        rg = findViewById(R.id.rg)
        calendar = findViewById(R.id.calendar)
        timePick = findViewById(R.id.timePick)
        textResult = findViewById(R.id.textResult)

        timePick.visibility = View.INVISIBLE
        calendar.visibility = View.INVISIBLE
    }
}