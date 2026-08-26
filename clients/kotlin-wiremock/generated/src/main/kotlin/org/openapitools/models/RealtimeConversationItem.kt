@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class RealtimeConversationItem(
    @field:JsonProperty("id")
    val id: kotlin.String? = null,

    @field:JsonProperty("type")
    val type: kotlin.String? = null,

    @field:JsonProperty("object")
    val `object`: kotlin.String? = null,

    @field:JsonProperty("status")
    val status: kotlin.String? = null,

    @field:JsonProperty("role")
    val role: kotlin.String? = null,

    @field:JsonProperty("content")
    val content: kotlin.collections.List<RealtimeConversationItemContentInner>? = null,

    @field:JsonProperty("call_id")
    val callId: kotlin.String? = null,

    @field:JsonProperty("name")
    val name: kotlin.String? = null,

    @field:JsonProperty("arguments")
    val arguments: kotlin.String? = null,

    @field:JsonProperty("output")
    val output: kotlin.String? = null,

)
