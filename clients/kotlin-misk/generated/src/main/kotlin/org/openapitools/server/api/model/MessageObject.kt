package org.openapitools.server.api.model

import org.openapitools.server.api.model.CreateMessageRequestAttachmentsInner
import org.openapitools.server.api.model.MessageObjectContentInner
import org.openapitools.server.api.model.MessageObjectIncompleteDetails
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class MessageObject(
    /** The identifier, which can be referenced in API endpoints. */
    val id: kotlin.String,
    /** The object type, which is always &#x60;thread.message&#x60;. */
    val `object`: kotlin.String,
    /** The Unix timestamp (in seconds) for when the message was created. */
    val createdAt: kotlin.Int,
    /** The [thread](/docs/api-reference/threads) ID that this message belongs to. */
    val threadId: kotlin.String,
    /** The status of the message, which can be either &#x60;in_progress&#x60;, &#x60;incomplete&#x60;, or &#x60;completed&#x60;. */
    val status: kotlin.String,
    val incompleteDetails: MessageObjectIncompleteDetails,
    /** The Unix timestamp (in seconds) for when the message was completed. */
    val completedAt: kotlin.Int,
    /** The Unix timestamp (in seconds) for when the message was marked as incomplete. */
    val incompleteAt: kotlin.Int,
    /** The entity that produced the message. One of &#x60;user&#x60; or &#x60;assistant&#x60;. */
    val role: kotlin.String,
    /** The content of the message in array of text and/or images. */
    val content: kotlin.collections.List<MessageObjectContentInner>,
    /** If applicable, the ID of the [assistant](/docs/api-reference/assistants) that authored this message. */
    val assistantId: kotlin.String,
    /** The ID of the [run](/docs/api-reference/runs) associated with the creation of this message. Value is &#x60;null&#x60; when messages are created manually using the create message or create thread endpoints. */
    val runId: kotlin.String,
    /** A list of files attached to the message, and the tools they were added to. */
    val attachments: kotlin.collections.List<CreateMessageRequestAttachmentsInner>,
    /** Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  */
    val metadata: kotlin.Any
)
