@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class MessageDeltaContentTextObjectTextAnnotationsInner(
    @field:JsonProperty("index")
    val index: kotlin.Int,

    @field:JsonProperty("type")
    val type: kotlin.String,

    @field:JsonProperty("text")
    val text: kotlin.String? = null,

    @field:JsonProperty("file_citation")
    val fileCitation: MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation? = null,

    @field:JsonProperty("start_index")
    val startIndex: kotlin.Int? = null,

    @field:JsonProperty("end_index")
    val endIndex: kotlin.Int? = null,

    @field:JsonProperty("file_path")
    val filePath: MessageDeltaContentTextAnnotationsFilePathObjectFilePath? = null,

)
