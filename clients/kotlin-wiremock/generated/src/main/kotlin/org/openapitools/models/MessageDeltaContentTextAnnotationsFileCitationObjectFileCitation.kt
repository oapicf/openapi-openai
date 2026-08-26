@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation(
    @field:JsonProperty("file_id")
    val fileId: kotlin.String? = null,

    @field:JsonProperty("quote")
    val quote: kotlin.String? = null,

)
