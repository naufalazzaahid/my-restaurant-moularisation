package com.example.chef_usecase

import com.example.common.Chef
import com.example.domain.ChefRepositoryImpl

class GetAllChefImpl(val repositoryImpl: ChefRepositoryImpl) {
    fun execute() : List<Chef>?{
        return repositoryImpl.getAllChef()
    }
}
