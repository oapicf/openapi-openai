@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class RealtimeResponse(
    @field:JsonProperty("id")
    val id: kotlin.String? = null,

    @field:JsonProperty("object")
    val `object`: kotlin.String? = null,

    @field:JsonProperty("status")
    val status: kotlin.String? = null,

    @field:JsonProperty("status_details")
    val statusDetails: RealtimeResponseStatusDetails? = null,

    @field:JsonProperty("output")
    val output: kotlin.collections.List<RealtimeConversationItem>? = null,

    @field:JsonProperty("metadata")
    val metadata: kotlin.Any? = null,

    @field:JsonProperty("usage")
    val usage: RealtimeResponseUsage? = null,

)
