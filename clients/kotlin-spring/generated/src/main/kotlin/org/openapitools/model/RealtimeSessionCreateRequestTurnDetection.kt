package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid
import io.swagger.v3.oas.annotations.media.Schema

/**
 * Configuration for turn detection. Can be set to `null` to turn off. Server  VAD means that the model will detect the start and end of speech based on  audio volume and respond at the end of user speech. 
 * @param type Type of turn detection, only `server_vad` is currently supported. 
 * @param threshold Activation threshold for VAD (0.0 to 1.0), this defaults to 0.5. A  higher threshold will require louder audio to activate the model, and  thus might perform better in noisy environments. 
 * @param prefixPaddingMs Amount of audio to include before the VAD detected speech (in  milliseconds). Defaults to 300ms. 
 * @param silenceDurationMs Duration of silence to detect speech stop (in milliseconds). Defaults  to 500ms. With shorter values the model will respond more quickly,  but may jump in on short pauses from the user. 
 * @param createResponse Whether or not to automatically generate a response when VAD is enabled. `true` by default. 
 */
data class RealtimeSessionCreateRequestTurnDetection(

    @Schema(example = "null", description = "Type of turn detection, only `server_vad` is currently supported. ")
    @get:JsonProperty("type") val type: kotlin.String? = null,

    @Schema(example = "null", description = "Activation threshold for VAD (0.0 to 1.0), this defaults to 0.5. A  higher threshold will require louder audio to activate the model, and  thus might perform better in noisy environments. ")
    @get:JsonProperty("threshold") val threshold: java.math.BigDecimal? = null,

    @Schema(example = "null", description = "Amount of audio to include before the VAD detected speech (in  milliseconds). Defaults to 300ms. ")
    @get:JsonProperty("prefix_padding_ms") val prefixPaddingMs: kotlin.Int? = null,

    @Schema(example = "null", description = "Duration of silence to detect speech stop (in milliseconds). Defaults  to 500ms. With shorter values the model will respond more quickly,  but may jump in on short pauses from the user. ")
    @get:JsonProperty("silence_duration_ms") val silenceDurationMs: kotlin.Int? = null,

    @Schema(example = "null", description = "Whether or not to automatically generate a response when VAD is enabled. `true` by default. ")
    @get:JsonProperty("create_response") val createResponse: kotlin.Boolean? = true
) {

}

