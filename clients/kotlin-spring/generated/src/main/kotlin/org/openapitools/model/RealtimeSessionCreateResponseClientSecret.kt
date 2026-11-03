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
 * Ephemeral key returned by the API.
 * @param `value` Ephemeral key usable in client environments to authenticate connections to the Realtime API. Use this in client-side environments rather than a standard API token, which should only be used server-side. 
 * @param expiresAt Timestamp for when the token expires. Currently, all tokens expire after one minute. 
 */
data class RealtimeSessionCreateResponseClientSecret(

    @Schema(description = "Ephemeral key usable in client environments to authenticate connections to the Realtime API. Use this in client-side environments rather than a standard API token, which should only be used server-side. ")
    @param:JsonProperty("value")
    @get:JsonProperty("value") val `value`: kotlin.String? = null,

    @Schema(description = "Timestamp for when the token expires. Currently, all tokens expire after one minute. ")
    @param:JsonProperty("expires_at")
    @get:JsonProperty("expires_at") val expiresAt: kotlin.Int? = null
) {

}

