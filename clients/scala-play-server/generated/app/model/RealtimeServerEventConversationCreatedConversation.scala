package model

import play.api.libs.json._

/**
  * The conversation resource.
  * @param id The unique ID of the conversation.
  * @param `object` The object type, must be `realtime.conversation`.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:38:29.809972473Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class RealtimeServerEventConversationCreatedConversation(
  id: Option[String],
  `object`: Option[String]
)

object RealtimeServerEventConversationCreatedConversation {
  implicit lazy val realtimeServerEventConversationCreatedConversationJsonFormat: Format[RealtimeServerEventConversationCreatedConversation] = Json.format[RealtimeServerEventConversationCreatedConversation]
}

