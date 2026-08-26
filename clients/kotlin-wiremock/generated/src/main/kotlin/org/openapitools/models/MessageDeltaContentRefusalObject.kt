@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class MessageDeltaContentRefusalObject(
    @field:JsonProperty("index")
    val index: kotlin.Int,

    @field:JsonProperty("type")
    val type: kotlin.String,

    @field:JsonProperty("refusal")
    val refusal: kotlin.String? = null,

)
