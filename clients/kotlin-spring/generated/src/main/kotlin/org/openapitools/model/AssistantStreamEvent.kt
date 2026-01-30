package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.DoneEvent
import org.openapitools.model.ErrorEvent
import org.openapitools.model.MessageStreamEvent
import org.openapitools.model.RunStepStreamEvent
import org.openapitools.model.RunStreamEvent
import org.openapitools.model.ThreadStreamEvent
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
 * Represents an event emitted when streaming a Run.  Each event in a server-sent events stream has an `event` and `data` property:  ``` event: thread.created data: {\"id\": \"thread_123\", \"object\": \"thread\", ...} ```  We emit events whenever a new object is created, transitions to a new state, or is being streamed in parts (deltas). For example, we emit `thread.run.created` when a new run is created, `thread.run.completed` when a run completes, and so on. When an Assistant chooses to create a message during a run, we emit a `thread.message.created event`, a `thread.message.in_progress` event, many `thread.message.delta` events, and finally a `thread.message.completed` event.  We may add additional events over time, so we recommend handling unknown events gracefully in your code. See the [Assistants API quickstart](/docs/assistants/overview) to learn how to integrate the Assistants API with streaming. 
 * @param event 
 * @param &#x60;data&#x60; 
 * @param enabled Whether to enable input audio transcription.
 */
data class AssistantStreamEvent(

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("event", required = true) val event: AssistantStreamEvent.Event,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("data", required = true) val `data`: AssistantStreamEvent.`Data`,

    @Schema(example = "null", description = "Whether to enable input audio transcription.")
    @get:JsonProperty("enabled") val enabled: kotlin.Boolean? = null
) {

    /**
    * 
    * Values: done
    */
    enum class Event(@get:JsonValue val value: kotlin.String) {

        done("done");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Event {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'AssistantStreamEvent'")
            }
        }
    }

    /**
    * 
    * Values: Left_Square_BracketDONERight_Square_Bracket
    */
    enum class `Data`(@get:JsonValue val value: kotlin.String) {

        Left_Square_BracketDONERight_Square_Bracket("[DONE]");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): `Data` {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'AssistantStreamEvent'")
            }
        }
    }

}

