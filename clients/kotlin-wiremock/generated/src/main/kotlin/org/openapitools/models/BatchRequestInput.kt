@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class BatchRequestInput(
    @field:JsonProperty("custom_id")
    val customId: kotlin.String? = null,

    @field:JsonProperty("method")
    val method: kotlin.String? = null,

    @field:JsonProperty("url")
    val url: kotlin.String? = null,

)
