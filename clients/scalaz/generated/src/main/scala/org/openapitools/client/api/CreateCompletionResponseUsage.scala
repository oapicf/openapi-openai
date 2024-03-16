package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CreateCompletionResponseUsage._

case class CreateCompletionResponseUsage (
  promptTokens: Integer,
completionTokens: Integer,
totalTokens: Integer)

object CreateCompletionResponseUsage {
  import DateTimeCodecs._

  implicit val CreateCompletionResponseUsageCodecJson: CodecJson[CreateCompletionResponseUsage] = CodecJson.derive[CreateCompletionResponseUsage]
  implicit val CreateCompletionResponseUsageDecoder: EntityDecoder[CreateCompletionResponseUsage] = jsonOf[CreateCompletionResponseUsage]
  implicit val CreateCompletionResponseUsageEncoder: EntityEncoder[CreateCompletionResponseUsage] = jsonEncoderOf[CreateCompletionResponseUsage]
}
