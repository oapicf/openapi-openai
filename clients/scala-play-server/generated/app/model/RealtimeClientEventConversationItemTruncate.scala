package model

import play.api.libs.json._

/**
  * Send this event to truncate a previous assistant message’s audio. The server  will produce audio faster than realtime, so this event is useful when the user  interrupts to truncate audio that has already been sent to the client but not  yet played. This will synchronize the server's understanding of the audio with  the client's playback.  Truncating audio will delete the server-side text transcript to ensure there  is not text in the context that hasn't been heard by the user.  If successful, the server will respond with a `conversation.item.truncated`  event.  
  * @param eventId Optional client-generated ID used to identify this event.
  * @param `type` The event type, must be `conversation.item.truncate`.
  * @param itemId The ID of the assistant message item to truncate. Only assistant message  items can be truncated. 
  * @param contentIndex The index of the content part to truncate. Set this to 0.
  * @param audioEndMs Inclusive duration up to which audio is truncated, in milliseconds. If  the audio_end_ms is greater than the actual audio duration, the server  will respond with an error. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class RealtimeClientEventConversationItemTruncate(
  eventId: Option[String],
  `type`: RealtimeClientEventConversationItemTruncate.Type.Value,
  itemId: String,
  contentIndex: Int,
  audioEndMs: Int
)

object RealtimeClientEventConversationItemTruncate {
  implicit lazy val realtimeClientEventConversationItemTruncateJsonFormat: Format[RealtimeClientEventConversationItemTruncate] = Json.format[RealtimeClientEventConversationItemTruncate]

  // noinspection TypeAnnotation
  object Type extends Enumeration {
    val ConversationItemTruncate = Value("conversation.item.truncate")

    type Type = Value
    implicit lazy val TypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

