package model

import play.api.libs.json._

/**
  * Returned when an earlier assistant audio message item is truncated by the  client with a `conversation.item.truncate` event. This event is used to  synchronize the server's understanding of the audio with the client's playback.  This action will truncate the audio and remove the server-side text transcript  to ensure there is no text in the context that hasn't been heard by the user. 
  * @param eventId The unique ID of the server event.
  * @param `type` The event type, must be `conversation.item.truncated`.
  * @param itemId The ID of the assistant message item that was truncated.
  * @param contentIndex The index of the content part that was truncated.
  * @param audioEndMs The duration up to which the audio was truncated, in milliseconds. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class RealtimeServerEventConversationItemTruncated(
  eventId: String,
  `type`: RealtimeServerEventConversationItemTruncated.Type.Value,
  itemId: String,
  contentIndex: Int,
  audioEndMs: Int
)

object RealtimeServerEventConversationItemTruncated {
  implicit lazy val realtimeServerEventConversationItemTruncatedJsonFormat: Format[RealtimeServerEventConversationItemTruncated] = Json.format[RealtimeServerEventConversationItemTruncated]

  // noinspection TypeAnnotation
  object Type extends Enumeration {
    val ConversationItemTruncated = Value("conversation.item.truncated")

    type Type = Value
    implicit lazy val TypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

