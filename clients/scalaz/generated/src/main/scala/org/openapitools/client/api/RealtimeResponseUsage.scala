package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import RealtimeResponseUsage._

case class RealtimeResponseUsage (
  /* The total number of tokens in the Response including input and output  text and audio tokens.  */
  totalTokens: Option[Integer],
/* The number of input tokens used in the Response, including text and  audio tokens.  */
  inputTokens: Option[Integer],
/* The number of output tokens sent in the Response, including text and  audio tokens.  */
  outputTokens: Option[Integer],
inputTokenDetails: Option[RealtimeResponseUsageInputTokenDetails],
outputTokenDetails: Option[RealtimeResponseUsageOutputTokenDetails])

object RealtimeResponseUsage {
  import DateTimeCodecs._

  implicit val RealtimeResponseUsageCodecJson: CodecJson[RealtimeResponseUsage] = CodecJson.derive[RealtimeResponseUsage]
  implicit val RealtimeResponseUsageDecoder: EntityDecoder[RealtimeResponseUsage] = jsonOf[RealtimeResponseUsage]
  implicit val RealtimeResponseUsageEncoder: EntityEncoder[RealtimeResponseUsage] = jsonEncoderOf[RealtimeResponseUsage]
}
