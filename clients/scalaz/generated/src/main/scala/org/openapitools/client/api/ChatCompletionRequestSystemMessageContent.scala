package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ChatCompletionRequestSystemMessageContent._

case class ChatCompletionRequestSystemMessageContent (
  
object ChatCompletionRequestSystemMessageContent {
  import DateTimeCodecs._

  implicit val ChatCompletionRequestSystemMessageContentCodecJson: CodecJson[ChatCompletionRequestSystemMessageContent] = CodecJson.derive[ChatCompletionRequestSystemMessageContent]
  implicit val ChatCompletionRequestSystemMessageContentDecoder: EntityDecoder[ChatCompletionRequestSystemMessageContent] = jsonOf[ChatCompletionRequestSystemMessageContent]
  implicit val ChatCompletionRequestSystemMessageContentEncoder: EntityEncoder[ChatCompletionRequestSystemMessageContent] = jsonEncoderOf[ChatCompletionRequestSystemMessageContent]
}
