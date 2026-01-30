package model

import play.api.libs.json._

/**
  * Returned when a conversation is created. Emitted right after session creation. 
  * @param eventId The unique ID of the server event.
  * @param `type` The event type, must be `conversation.created`.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class RealtimeServerEventConversationCreated(
  eventId: String,
  `type`: RealtimeServerEventConversationCreated.Type.Value,
  conversation: RealtimeServerEventConversationCreatedConversation
)

object RealtimeServerEventConversationCreated {
  implicit lazy val realtimeServerEventConversationCreatedJsonFormat: Format[RealtimeServerEventConversationCreated] = Json.format[RealtimeServerEventConversationCreated]

  // noinspection TypeAnnotation
  object Type extends Enumeration {
    val ConversationCreated = Value("conversation.created")

    type Type = Value
    implicit lazy val TypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

