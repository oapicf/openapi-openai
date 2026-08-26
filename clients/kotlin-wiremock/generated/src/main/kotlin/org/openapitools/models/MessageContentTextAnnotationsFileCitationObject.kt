@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class MessageContentTextAnnotationsFileCitationObject(
    @field:JsonProperty("type")
    val type: kotlin.String,

    @field:JsonProperty("text")
    val text: kotlin.String,

    @field:JsonProperty("file_citation")
    val fileCitation: MessageContentTextAnnotationsFileCitationObjectFileCitation,

    @field:JsonProperty("start_index")
    val startIndex: kotlin.Int,

    @field:JsonProperty("end_index")
    val endIndex: kotlin.Int,

)
