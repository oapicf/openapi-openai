@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class FunctionObject(
    @field:JsonProperty("name")
    val name: kotlin.String,

    @field:JsonProperty("description")
    val description: kotlin.String? = null,

    @field:JsonProperty("parameters")
    val parameters: kotlin.collections.Map<kotlin.String, kotlin.Any>? = null,

    @field:JsonProperty("strict")
    val strict: kotlin.Boolean? = false,

)
