package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.RealtimeServerEventConversationCreatedConversation
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
 * Returned when a conversation is created. Emitted right after session creation. 
 * @param eventId The unique ID of the server event.
 * @param type The event type, must be `conversation.created`.
 * @param conversation 
 */
data class RealtimeServerEventConversationCreated(

    @Schema(example = "null", required = true, description = "The unique ID of the server event.")
    @get:JsonProperty("event_id", required = true) val eventId: kotlin.String,

    @Schema(example = "null", required = true, description = "The event type, must be `conversation.created`.")
    @get:JsonProperty("type", required = true) val type: RealtimeServerEventConversationCreated.Type,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("conversation", required = true) val conversation: RealtimeServerEventConversationCreatedConversation
) {

    /**
    * The event type, must be `conversation.created`.
    * Values: conversationPeriodCreated
    */
    enum class Type(@get:JsonValue val value: kotlin.String) {

        conversationPeriodCreated("conversation.created");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Type {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'RealtimeServerEventConversationCreated'")
            }
        }
    }

}

