package controller

import `ui `.buttonBox
import `ui `.topBox
import model.Lyrics
import networking.Networking.Networking.getObjectResponse
import networking.Networking.Networking.getStatusCode
import networking.Networking.Networking.makeHTTPRequest

class LyricsController {

    fun getLyricsByTrackId(trackId: Int, callback: (Lyrics?) -> Unit) {
        try {
            val response = makeHTTPRequest("get_lyrics_by_track_id", trackId)
            if (getStatusCode(response) == 200) {
                val jsonResponse = getObjectResponse(response, "lyrics")

                if (jsonResponse.size() > 0) {
                    val lyrics = jsonResponse["lyrics_body"].toString()
                    val isExplicit = jsonResponse["explicit"].toString() == "1"
                    callback(Lyrics(lyrics, isExplicit))
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