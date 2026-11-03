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
 * The details for events with this `type`.
 * @param errorCode The error code of the failure.
 * @param errorMessage The error message of the failure.
 */
data class AuditLogLoginFailed(

    @Schema(description = "The error code of the failure.")
    @param:JsonProperty("error_code")
    @get:JsonProperty("error_code") val errorCode: kotlin.String? = null,

    @Schema(description = "The error message of the failure.")
    @param:JsonProperty("error_message")
    @get:JsonProperty("error_message") val errorMessage: kotlin.String? = null
) {

}

