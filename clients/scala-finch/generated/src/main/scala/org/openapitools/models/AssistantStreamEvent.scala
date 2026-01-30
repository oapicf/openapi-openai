package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.DoneEvent
import org.openapitools.models.ErrorEvent
import org.openapitools.models.MessageStreamEvent
import org.openapitools.models.RunStepStreamEvent
import org.openapitools.models.RunStreamEvent
import org.openapitools.models.ThreadStreamEvent

/**
 * Represents an event emitted when streaming a Run.  Each event in a server-sent events stream has an `event` and `data` property:  ``` event: thread.created data: {\"id\": \"thread_123\", \"object\": \"thread\", ...} ```  We emit events whenever a new object is created, transitions to a new state, or is being streamed in parts (deltas). For example, we emit `thread.run.created` when a new run is created, `thread.run.completed` when a run completes, and so on. When an Assistant chooses to create a message during a run, we emit a `thread.message.created event`, a `thread.message.in_progress` event, many `thread.message.delta` events, and finally a `thread.message.completed` event.  We may add additional events over time, so we recommend handling unknown events gracefully in your code. See the [Assistants API quickstart](/docs/assistants/overview) to learn how to integrate the Assistants API with streaming. 
 * @param enabled Whether to enable input audio transcription.
 * @param event 
 * @param data 
 */
case class AssistantStreamEvent(enabled: Option[Boolean],
                event: String,
                data: String
                )

object AssistantStreamEvent {
    /**
     * Creates the codec for converting AssistantStreamEvent from and to JSON.
     */
    implicit val decoder: Decoder[AssistantStreamEvent] = deriveDecoder
    implicit val encoder: ObjectEncoder[AssistantStreamEvent] = deriveEncoder
}
