package com.example.myrestaurantapps

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        chefButton.setOnClickListener {
            val i = Intent()
            i.setClassName(BuildConfig.APPLICATION_ID, "com.example.myrestaurantapps.chef.ChefActivity")
            startActivity(i)
        }

        cashierButton.setOnClickListener {
            val i = Intent()
            i.setClassName(BuildConfig.APPLICATION_ID, "com.example.myrestaurantapps.cashier.CashierActivity")
            startActivity(i)
        }
    }

}
