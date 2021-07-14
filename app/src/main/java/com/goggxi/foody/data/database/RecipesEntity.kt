package com.goggxi.foody.data.database

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.goggxi.foody.models.FoodRecipe
import com.goggxi.foody.util.Constant.Companion.RECIPES_TABLE

@Entity(tableName = RECIPES_TABLE)
class RecipesEntity(
    var foodRecipe: FoodRecipe
) {

    @PrimaryKey(autoGenerate = false)
    var id: Int = 0

}