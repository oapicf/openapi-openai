@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OpenAIFile(
    @field:JsonProperty("id")
    val id: kotlin.String,

    @field:JsonProperty("bytes")
    val bytes: kotlin.Int,

    @field:JsonProperty("created_at")
    val createdAt: kotlin.Int,

    @field:JsonProperty("filename")
    val filename: kotlin.String,

    @field:JsonProperty("object")
    val `object`: kotlin.String,

    @field:JsonProperty("purpose")
    val purpose: kotlin.String,

    @field:JsonProperty("status")
    val status: kotlin.String,

    @field:JsonProperty("status_details")
    val statusDetails: kotlin.String? = null,

)
