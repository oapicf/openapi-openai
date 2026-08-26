@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ProjectServiceAccountDeleteResponse(
    @field:JsonProperty("object")
    val `object`: kotlin.String,

    @field:JsonProperty("id")
    val id: kotlin.String,

    @field:JsonProperty("deleted")
    val deleted: kotlin.Boolean,

)
