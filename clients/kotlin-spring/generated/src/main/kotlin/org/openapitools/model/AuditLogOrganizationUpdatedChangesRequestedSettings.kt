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
 * 
 * @param threadsUiVisibility Visibility of the threads page which shows messages created with the Assistants API and Playground. One of `ANY_ROLE`, `OWNERS`, or `NONE`.
 * @param usageDashboardVisibility Visibility of the usage dashboard which shows activity and costs for your organization. One of `ANY_ROLE` or `OWNERS`.
 */
data class AuditLogOrganizationUpdatedChangesRequestedSettings(

    @Schema(example = "null", description = "Visibility of the threads page which shows messages created with the Assistants API and Playground. One of `ANY_ROLE`, `OWNERS`, or `NONE`.")
    @get:JsonProperty("threads_ui_visibility") val threadsUiVisibility: kotlin.String? = null,

    @Schema(example = "null", description = "Visibility of the usage dashboard which shows activity and costs for your organization. One of `ANY_ROLE` or `OWNERS`.")
    @get:JsonProperty("usage_dashboard_visibility") val usageDashboardVisibility: kotlin.String? = null
) {

}

