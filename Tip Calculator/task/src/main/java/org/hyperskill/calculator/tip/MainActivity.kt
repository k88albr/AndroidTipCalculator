package org.hyperskill.calculator.tip

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.slider.Slider
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var billStr = ""
    private var tipPercent = 0

    /**
    * Calculates the tip to display
    */
    fun updateTip() {
        if(billStr.isNotEmpty()){
            val tip = billStr.toDouble() * tipPercent * 0.01
            text_view.text = getString(R.string.tip_amount).format(tip)
        }
        else{
            text_view.text = ""
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edit_text.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            }
            override fun afterTextChanged(s: Editable?) {
                billStr = s?.toString() ?: ""
                updateTip()
            }
        })

        val tipCtl = findViewById<Slider>(R.id.slider)
        tipCtl.addOnChangeListener{ _, value, _ ->
            tipPercent = value.toInt()
            updateTip()
        }
    }
}