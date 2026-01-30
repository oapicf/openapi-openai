package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.AuditLogOrganizationUpdatedChangesRequested
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
 * @param id The organization ID.
 * @param changesRequested 
 */
data class AuditLogOrganizationUpdated(

    @Schema(example = "null", description = "The organization ID.")
    @get:JsonProperty("id") val id: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("changes_requested") val changesRequested: AuditLogOrganizationUpdatedChangesRequested? = null
) {

}

