package model

import play.api.libs.json._

/**
  * The conversation resource.
  * @param id The unique ID of the conversation.
  * @param `object` The object type, must be `realtime.conversation`.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-26T05:22:02.282422614Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class RealtimeServerEventConversationCreatedConversation(
  id: Option[String],
  `object`: Option[String]
)

object RealtimeServerEventConversationCreatedConversation {
  implicit lazy val realtimeServerEventConversationCreatedConversationJsonFormat: Format[RealtimeServerEventConversationCreatedConversation] = Json.format[RealtimeServerEventConversationCreatedConversation]
}

