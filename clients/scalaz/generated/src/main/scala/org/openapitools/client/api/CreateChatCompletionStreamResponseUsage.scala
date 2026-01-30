package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CreateChatCompletionStreamResponseUsage._

case class CreateChatCompletionStreamResponseUsage (
  /* Number of tokens in the generated completion. */
  completionTokens: Integer,
/* Number of tokens in the prompt. */
  promptTokens: Integer,
/* Total number of tokens used in the request (prompt + completion). */
  totalTokens: Integer)

object CreateChatCompletionStreamResponseUsage {
  import DateTimeCodecs._

  implicit val CreateChatCompletionStreamResponseUsageCodecJson: CodecJson[CreateChatCompletionStreamResponseUsage] = CodecJson.derive[CreateChatCompletionStreamResponseUsage]
  implicit val CreateChatCompletionStreamResponseUsageDecoder: EntityDecoder[CreateChatCompletionStreamResponseUsage] = jsonOf[CreateChatCompletionStreamResponseUsage]
  implicit val CreateChatCompletionStreamResponseUsageEncoder: EntityEncoder[CreateChatCompletionStreamResponseUsage] = jsonEncoderOf[CreateChatCompletionStreamResponseUsage]
}
