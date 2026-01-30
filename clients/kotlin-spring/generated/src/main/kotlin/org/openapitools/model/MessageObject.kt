package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.CreateMessageRequestAttachmentsInner
import org.openapitools.model.MessageObjectContentInner
import org.openapitools.model.MessageObjectIncompleteDetails
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid
import io.swagger.v3.oas.annotations.media.Schema

/**
 * Represents a message within a [thread](/docs/api-reference/threads).
 * @param id The identifier, which can be referenced in API endpoints.
 * @param &#x60;object&#x60; The object type, which is always `thread.message`.
 * @param createdAt The Unix timestamp (in seconds) for when the message was created.
 * @param threadId The [thread](/docs/api-reference/threads) ID that this message belongs to.
 * @param status The status of the message, which can be either `in_progress`, `incomplete`, or `completed`.
 * @param incompleteDetails 
 * @param completedAt The Unix timestamp (in seconds) for when the message was completed.
 * @param incompleteAt The Unix timestamp (in seconds) for when the message was marked as incomplete.
 * @param role The entity that produced the message. One of `user` or `assistant`.
 * @param content The content of the message in array of text and/or images.
 * @param assistantId If applicable, the ID of the [assistant](/docs/api-reference/assistants) that authored this message.
 * @param runId The ID of the [run](/docs/api-reference/runs) associated with the creation of this message. Value is `null` when messages are created manually using the create message or create thread endpoints.
 * @param attachments A list of files attached to the message, and the tools they were added to.
 * @param metadata Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
 */
data class MessageObject(

    @Schema(example = "null", required = true, description = "The identifier, which can be referenced in API endpoints.")
    @get:JsonProperty("id", required = true) val id: kotlin.String,

    @Schema(example = "null", required = true, description = "The object type, which is always `thread.message`.")
    @get:JsonProperty("object", required = true) val `object`: MessageObject.`Object`,

    @Schema(example = "null", required = true, description = "The Unix timestamp (in seconds) for when the message was created.")
    @get:JsonProperty("created_at", required = true) val createdAt: kotlin.Int,

    @Schema(example = "null", required = true, description = "The [thread](/docs/api-reference/threads) ID that this message belongs to.")
    @get:JsonProperty("thread_id", required = true) val threadId: kotlin.String,

    @Schema(example = "null", required = true, description = "The status of the message, which can be either `in_progress`, `incomplete`, or `completed`.")
    @get:JsonProperty("status", required = true) val status: MessageObject.Status,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("incomplete_details", required = true) val incompleteDetails: MessageObjectIncompleteDetails?,

    @Schema(example = "null", required = true, description = "The Unix timestamp (in seconds) for when the message was completed.")
    @get:JsonProperty("completed_at", required = true) val completedAt: kotlin.Int?,

    @Schema(example = "null", required = true, description = "The Unix timestamp (in seconds) for when the message was marked as incomplete.")
    @get:JsonProperty("incomplete_at", required = true) val incompleteAt: kotlin.Int?,

    @Schema(example = "null", required = true, description = "The entity that produced the message. One of `user` or `assistant`.")
    @get:JsonProperty("role", required = true) val role: MessageObject.Role,

    @field:Valid
    @Schema(example = "null", required = true, description = "The content of the message in array of text and/or images.")
    @get:JsonProperty("content", required = true) val content: kotlin.collections.List<MessageObjectContentInner>,

    @Schema(example = "null", required = true, description = "If applicable, the ID of the [assistant](/docs/api-reference/assistants) that authored this message.")
    @get:JsonProperty("assistant_id", required = true) val assistantId: kotlin.String?,

    @Schema(example = "null", required = true, description = "The ID of the [run](/docs/api-reference/runs) associated with the creation of this message. Value is `null` when messages are created manually using the create message or create thread endpoints.")
    @get:JsonProperty("run_id", required = true) val runId: kotlin.String?,

    @field:Valid
    @Schema(example = "null", required = true, description = "A list of files attached to the message, and the tools they were added to.")
    @get:JsonProperty("attachments", required = true) val attachments: kotlin.collections.List<CreateMessageRequestAttachmentsInner>?,

    @field:Valid
    @Schema(example = "null", required = true, description = "Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. ")
    @get:JsonProperty("metadata", required = true) val metadata: kotlin.Any?
) {

    /**
    * The object type, which is always `thread.message`.
    * Values: threadPeriodMessage
    */
    enum class `Object`(@get:JsonValue val value: kotlin.String) {

        threadPeriodMessage("thread.message");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): `Object` {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'MessageObject'")
            }
        }
    }

    /**
    * The status of the message, which can be either `in_progress`, `incomplete`, or `completed`.
    * Values: in_progress,incomplete,completed
    */
    enum class Status(@get:JsonValue val value: kotlin.String) {

        in_progress("in_progress"),
        incomplete("incomplete"),
        completed("completed");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Status {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'MessageObject'")
            }
        }
    }

    /**
    * The entity that produced the message. One of `user` or `assistant`.
    * Values: user,assistant
    */
    enum class Role(@get:JsonValue val value: kotlin.String) {

        user("user"),
        assistant("assistant");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Role {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'MessageObject'")
            }
        }
    }

}

