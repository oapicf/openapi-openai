@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class Image(
    @field:JsonProperty("b64_json")
    val b64Json: kotlin.String? = null,

    @field:JsonProperty("url")
    val url: kotlin.String? = null,

    @field:JsonProperty("revised_prompt")
    val revisedPrompt: kotlin.String? = null,

)
