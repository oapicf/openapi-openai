@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class RunStepDetailsToolCallsFileSearchResultObject(
    @field:JsonProperty("file_id")
    val fileId: kotlin.String,

    @field:JsonProperty("file_name")
    val fileName: kotlin.String,

    @field:JsonProperty("score")
    val score: java.math.BigDecimal,

    @field:JsonProperty("content")
    val content: kotlin.collections.List<RunStepDetailsToolCallsFileSearchResultObjectContentInner>? = null,

)
