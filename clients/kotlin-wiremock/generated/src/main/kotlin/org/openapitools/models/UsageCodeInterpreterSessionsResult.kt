@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class UsageCodeInterpreterSessionsResult(
    @field:JsonProperty("object")
    val `object`: kotlin.String,

    @field:JsonProperty("sessions")
    val sessions: kotlin.Int,

    @field:JsonProperty("project_id")
    val projectId: kotlin.String? = null,

)
