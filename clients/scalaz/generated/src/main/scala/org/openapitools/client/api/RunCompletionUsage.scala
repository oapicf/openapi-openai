package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import RunCompletionUsage._

case class RunCompletionUsage (
  /* Number of completion tokens used over the course of the run. */
  completionTokens: Integer,
/* Number of prompt tokens used over the course of the run. */
  promptTokens: Integer,
/* Total number of tokens used (prompt + completion). */
  totalTokens: Integer)

object RunCompletionUsage {
  import DateTimeCodecs._

  implicit val RunCompletionUsageCodecJson: CodecJson[RunCompletionUsage] = CodecJson.derive[RunCompletionUsage]
  implicit val RunCompletionUsageDecoder: EntityDecoder[RunCompletionUsage] = jsonOf[RunCompletionUsage]
  implicit val RunCompletionUsageEncoder: EntityEncoder[RunCompletionUsage] = jsonEncoderOf[RunCompletionUsage]
}
