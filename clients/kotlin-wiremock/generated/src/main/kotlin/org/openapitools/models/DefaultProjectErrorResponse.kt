@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class DefaultProjectErrorResponse(
    @field:JsonProperty("code")
    val code: kotlin.Int,

    @field:JsonProperty("message")
    val message: kotlin.String,

)
