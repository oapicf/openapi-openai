package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import RunStepCompletionUsage._

case class RunStepCompletionUsage (
  /* Number of completion tokens used over the course of the run step. */
  completionTokens: Integer,
/* Number of prompt tokens used over the course of the run step. */
  promptTokens: Integer,
/* Total number of tokens used (prompt + completion). */
  totalTokens: Integer)

object RunStepCompletionUsage {
  import DateTimeCodecs._

  implicit val RunStepCompletionUsageCodecJson: CodecJson[RunStepCompletionUsage] = CodecJson.derive[RunStepCompletionUsage]
  implicit val RunStepCompletionUsageDecoder: EntityDecoder[RunStepCompletionUsage] = jsonOf[RunStepCompletionUsage]
  implicit val RunStepCompletionUsageEncoder: EntityEncoder[RunStepCompletionUsage] = jsonEncoderOf[RunStepCompletionUsage]
}
