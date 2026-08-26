@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class RunObjectLastError(
    @field:JsonProperty("code")
    val code: kotlin.String,

    @field:JsonProperty("message")
    val message: kotlin.String,

)
