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
 * The user who performed the audit logged action.
 * @param id The user id.
 * @param email The user email.
 */
data class AuditLogActorUser(

    @Schema(example = "null", description = "The user id.")
    @get:JsonProperty("id") val id: kotlin.String? = null,

    @Schema(example = "null", description = "The user email.")
    @get:JsonProperty("email") val email: kotlin.String? = null
) {

}

