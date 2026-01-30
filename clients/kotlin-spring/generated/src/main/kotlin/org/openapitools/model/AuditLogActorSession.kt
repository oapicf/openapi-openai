package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.AuditLogActorUser
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
 * The session in which the audit logged action was performed.
 * @param user 
 * @param ipAddress The IP address from which the action was performed.
 */
data class AuditLogActorSession(

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("user") val user: AuditLogActorUser? = null,

    @Schema(example = "null", description = "The IP address from which the action was performed.")
    @get:JsonProperty("ip_address") val ipAddress: kotlin.String? = null
) {

}

