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
 * Details of the transcription error.
 * @param type The type of error.
 * @param code Error code, if any.
 * @param message A human-readable error message.
 * @param `param` Parameter related to the error, if any.
 */
data class RealtimeServerEventConversationItemInputAudioTranscriptionFailedError(

    @Schema(description = "The type of error.")
    @param:JsonProperty("type")
    @get:JsonProperty("type") val type: kotlin.String? = null,

    @Schema(description = "Error code, if any.")
    @param:JsonProperty("code")
    @get:JsonProperty("code") val code: kotlin.String? = null,

    @Schema(description = "A human-readable error message.")
    @param:JsonProperty("message")
    @get:JsonProperty("message") val message: kotlin.String? = null,

    @Schema(description = "Parameter related to the error, if any.")
    @param:JsonProperty("param")
    @get:JsonProperty("param") val `param`: kotlin.String? = null
) {

}

