package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ChatCompletionRole._

case class ChatCompletionRole (
  
object ChatCompletionRole {
  import DateTimeCodecs._

  implicit val ChatCompletionRoleCodecJson: CodecJson[ChatCompletionRole] = CodecJson.derive[ChatCompletionRole]
  implicit val ChatCompletionRoleDecoder: EntityDecoder[ChatCompletionRole] = jsonOf[ChatCompletionRole]
  implicit val ChatCompletionRoleEncoder: EntityEncoder[ChatCompletionRole] = jsonEncoderOf[ChatCompletionRole]
}
