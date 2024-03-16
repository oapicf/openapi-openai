package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CreateChatCompletionStreamResponse._

case class CreateChatCompletionStreamResponse (
  id: String,
`object`: String,
created: Integer,
model: String,
choices: List[CreateChatCompletionStreamResponseChoicesInner])

object CreateChatCompletionStreamResponse {
  import DateTimeCodecs._

  implicit val CreateChatCompletionStreamResponseCodecJson: CodecJson[CreateChatCompletionStreamResponse] = CodecJson.derive[CreateChatCompletionStreamResponse]
  implicit val CreateChatCompletionStreamResponseDecoder: EntityDecoder[CreateChatCompletionStreamResponse] = jsonOf[CreateChatCompletionStreamResponse]
  implicit val CreateChatCompletionStreamResponseEncoder: EntityEncoder[CreateChatCompletionStreamResponse] = jsonEncoderOf[CreateChatCompletionStreamResponse]
}
