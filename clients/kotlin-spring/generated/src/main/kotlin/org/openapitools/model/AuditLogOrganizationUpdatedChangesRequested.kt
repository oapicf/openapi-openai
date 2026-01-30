package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.AuditLogOrganizationUpdatedChangesRequestedSettings
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
 * The payload used to update the organization settings.
 * @param title The organization title.
 * @param description The organization description.
 * @param name The organization name.
 * @param settings 
 */
data class AuditLogOrganizationUpdatedChangesRequested(

    @Schema(example = "null", description = "The organization title.")
    @get:JsonProperty("title") val title: kotlin.String? = null,

    @Schema(example = "null", description = "The organization description.")
    @get:JsonProperty("description") val description: kotlin.String? = null,

    @Schema(example = "null", description = "The organization name.")
    @get:JsonProperty("name") val name: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("settings") val settings: AuditLogOrganizationUpdatedChangesRequestedSettings? = null
) {

}

