package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CreateChatCompletionResponse._

case class CreateChatCompletionResponse (
  id: String,
`object`: String,
created: Integer,
model: String,
choices: List[CreateChatCompletionResponseChoicesInner],
usage: Option[CreateCompletionResponseUsage])

object CreateChatCompletionResponse {
  import DateTimeCodecs._

  implicit val CreateChatCompletionResponseCodecJson: CodecJson[CreateChatCompletionResponse] = CodecJson.derive[CreateChatCompletionResponse]
  implicit val CreateChatCompletionResponseDecoder: EntityDecoder[CreateChatCompletionResponse] = jsonOf[CreateChatCompletionResponse]
  implicit val CreateChatCompletionResponseEncoder: EntityEncoder[CreateChatCompletionResponse] = jsonEncoderOf[CreateChatCompletionResponse]
}
