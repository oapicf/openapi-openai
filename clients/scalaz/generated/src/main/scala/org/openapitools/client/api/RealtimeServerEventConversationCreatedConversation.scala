package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import RealtimeServerEventConversationCreatedConversation._

case class RealtimeServerEventConversationCreatedConversation (
  /* The unique ID of the conversation. */
  id: Option[String],
/* The object type, must be `realtime.conversation`. */
  `object`: Option[String])

object RealtimeServerEventConversationCreatedConversation {
  import DateTimeCodecs._

  implicit val RealtimeServerEventConversationCreatedConversationCodecJson: CodecJson[RealtimeServerEventConversationCreatedConversation] = CodecJson.derive[RealtimeServerEventConversationCreatedConversation]
  implicit val RealtimeServerEventConversationCreatedConversationDecoder: EntityDecoder[RealtimeServerEventConversationCreatedConversation] = jsonOf[RealtimeServerEventConversationCreatedConversation]
  implicit val RealtimeServerEventConversationCreatedConversationEncoder: EntityEncoder[RealtimeServerEventConversationCreatedConversation] = jsonEncoderOf[RealtimeServerEventConversationCreatedConversation]
}
