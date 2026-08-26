@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class FineTuneCompletionRequestInput(
    @field:JsonProperty("prompt")
    val prompt: kotlin.String? = null,

    @field:JsonProperty("completion")
    val completion: kotlin.String? = null,

)
