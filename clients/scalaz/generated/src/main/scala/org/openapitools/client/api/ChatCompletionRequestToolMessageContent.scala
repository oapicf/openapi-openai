package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ChatCompletionRequestToolMessageContent._

case class ChatCompletionRequestToolMessageContent (
  
object ChatCompletionRequestToolMessageContent {
  import DateTimeCodecs._

  implicit val ChatCompletionRequestToolMessageContentCodecJson: CodecJson[ChatCompletionRequestToolMessageContent] = CodecJson.derive[ChatCompletionRequestToolMessageContent]
  implicit val ChatCompletionRequestToolMessageContentDecoder: EntityDecoder[ChatCompletionRequestToolMessageContent] = jsonOf[ChatCompletionRequestToolMessageContent]
  implicit val ChatCompletionRequestToolMessageContentEncoder: EntityEncoder[ChatCompletionRequestToolMessageContent] = jsonEncoderOf[ChatCompletionRequestToolMessageContent]
}
