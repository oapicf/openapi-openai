@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class AuditLogProjectCreatedData(
    @field:JsonProperty("name")
    val name: kotlin.String? = null,

    @field:JsonProperty("title")
    val title: kotlin.String? = null,

)
