package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ChatCompletionRequestAssistantMessageContent._

case class ChatCompletionRequestAssistantMessageContent (
  
object ChatCompletionRequestAssistantMessageContent {
  import DateTimeCodecs._

  implicit val ChatCompletionRequestAssistantMessageContentCodecJson: CodecJson[ChatCompletionRequestAssistantMessageContent] = CodecJson.derive[ChatCompletionRequestAssistantMessageContent]
  implicit val ChatCompletionRequestAssistantMessageContentDecoder: EntityDecoder[ChatCompletionRequestAssistantMessageContent] = jsonOf[ChatCompletionRequestAssistantMessageContent]
  implicit val ChatCompletionRequestAssistantMessageContentEncoder: EntityEncoder[ChatCompletionRequestAssistantMessageContent] = jsonEncoderOf[ChatCompletionRequestAssistantMessageContent]
}
