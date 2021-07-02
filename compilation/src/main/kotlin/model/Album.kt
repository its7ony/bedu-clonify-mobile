package model

import kotlinx.serialization.Serializable

@Serializable
data class Album(
    val album_id: Int,
    val album_name: String
)