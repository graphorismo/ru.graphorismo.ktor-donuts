package ru.graphorismo.model

import kotlinx.serialization.Serializable

@Serializable
data class Donut(
    val name: String,
    val description: String,
    val imageUrl: String
) {
}