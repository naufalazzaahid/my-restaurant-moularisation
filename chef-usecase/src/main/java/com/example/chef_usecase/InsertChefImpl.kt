package com.example.chef_usecase

import com.example.common.Chef
import com.example.domain.ChefRepositoryImpl

class InsertChefImpl (val repositoryImpl: ChefRepositoryImpl)  {
    fun execute(chef: Chef) {
        repositoryImpl.insertChef(chef)
    }
}
