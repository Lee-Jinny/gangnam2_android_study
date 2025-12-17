package com.survivalcoding.gangnam2kiandroidstudy.core.di

import com.survivalcoding.gangnam2kiandroidstudy.data.data_source.ChefDataSource
import com.survivalcoding.gangnam2kiandroidstudy.data.data_source.IngredientDataSource
import com.survivalcoding.gangnam2kiandroidstudy.data.data_source.MockChefDataSourceImpl
import com.survivalcoding.gangnam2kiandroidstudy.data.data_source.MockIngredientDataSourceImpl
import com.survivalcoding.gangnam2kiandroidstudy.data.data_source.MockProcedureDataSourceImpl
import com.survivalcoding.gangnam2kiandroidstudy.data.data_source.MockRecipeDataSourceImpl
import com.survivalcoding.gangnam2kiandroidstudy.data.data_source.MockRecipeIngredientDataSourceImpl
import com.survivalcoding.gangnam2kiandroidstudy.data.data_source.ProcedureDataSource
import com.survivalcoding.gangnam2kiandroidstudy.data.data_source.RecipeDataSource
import com.survivalcoding.gangnam2kiandroidstudy.data.data_source.RecipeIngredientDataSource
import org.koin.dsl.module

val dataSourceModule = module {
    single<RecipeDataSource> { MockRecipeDataSourceImpl() }
    single<IngredientDataSource> { MockIngredientDataSourceImpl() }
    single<RecipeIngredientDataSource> { MockRecipeIngredientDataSourceImpl() }
    single<ChefDataSource> { MockChefDataSourceImpl() }
    single<ProcedureDataSource> { MockProcedureDataSourceImpl() }
}