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
 * The payload used to add the user to the project.
 * @param role The role of the user. Is either `owner` or `member`.
 */
data class AuditLogUserAddedData(

    @Schema(example = "null", description = "The role of the user. Is either `owner` or `member`.")
    @get:JsonProperty("role") val role: kotlin.String? = null
) {

}

