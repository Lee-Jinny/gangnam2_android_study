package com.survivalcoding.gangnam2kiandroidstudy.core.di

import com.survivalcoding.gangnam2kiandroidstudy.domain.repository.BookmarkRepository
import com.survivalcoding.gangnam2kiandroidstudy.domain.repository.ChefRepository
import com.survivalcoding.gangnam2kiandroidstudy.domain.repository.IngredientRepository
import com.survivalcoding.gangnam2kiandroidstudy.domain.repository.ProcedureRepository
import com.survivalcoding.gangnam2kiandroidstudy.domain.repository.RecipeRepository
import com.survivalcoding.gangnam2kiandroidstudy.domain.use_case.GetRecipeDetailUseCase
import com.survivalcoding.gangnam2kiandroidstudy.domain.use_case.GetSavedRecipesUseCase
import com.survivalcoding.gangnam2kiandroidstudy.domain.use_case.ToggleBookmarkUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object UseCaseModule {
    @Provides
    fun provideGetRecipeDetailUseCase(
        recipeRepository: RecipeRepository,
        ingredientRepository: IngredientRepository,
        chefRepository: ChefRepository,
        procedureRepository: ProcedureRepository,
    ): GetRecipeDetailUseCase {
        return GetRecipeDetailUseCase(
            recipeRepository,
            ingredientRepository,
            chefRepository,
            procedureRepository
        )

    }

    @Provides
    fun provideGetSavedRecipeUseCase(
        bookmarkRepository: BookmarkRepository,
        recipeRepository: RecipeRepository
    ): GetSavedRecipesUseCase {
        return GetSavedRecipesUseCase(
            bookmarkRepository,
            recipeRepository
        )
    }

    @Provides
    fun provideToggleBookmarkUseCase(
        bookmarkRepository: BookmarkRepository
    ): ToggleBookmarkUseCase {
        return ToggleBookmarkUseCase(
            bookmarkRepository
        )
    }
}