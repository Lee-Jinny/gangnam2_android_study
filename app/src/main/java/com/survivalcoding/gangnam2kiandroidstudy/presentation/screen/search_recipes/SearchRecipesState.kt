package com.survivalcoding.gangnam2kiandroidstudy.presentation.screen.search_recipes

import com.survivalcoding.gangnam2kiandroidstudy.R
import com.survivalcoding.gangnam2kiandroidstudy.data.model.RecipeCard

data class SearchRecipesState(
    val recipes: List<RecipeCard> = emptyList(), // 전체 레시피 목록
    val filteredRecipes: List<RecipeCard> = emptyList(), // 검색된 목록
    val searchKeyword: String = "",
    val isLoading: Boolean = false, // 로딩 여부
    val showBottomSheet: Boolean = false
) {
    // 검색어 유무에 따라 UI 문구 결정
    val headerTitleRes: Int
        get() = if (searchKeyword.isBlank())
            R.string.recent_search_subtitle
        else
            R.string.search_result_subtitle

    // 검색 결과 개수
    val resultCountResId: Int?
        get() = if (searchKeyword.isBlank()) null else R.string.result_count_format
}
