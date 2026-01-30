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
 * The payload used to create the invite.
 * @param email The email invited to the organization.
 * @param role The role the email was invited to be. Is either `owner` or `member`.
 */
data class AuditLogInviteSentData(

    @Schema(example = "null", description = "The email invited to the organization.")
    @get:JsonProperty("email") val email: kotlin.String? = null,

    @Schema(example = "null", description = "The role the email was invited to be. Is either `owner` or `member`.")
    @get:JsonProperty("role") val role: kotlin.String? = null
) {

}

