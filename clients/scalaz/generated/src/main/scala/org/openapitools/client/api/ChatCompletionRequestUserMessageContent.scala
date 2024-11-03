package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ChatCompletionRequestUserMessageContent._

case class ChatCompletionRequestUserMessageContent (
  
object ChatCompletionRequestUserMessageContent {
  import DateTimeCodecs._

  implicit val ChatCompletionRequestUserMessageContentCodecJson: CodecJson[ChatCompletionRequestUserMessageContent] = CodecJson.derive[ChatCompletionRequestUserMessageContent]
  implicit val ChatCompletionRequestUserMessageContentDecoder: EntityDecoder[ChatCompletionRequestUserMessageContent] = jsonOf[ChatCompletionRequestUserMessageContent]
  implicit val ChatCompletionRequestUserMessageContentEncoder: EntityEncoder[ChatCompletionRequestUserMessageContent] = jsonEncoderOf[ChatCompletionRequestUserMessageContent]
}
