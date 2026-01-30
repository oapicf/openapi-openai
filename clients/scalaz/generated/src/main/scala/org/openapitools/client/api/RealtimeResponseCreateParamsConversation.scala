package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import RealtimeResponseCreateParamsConversation._

case class RealtimeResponseCreateParamsConversation (
  
object RealtimeResponseCreateParamsConversation {
  import DateTimeCodecs._

  implicit val RealtimeResponseCreateParamsConversationCodecJson: CodecJson[RealtimeResponseCreateParamsConversation] = CodecJson.derive[RealtimeResponseCreateParamsConversation]
  implicit val RealtimeResponseCreateParamsConversationDecoder: EntityDecoder[RealtimeResponseCreateParamsConversation] = jsonOf[RealtimeResponseCreateParamsConversation]
  implicit val RealtimeResponseCreateParamsConversationEncoder: EntityEncoder[RealtimeResponseCreateParamsConversation] = jsonEncoderOf[RealtimeResponseCreateParamsConversation]
}
