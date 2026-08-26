@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class MessageDeltaContentImageFileObjectImageFile(
    @field:JsonProperty("file_id")
    val fileId: kotlin.String? = null,

    @field:JsonProperty("detail")
    val detail: kotlin.String? = Detail.auto,

)
