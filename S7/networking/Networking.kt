package networking

import networking.Endpoints.Endpoints.getAlbumsByArtistId
import networking.Endpoints.Endpoints.getArtistByName
import networking.Endpoints.Endpoints.getLyricsByTrackId
import networking.Endpoints.Endpoints.getTracksByAlbumId
import networking.Endpoints.Endpoints.getTracksByName
import networking.Endpoints.Endpoints.getTracksByTop5
import utils.JSONArray
import utils.JSONObject
import java.net.URI
import java.net.http.HttpClient
import java.net.http.HttpRequest
import java.net.http.HttpResponse

class Networking {
    companion object Networking {

        private const val API_KEY = "5e3805cb43c8c2f1b13158bb210b774b"
        private const val API_ENDPOINT = "https://api.musixmatch.com/ws/1.1/"
        private fun generateAPIEndpoint(route: String): String = "$API_ENDPOINT$route$API_KEY"

        internal fun makeHTTPRequest(pathKey: String, parameter: Any, encode: Boolean = false): HttpResponse<String> {
            val searchParameter: Any =
                if (encode && parameter::class.simpleName == "String") java.net.URLEncoder.encode(
                    parameter as String,
                    "utf-8"
                ) else parameter
            val route = when (pathKey) {
                "get_artist_by_name" -> getArtistByName(searchParameter as String)
                "get_albums_by_artist_id" -> getAlbumsByArtistId(searchParameter as Int)
                "get_lyrics_by_track_id" -> getLyricsByTrackId(searchParameter as Int)
                "get_tracks_by_album_id" -> getTracksByAlbumId(searchParameter as Int)
                "get_tracks_by_name" -> getTracksByName(searchParameter as String)
                "get_tracks_by_top_5" -> getTracksByTop5()
                else -> ""
            }

            val apiEndpoint = generateAPIEndpoint(route)
            val client = HttpClient.newBuilder().build()
            val request = HttpRequest.newBuilder()
                .uri(URI.create(apiEndpoint))
                .build()

            return client.send(request, HttpResponse.BodyHandlers.ofString())
        }

        internal fun getStatusCode(response: HttpResponse<String>): Int {
            return JSONObject(response.body())
                .getJSONObject("message")
                .getJSONObject("header")["status_code"]
                .toString()
                .toInt()
        }

        internal fun getArrayResponse(response: HttpResponse<String>, filterKey: String): JSONArray {
            return JSONObject(response.body())
                .getJSONObject("message")
                .getJSONObject("body")
                .getJSONArray(filterKey)
        }

        internal fun getObjectResponse(response: HttpResponse<String>, filterKey: String): JSONObject {
            return JSONObject(response.body())
                .getJSONObject("message")
                .getJSONObject("body")
                .getJSONObject(filterKey)
        }
    }
}


