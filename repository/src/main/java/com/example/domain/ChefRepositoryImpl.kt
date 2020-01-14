package com.example.domain

import com.example.database.dao.ChefDao
import com.example.common.Chef
import com.example.database.entity.ChefEntity

class ChefRepositoryImpl(val chefDao: ChefDao) {

    fun insertChef(chef: Chef) {
        chefDao.insertChef(ChefEntity(0, chef.name, chef.age, chef.desc))
    }

    fun getAllChef() : List<Chef>? {
        val listOfChef : List<Chef>?

        listOfChef = chefDao.loadAllChef().map {
            Chef(it.name, it.age, it.desc)
        }

        return listOfChef
    }
}
