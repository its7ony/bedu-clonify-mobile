package controller

import `ui `.buttonBox
import `ui `.topBox
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json
import model.Track
import networking.Networking.Networking.getArrayResponse
import networking.Networking.Networking.getStatusCode
import networking.Networking.Networking.makeHTTPRequest

class TrackController {

    fun getTracksByAlbumId(albumId: Int, callback: (List<Track>?) -> Unit){
        try {
            val response = makeHTTPRequest("get_tracks_by_album_id",albumId)
            if(getStatusCode(response) == 200){
                val jsonResponse = getArrayResponse(response,"track_list")
                if (jsonResponse.size() > 0){
                    val tracksResponse = jsonResponse.removeParameters(listOf("track_id", "track_name","artist_name"), "track")
                    callback(Json.decodeFromString<List<Track>>(tracksResponse.toString()))
                }else callback(null)

            }else callback(null)

        }catch (ex: Exception){
            println(" ⚠ Ha sucedido un error al intentar obtener información. Intente con otro elemento ⚠ \n${ex.message.toString()}")
            callback(null)
        }
    }

    fun getTracksByName(trackName: String, callback: (List<Track>?) -> Unit){
        try {
            val response = makeHTTPRequest("get_tracks_by_name",trackName, true)
            if (getStatusCode(response) == 200) {
                val jsonResponse = getArrayResponse(response,"track_list")
                if (jsonResponse.size() > 0) {
                    val tracksResponse =
                        jsonResponse.removeParameters(listOf("track_id", "track_name", "artist_name"), "track")
                    callback(Json.decodeFromString<List<Track>>(tracksResponse.toString()))
                } else callback(null)

            } else callback(null)

        }catch (ex: Exception){
            println(" ⚠ Ha sucedido un error al intentar obtener información. Intente con otro elemento ⚠ \n${ex.message.toString()}")
            callback(null)
        }
    }

    fun getTracksByTop5(callback: (List<Track>?) -> Unit){
        try {
            val response = makeHTTPRequest("get_tracks_by_top_5","")
            if(getStatusCode(response) == 200){
                val jsonResponse = getArrayResponse(response,"track_list")
                if (jsonResponse.size() > 0){
                    val tracksResponse = jsonResponse.removeParameters(listOf("track_id", "track_name","artist_name"), "track")
                    callback(Json.decodeFromString<List<Track>>(tracksResponse.toString()))
                }else callback(null)

            }else callback(null)

        }catch (ex: Exception){
            topBox()
            println(" ⚠ Ha sucedido un error al intentar obtener información. Intente con otro elemento ⚠ \n${ex.message.toString()}")
            buttonBox()
            callback(null)
        }
    }
}