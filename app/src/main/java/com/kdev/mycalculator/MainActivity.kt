package com.kdev.mycalculator

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.math.BigDecimal
import java.math.RoundingMode

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btn_add.setOnClickListener {
            add()
        }

        btn_subtract.setOnClickListener {
            subtract()
        }

        btn_multiply.setOnClickListener {
            multiply()
        }

        btn_divide.setOnClickListener {
            divide()
        }

    }

    @SuppressLint("SetTextI18n")
    private fun add() {
        //Notification for checkbox
        if (cb1.isChecked && !cb2.isChecked && !cb3.isChecked) {
            Toast.makeText(this, "Please check one more", Toast.LENGTH_SHORT).show()
        } else if (!cb1.isChecked && cb2.isChecked && !cb3.isChecked) {
            Toast.makeText(this, "Please check one more", Toast.LENGTH_SHORT).show()
        } else if (!cb1.isChecked && !cb2.isChecked && cb3.isChecked) {
            Toast.makeText(this, "Please check one more", Toast.LENGTH_SHORT).show()
        } else if (!cb1.isChecked && !cb2.isChecked && !cb3.isChecked) {
            Toast.makeText(
                this,
                "You uncheck all them, please check more than one",
                Toast.LENGTH_SHORT
            ).show()
        }


        if (inputEmpty1() && inputEmpty2()) {
            if (cb1.isChecked && cb2.isChecked) {
                val in1 = edt1.text.toString().trim().toBigDecimal()
                val in2 = edt2.text.toString().trim().toBigDecimal()
                tv_result.text = in1.add(in2).toString()
            }
        }

        if (inputEmpty1() && inputEmpty3()) {
            if (cb1.isChecked && cb3.isChecked) {
                val in1 = edt1.text.toString().trim().toBigDecimal()
                val in2 = edt3.text.toString().trim().toBigDecimal()
                tv_result.text = in1.add(in2).toString()
            }
        }

        if (inputEmpty2() && inputEmpty3()) {
            if (cb2.isChecked && cb3.isChecked) {
                val in1 = edt2.text.toString().trim().toBigDecimal()
                val in2 = edt3.text.toString().trim().toBigDecimal()
                tv_result.text = in1.add(in2).toString()
            }
        }

        if (inputEmpty1() && inputEmpty2() && inputEmpty3()) {
            if (cb1.isChecked && cb2.isChecked && cb3.isChecked) {
                val in1 = edt1.text.toString().trim().toBigDecimal()
                val in2 = edt2.text.toString().trim().toBigDecimal()
                val in3 = edt3.text.toString().trim().toBigDecimal()
                tv_result.text = in1.add(in2).add(in3).toString()
            }
        }

    }


    @SuppressLint("SetTextI18n")
    private fun subtract() {
        //Notification for checkbox
        if (cb1.isChecked && !cb2.isChecked && !cb3.isChecked) {
            Toast.makeText(this, "Please check one more", Toast.LENGTH_SHORT).show()
        } else if (!cb1.isChecked && cb2.isChecked && !cb3.isChecked) {
            Toast.makeText(this, "Please check one more", Toast.LENGTH_SHORT).show()
        } else if (!cb1.isChecked && !cb2.isChecked && cb3.isChecked) {
            Toast.makeText(this, "Please check one more", Toast.LENGTH_SHORT).show()
        } else if (!cb1.isChecked && !cb2.isChecked && !cb3.isChecked) {
            Toast.makeText(
                this,
                "You uncheck all them, please check more than one",
                Toast.LENGTH_SHORT
            ).show()
        }


        if (inputEmpty1() && inputEmpty2()) {
            if (cb1.isChecked && cb2.isChecked) {
                val in1 = edt1.text.toString().trim().toBigDecimal()
                val in2 = edt2.text.toString().trim().toBigDecimal()
                tv_result.text = in1.subtract(in2).toString()
            }
        }

        if (inputEmpty1() && inputEmpty3()) {
            if (cb1.isChecked && cb3.isChecked) {
                val in1 = edt1.text.toString().trim().toBigDecimal()
                val in2 = edt3.text.toString().trim().toBigDecimal()
                tv_result.text = in1.subtract(in2).toString()
            }
        }

        if (inputEmpty2() && inputEmpty3()) {
            if (cb2.isChecked && cb3.isChecked) {
                val in1 = edt2.text.toString().trim().toBigDecimal()
                val in2 = edt3.text.toString().trim().toBigDecimal()
                tv_result.text = in1.subtract(in2).toString()
            }
        }

        if (inputEmpty1() && inputEmpty2() && inputEmpty3()) {
            if (cb1.isChecked && cb2.isChecked && cb3.isChecked) {
                val in1 = edt1.text.toString().trim().toBigDecimal()
                val in2 = edt2.text.toString().trim().toBigDecimal()
                val in3 = edt3.text.toString().trim().toBigDecimal()
                tv_result.text = in1.subtract(in2).subtract(in3).toString()
            }
        }
    }


    @SuppressLint("SetTextI18n")
    private fun multiply() {
        //Notification for checkbox
        if (cb1.isChecked && !cb2.isChecked && !cb3.isChecked) {
            Toast.makeText(this, "Please check one more", Toast.LENGTH_SHORT).show()
        } else if (!cb1.isChecked && cb2.isChecked && !cb3.isChecked) {
            Toast.makeText(this, "Please check one more", Toast.LENGTH_SHORT).show()
        } else if (!cb1.isChecked && !cb2.isChecked && cb3.isChecked) {
            Toast.makeText(this, "Please check one more", Toast.LENGTH_SHORT).show()
        } else if (!cb1.isChecked && !cb2.isChecked && !cb3.isChecked) {
            Toast.makeText(
                this,
                "You uncheck all them, please check more than one",
                Toast.LENGTH_SHORT
            ).show()
        }


        if (inputEmpty1() && inputEmpty2()) {
            if (cb1.isChecked && cb2.isChecked) {
                val in1 = edt1.text.toString().trim().toBigDecimal()
                val in2 = edt2.text.toString().trim().toBigDecimal()
                tv_result.text = in1.multiply(in2).toString()
            }
        }

        if (inputEmpty1() && inputEmpty3()) {
            if (cb1.isChecked && cb3.isChecked) {
                val in1 = edt1.text.toString().trim().toBigDecimal()
                val in2 = edt3.text.toString().trim().toBigDecimal()
                tv_result.text = in1.multiply(in2).toString()
            }
        }

        if (inputEmpty2() && inputEmpty3()) {
            if (cb2.isChecked && cb3.isChecked) {
                val in1 = edt2.text.toString().trim().toBigDecimal()
                val in2 = edt3.text.toString().trim().toBigDecimal()
                tv_result.text = in1.multiply(in2).toString()
            }
        }

        if (inputEmpty1() && inputEmpty2() && inputEmpty3()) {
            if (cb1.isChecked && cb2.isChecked && cb3.isChecked) {
                val in1 = edt1.text.toString().trim().toBigDecimal()
                val in2 = edt2.text.toString().trim().toBigDecimal()
                val in3 = edt3.text.toString().trim().toBigDecimal()
                tv_result.text = in1.multiply(in2).multiply(in3).toString()
            }
        }
    }


    @SuppressLint("SetTextI18n")
    private fun divide() {
        //Notification for checkbox
        if (cb1.isChecked && !cb2.isChecked && !cb3.isChecked) {
            Toast.makeText(this, "Please check one more", Toast.LENGTH_SHORT).show()
        } else if (!cb1.isChecked && cb2.isChecked && !cb3.isChecked) {
            Toast.makeText(this, "Please check one more", Toast.LENGTH_SHORT).show()
        } else if (!cb1.isChecked && !cb2.isChecked && cb3.isChecked) {
            Toast.makeText(this, "Please check one more", Toast.LENGTH_SHORT).show()
        } else if (!cb1.isChecked && !cb2.isChecked && !cb3.isChecked) {
            Toast.makeText(
                this,
                "You uncheck all them, please check more than one",
                Toast.LENGTH_SHORT
            ).show()
        }

        if (inputEmpty1() && inputEmpty2()) {
            if (cb1.isChecked && cb2.isChecked) {
                val in1 = edt1.text.toString().trim().toBigDecimal()
                val in2 = edt2.text.toString().trim().toBigDecimal()

                if (in2.compareTo(BigDecimal.ZERO) == 0) {
                    edt2.error = "Invalid number"
                } else {
                    tv_result.text = in1.divide(in2, 2, RoundingMode.HALF_UP).toString()
                }
            }
        }

        if (inputEmpty1() && inputEmpty3()) {
            if (cb1.isChecked && cb3.isChecked) {
                val in1 = edt1.text.toString().trim().toBigDecimal()
                val in2 = edt3.text.toString().trim().toBigDecimal()

                if (in2.compareTo(BigDecimal.ZERO) == 0) {
                    edt3.error = "Invalid number"
                } else {
                    tv_result.text = in1.divide(in2, 2, RoundingMode.HALF_UP).toString()
                }
            }
        }

        if (inputEmpty2() && inputEmpty3()) {
            if (cb2.isChecked && cb3.isChecked) {
                val in1 = edt2.text.toString().trim().toBigDecimal()
                val in2 = edt3.text.toString().trim().toBigDecimal()

                if (in2.compareTo(BigDecimal.ZERO) == 0) {
                    edt3.error = "Invalid number"
                } else {
                    tv_result.text = in1.divide(in2, 2, RoundingMode.HALF_UP).toString()
                }
            }
        }

        if (inputEmpty1() && inputEmpty2() && inputEmpty3()) {
            if (cb1.isChecked && cb2.isChecked && cb3.isChecked) {
                val in1 = edt1.text.toString().trim().toBigDecimal()
                val in2 = edt2.text.toString().trim().toBigDecimal()
                val in3 = edt3.text.toString().trim().toBigDecimal()

                tv_result.text = in1.divide((in2).divide(in3), 2, RoundingMode.HALF_UP).toString()
            }
        }
    }


    private fun inputEmpty1(): Boolean {
        var b = true

        if (edt1.text.toString().trim().isEmpty()) {
            edt1.error
            b = false
        }
        return b
    }

    private fun inputEmpty2(): Boolean {
        var b = true

        if (edt2.text.toString().trim().isEmpty()) {
            edt2.error
            b = false
        }
        return b
    }

    private fun inputEmpty3(): Boolean {
        var b = true

        if (edt3.text.toString().trim().isEmpty()) {
            edt3.error
            b = false
        }
        return b
    }

}


