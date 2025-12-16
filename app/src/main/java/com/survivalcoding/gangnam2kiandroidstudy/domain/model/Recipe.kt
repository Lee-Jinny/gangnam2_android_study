package com.survivalcoding.gangnam2kiandroidstudy.domain.model

import kotlinx.serialization.Serializable

@Serializable
data class Recipe(
    val title: String,
    val chef: String,
    val time: String,
    val rating: Double,
    val imageUrls: String,
    val createdAt: Long,
    val category: String,
    val homeImage: HomeImage,
)
