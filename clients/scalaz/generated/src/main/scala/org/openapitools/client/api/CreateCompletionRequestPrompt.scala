package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CreateCompletionRequestPrompt._

case class CreateCompletionRequestPrompt (
  
object CreateCompletionRequestPrompt {
  import DateTimeCodecs._

  implicit val CreateCompletionRequestPromptCodecJson: CodecJson[CreateCompletionRequestPrompt] = CodecJson.derive[CreateCompletionRequestPrompt]
  implicit val CreateCompletionRequestPromptDecoder: EntityDecoder[CreateCompletionRequestPrompt] = jsonOf[CreateCompletionRequestPrompt]
  implicit val CreateCompletionRequestPromptEncoder: EntityEncoder[CreateCompletionRequestPrompt] = jsonEncoderOf[CreateCompletionRequestPrompt]
}
