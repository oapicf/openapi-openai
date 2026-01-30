package model

import play.api.libs.json._

/**
  * Returned when an input audio buffer is committed, either by the client or  automatically in server VAD mode. The `item_id` property is the ID of the user message item that will be created, thus a `conversation.item.created` event  will also be sent to the client. 
  * @param eventId The unique ID of the server event.
  * @param `type` The event type, must be `input_audio_buffer.committed`.
  * @param previousItemId The ID of the preceding item after which the new item will be inserted. 
  * @param itemId The ID of the user message item that will be created.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class RealtimeServerEventInputAudioBufferCommitted(
  eventId: String,
  `type`: RealtimeServerEventInputAudioBufferCommitted.Type.Value,
  previousItemId: String,
  itemId: String
)

object RealtimeServerEventInputAudioBufferCommitted {
  implicit lazy val realtimeServerEventInputAudioBufferCommittedJsonFormat: Format[RealtimeServerEventInputAudioBufferCommitted] = Json.format[RealtimeServerEventInputAudioBufferCommitted]

  // noinspection TypeAnnotation
  object Type extends Enumeration {
    val InputAudioBufferCommitted = Value("input_audio_buffer.committed")

    type Type = Value
    implicit lazy val TypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

