@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class RealtimeResponseCreateParamsToolsInner(
    @field:JsonProperty("type")
    val type: kotlin.String? = null,

    @field:JsonProperty("name")
    val name: kotlin.String? = null,

    @field:JsonProperty("description")
    val description: kotlin.String? = null,

    @field:JsonProperty("parameters")
    val parameters: kotlin.Any? = null,

)
