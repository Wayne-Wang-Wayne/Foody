package com.example.foody.recipesData

import dagger.hilt.android.scopes.ActivityRetainedScoped
import javax.inject.Inject

@ActivityRetainedScoped
class RecipesRepository @Inject constructor(
    val remoteDataSource: RecipesRemoteDataSource
) {


}