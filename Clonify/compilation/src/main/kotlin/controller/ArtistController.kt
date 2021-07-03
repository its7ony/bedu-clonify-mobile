package controller

import `ui `.buttonBox
import `ui `.topBox
import model.Artist
import networking.Networking.Networking.getArrayResponse
import networking.Networking.Networking.getStatusCode
import networking.Networking.Networking.makeHTTPRequest

class ArtistController {

    fun getArtistByName(artistName: String, callback: (Artist?) -> Unit) {
        try {
            val response =  makeHTTPRequest("get_artist_by_name",artistName,true)
            if (getStatusCode(response) == 200) {
                val jsonResponse = getArrayResponse(response,"artist_list")
                if (jsonResponse.size() > 0) {

                    val artist = jsonResponse
                        .getJSONObject(0)
                        .getJSONObject("artist")

                    val id = artist["artist_id"].toString()
                    val name = artist["artist_name"].toString()

                    callback(Artist(id.toInt(), name))

                } else callback(null)

            } else callback(null)

        } catch (ex: Exception) {
            topBox()
            println(" ⚠ Ha sucedido un error al intentar obtener información. Intente con otro elemento ⚠ \n${ex.message.toString()}")
            buttonBox()
            callback(null)
        }
    }
}