package controller

import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json
import model.Album
import networking.Networking.Networking.getArrayResponse
import networking.Networking.Networking.getStatusCode
import networking.Networking.Networking.makeHTTPRequest
import java.lang.Exception

class AlbumController {

    fun getAlbumsByArtistId(artistId: Int, callback: (List<Album>?) -> Unit) {
        try {
            val response = makeHTTPRequest("get_albums_by_artist_id",artistId)
            if (getStatusCode(response) == 200) {
                val jsonResponse = getArrayResponse(response,"album_list")
                if (jsonResponse.size() > 0) {
                    val albumsResponse = jsonResponse.removeParameters(listOf("album_id", "album_name"), "album")
                    callback(Json.decodeFromString<List<Album>>(albumsResponse.toString()))
                } else callback(null)

            } else callback(null)

        } catch (ex: Exception) {
            println("Ha sucedido un error al intentar obtener información. Intente con otro elemento\n${ex.message.toString()}")
            callback(null)
        }
    }
}