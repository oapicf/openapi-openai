package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ChatCompletionRequestDeveloperMessageContent._

case class ChatCompletionRequestDeveloperMessageContent (
  
object ChatCompletionRequestDeveloperMessageContent {
  import DateTimeCodecs._

  implicit val ChatCompletionRequestDeveloperMessageContentCodecJson: CodecJson[ChatCompletionRequestDeveloperMessageContent] = CodecJson.derive[ChatCompletionRequestDeveloperMessageContent]
  implicit val ChatCompletionRequestDeveloperMessageContentDecoder: EntityDecoder[ChatCompletionRequestDeveloperMessageContent] = jsonOf[ChatCompletionRequestDeveloperMessageContent]
  implicit val ChatCompletionRequestDeveloperMessageContentEncoder: EntityEncoder[ChatCompletionRequestDeveloperMessageContent] = jsonEncoderOf[ChatCompletionRequestDeveloperMessageContent]
}
