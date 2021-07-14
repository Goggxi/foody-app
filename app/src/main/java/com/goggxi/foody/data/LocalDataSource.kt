package com.goggxi.foody.data

import com.goggxi.foody.data.database.RecipesDao
import com.goggxi.foody.data.database.RecipesEntity
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class LocalDataSource @Inject constructor(
    private val recipesDao: RecipesDao
) {

    fun readDatabase(): Flow<List<RecipesEntity>> {
        return recipesDao.readRecipes()
    }

    suspend fun insertRecipe(recipesEntity: RecipesEntity) {
        recipesDao.insertRecipes(recipesEntity)
    }



}