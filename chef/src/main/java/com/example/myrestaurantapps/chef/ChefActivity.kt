package com.example.myrestaurantapps.chef

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.chef_usecase.GetAllChefImpl
import com.example.chef_usecase.InsertChefImpl
import com.example.chef_usecase.chefUseCaseModule
import com.example.common.Chef
import kotlinx.android.synthetic.main.activity_chef.*
import org.koin.android.ext.android.inject
import org.koin.core.context.loadKoinModules
import org.koin.core.context.unloadKoinModules

class ChefActivity : AppCompatActivity() {

    private val insertChefImpl : InsertChefImpl by inject()
    private val getAllChefImpl : GetAllChefImpl by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chef)

        loadKoinModules(chefUseCaseModule)

        val currentChef = Chef("heri", 30, "entry level chef")

        chefName.text = currentChef.name
        chefAge.text = "${currentChef.age}"
        chefDesc.text = currentChef.desc

        insertChefImpl.execute(currentChef)

        Toast.makeText(this, "" + getAllChefImpl.execute()?.size, Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        unloadKoinModules(chefUseCaseModule)
        super.onDestroy()
    }
}
