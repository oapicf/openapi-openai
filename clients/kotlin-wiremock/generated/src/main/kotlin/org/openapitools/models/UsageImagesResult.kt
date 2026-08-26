@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class UsageImagesResult(
    @field:JsonProperty("object")
    val `object`: kotlin.String,

    @field:JsonProperty("images")
    val images: kotlin.Int,

    @field:JsonProperty("num_model_requests")
    val numModelRequests: kotlin.Int,

    @field:JsonProperty("source")
    val source: kotlin.String? = null,

    @field:JsonProperty("size")
    val propertySize: kotlin.String? = null,

    @field:JsonProperty("project_id")
    val projectId: kotlin.String? = null,

    @field:JsonProperty("user_id")
    val userId: kotlin.String? = null,

    @field:JsonProperty("api_key_id")
    val apiKeyId: kotlin.String? = null,

    @field:JsonProperty("model")
    val model: kotlin.String? = null,

)
