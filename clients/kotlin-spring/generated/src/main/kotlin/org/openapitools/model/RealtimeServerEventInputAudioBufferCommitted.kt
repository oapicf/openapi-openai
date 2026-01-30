package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
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
 * Returned when an input audio buffer is committed, either by the client or  automatically in server VAD mode. The `item_id` property is the ID of the user message item that will be created, thus a `conversation.item.created` event  will also be sent to the client. 
 * @param eventId The unique ID of the server event.
 * @param type The event type, must be `input_audio_buffer.committed`.
 * @param previousItemId The ID of the preceding item after which the new item will be inserted. 
 * @param itemId The ID of the user message item that will be created.
 */
data class RealtimeServerEventInputAudioBufferCommitted(

    @Schema(example = "null", required = true, description = "The unique ID of the server event.")
    @get:JsonProperty("event_id", required = true) val eventId: kotlin.String,

    @Schema(example = "null", required = true, description = "The event type, must be `input_audio_buffer.committed`.")
    @get:JsonProperty("type", required = true) val type: RealtimeServerEventInputAudioBufferCommitted.Type,

    @Schema(example = "null", required = true, description = "The ID of the preceding item after which the new item will be inserted. ")
    @get:JsonProperty("previous_item_id", required = true) val previousItemId: kotlin.String,

    @Schema(example = "null", required = true, description = "The ID of the user message item that will be created.")
    @get:JsonProperty("item_id", required = true) val itemId: kotlin.String
) {

    /**
    * The event type, must be `input_audio_buffer.committed`.
    * Values: input_audio_bufferPeriodCommitted
    */
    enum class Type(@get:JsonValue val value: kotlin.String) {

        input_audio_bufferPeriodCommitted("input_audio_buffer.committed");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Type {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'RealtimeServerEventInputAudioBufferCommitted'")
            }
        }
    }

}

