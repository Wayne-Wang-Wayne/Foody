package com.example.foody.recipesData

import com.example.foody.models.FoodRecipe
import com.example.foody.recipesData.network.FoodRecipesApi
import retrofit2.Response
import javax.inject.Inject

class RecipesRemoteDataSource @Inject constructor(
    private val foodRecipesApi: FoodRecipesApi
) {

    suspend fun getRecipes(queries: Map<String, String>): Response<FoodRecipe> {
        return foodRecipesApi.getRecipes(queries)
    }

}