package model

import kotlinx.serialization.Serializable

@Serializable
data class Lyrics(
    val lyrics_body: String,
    val explicit: Boolean
)