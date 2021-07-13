package model

import kotlinx.serialization.Serializable

@Serializable
data class Track(
    val track_id: Int,
    val track_name: String,
    val artist_name: String
)