@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class TruncationObject(
    @field:JsonProperty("type")
    val type: kotlin.String,

    @field:JsonProperty("last_messages")
    val lastMessages: kotlin.Int? = null,

)
