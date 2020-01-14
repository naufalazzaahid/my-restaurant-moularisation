package com.example.myrestaurantapps.cashier

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.common.Cashier
import kotlinx.android.synthetic.main.activity_cashier.*

class CashierActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cashier)

        val currentcashier = Cashier("rani", 19, "entry level cashier")

        cashierName.text = currentcashier.name
        cashierAge.text = "${currentcashier.age}"
        cashierDesc.text = currentcashier.desc
    }
}
