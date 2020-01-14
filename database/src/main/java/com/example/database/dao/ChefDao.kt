package com.example.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.database.entity.ChefEntity

@Dao
interface ChefDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertChef(chefEntity: ChefEntity)

    @Query("SELECT * FROM CHEF")
    fun loadAllChef(): List<ChefEntity>
}
