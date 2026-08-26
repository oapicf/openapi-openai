@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class MessageObject(
    @field:JsonProperty("id")
    val id: kotlin.String,

    @field:JsonProperty("object")
    val `object`: kotlin.String,

    @field:JsonProperty("created_at")
    val createdAt: kotlin.Int,

    @field:JsonProperty("thread_id")
    val threadId: kotlin.String,

    @field:JsonProperty("status")
    val status: kotlin.String,

    @field:JsonProperty("incomplete_details")
    val incompleteDetails: MessageObjectIncompleteDetails,

    @field:JsonProperty("completed_at")
    val completedAt: kotlin.Int,

    @field:JsonProperty("incomplete_at")
    val incompleteAt: kotlin.Int,

    @field:JsonProperty("role")
    val role: kotlin.String,

    @field:JsonProperty("content")
    val content: kotlin.collections.List<MessageObjectContentInner>,

    @field:JsonProperty("assistant_id")
    val assistantId: kotlin.String,

    @field:JsonProperty("run_id")
    val runId: kotlin.String,

    @field:JsonProperty("attachments")
    val attachments: kotlin.collections.List<CreateMessageRequestAttachmentsInner>,

    @field:JsonProperty("metadata")
    val metadata: kotlin.Any,

)
