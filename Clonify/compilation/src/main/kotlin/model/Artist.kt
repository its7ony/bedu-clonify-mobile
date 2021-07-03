package model

import kotlinx.serialization.Serializable

@Serializable
data class Artist(
    val artist_id: Int,
    val artist_name: String
)