@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CreateBatchRequest(
    @field:JsonProperty("input_file_id")
    val inputFileId: kotlin.String,

    @field:JsonProperty("endpoint")
    val endpoint: kotlin.String,

    @field:JsonProperty("completion_window")
    val completionWindow: kotlin.String,

    @field:JsonProperty("metadata")
    val metadata: kotlin.collections.Map<kotlin.String, kotlin.String>? = null,

)
