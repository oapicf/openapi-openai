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
 * The payload used to create the project.
 * @param name The project name.
 * @param title The title of the project as seen on the dashboard.
 */
data class AuditLogProjectCreatedData(

    @Schema(example = "null", description = "The project name.")
    @get:JsonProperty("name") val name: kotlin.String? = null,

    @Schema(example = "null", description = "The title of the project as seen on the dashboard.")
    @get:JsonProperty("title") val title: kotlin.String? = null
) {

}

