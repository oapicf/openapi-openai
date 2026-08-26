@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CreateUploadRequest(
    @field:JsonProperty("filename")
    val filename: kotlin.String,

    @field:JsonProperty("purpose")
    val purpose: kotlin.String,

    @field:JsonProperty("bytes")
    val bytes: kotlin.Int,

    @field:JsonProperty("mime_type")
    val mimeType: kotlin.String,

)
