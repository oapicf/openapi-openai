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
 * The project that the action was scoped to. Absent for actions not scoped to projects.
 * @param id The project ID.
 * @param name The project title.
 */
data class AuditLogProject(

    @Schema(example = "null", description = "The project ID.")
    @get:JsonProperty("id") val id: kotlin.String? = null,

    @Schema(example = "null", description = "The project title.")
    @get:JsonProperty("name") val name: kotlin.String? = null
) {

}

