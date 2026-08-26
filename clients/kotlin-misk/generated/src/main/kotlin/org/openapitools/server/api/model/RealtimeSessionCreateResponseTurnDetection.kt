package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class RealtimeSessionCreateResponseTurnDetection(
    /** Type of turn detection, only &#x60;server_vad&#x60; is currently supported.  */
    val type: kotlin.String? = null,
    /** Activation threshold for VAD (0.0 to 1.0), this defaults to 0.5. A  higher threshold will require louder audio to activate the model, and  thus might perform better in noisy environments.  */
    val threshold: java.math.BigDecimal? = null,
    /** Amount of audio to include before the VAD detected speech (in  milliseconds). Defaults to 300ms.  */
    val prefixPaddingMs: kotlin.Int? = null,
    /** Duration of silence to detect speech stop (in milliseconds). Defaults  to 500ms. With shorter values the model will respond more quickly,  but may jump in on short pauses from the user.  */
    val silenceDurationMs: kotlin.Int? = null
)
