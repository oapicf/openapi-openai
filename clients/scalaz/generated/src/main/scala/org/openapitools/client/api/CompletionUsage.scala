package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CompletionUsage._

case class CompletionUsage (
  /* Number of tokens in the generated completion. */
  completionTokens: Integer,
/* Number of tokens in the prompt. */
  promptTokens: Integer,
/* Total number of tokens used in the request (prompt + completion). */
  totalTokens: Integer)

object CompletionUsage {
  import DateTimeCodecs._

  implicit val CompletionUsageCodecJson: CodecJson[CompletionUsage] = CodecJson.derive[CompletionUsage]
  implicit val CompletionUsageDecoder: EntityDecoder[CompletionUsage] = jsonOf[CompletionUsage]
  implicit val CompletionUsageEncoder: EntityEncoder[CompletionUsage] = jsonEncoderOf[CompletionUsage]
}
