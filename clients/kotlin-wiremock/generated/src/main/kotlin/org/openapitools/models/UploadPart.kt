@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class UploadPart(
    @field:JsonProperty("id")
    val id: kotlin.String,

    @field:JsonProperty("created_at")
    val createdAt: kotlin.Int,

    @field:JsonProperty("upload_id")
    val uploadId: kotlin.String,

    @field:JsonProperty("object")
    val `object`: kotlin.String,

)
