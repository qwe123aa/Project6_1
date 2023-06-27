package kr.hs.emirim.limsoyeong.project6_1

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.SystemClock
import android.view.View
import android.widget.Button
import android.widget.CalendarView
import android.widget.Chronometer
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.TimePicker

class MainActivity : AppCompatActivity() {
    lateinit var chrono1 : Chronometer
    lateinit var btnStart : Button
    lateinit var btnDone : Button
    lateinit var rg : RadioGroup
    lateinit var radioCal:RadioButton
    lateinit var radioTime:RadioButton
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
        radioCal = findViewById(R.id.radioDate);
        radioTime = findViewById(R.id.radioTime);
        calendar = findViewById(R.id.calendar)
        timePick = findViewById(R.id.timePick)
        textResult = findViewById(R.id.textResult)

        timePick.visibility = View.INVISIBLE
        calendar.visibility = View.INVISIBLE

        radioCal.setOnClickListener{
            timePick.visibility = View.INVISIBLE
            calendar.visibility = View.VISIBLE
        }

        radioTime.setOnClickListener{
            timePick.visibility = View.VISIBLE
            calendar.visibility = View.INVISIBLE
        }

        btnStart.setOnClickListener {
            chrono1.base = SystemClock.elapsedRealtime();
            chrono1.start()
            chrono1.setTextColor(Color.RED)
        }

        btnDone.setOnClickListener {
            chrono1.stop()
            chrono1.setTextColor(Color.BLUE)

            textResult.setText("" + selectedYear + "년 " + (selectedMonth + 1)+ "월 " + selectedDay + "일 ")
            textResult.append("" + timePick.currentHour + "시 " + timePick.currentMinute + "분")
            textResult.append("예약됨")

        }

        calendar.setOnDateChangeListener{calendarView, year, month, day ->
            selectedYear = year
            selectedMonth = month
            selectedDay = day
        }
    }
}