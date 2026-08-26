@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class BatchRequestOutput(
    @field:JsonProperty("id")
    val id: kotlin.String? = null,

    @field:JsonProperty("custom_id")
    val customId: kotlin.String? = null,

    @field:JsonProperty("response")
    val response: BatchRequestOutputResponse? = null,

    @field:JsonProperty("error")
    val error: BatchRequestOutputError? = null,

)
