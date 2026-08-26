@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class Error(
    @field:JsonProperty("code")
    val code: kotlin.String,

    @field:JsonProperty("message")
    val message: kotlin.String,

    @field:JsonProperty("param")
    val `param`: kotlin.String,

    @field:JsonProperty("type")
    val type: kotlin.String,

)
