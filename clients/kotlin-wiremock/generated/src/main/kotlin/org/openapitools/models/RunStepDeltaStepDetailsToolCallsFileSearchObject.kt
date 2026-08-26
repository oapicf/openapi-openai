@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class RunStepDeltaStepDetailsToolCallsFileSearchObject(
    @field:JsonProperty("index")
    val index: kotlin.Int,

    @field:JsonProperty("type")
    val type: kotlin.String,

    @field:JsonProperty("file_search")
    val fileSearch: kotlin.Any,

    @field:JsonProperty("id")
    val id: kotlin.String? = null,

)
