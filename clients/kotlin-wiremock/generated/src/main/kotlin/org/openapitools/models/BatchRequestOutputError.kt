@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class BatchRequestOutputError(
    @field:JsonProperty("code")
    val code: kotlin.String? = null,

    @field:JsonProperty("message")
    val message: kotlin.String? = null,

)
