package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import RealtimeResponseUsageInputTokenDetails._

case class RealtimeResponseUsageInputTokenDetails (
  /* The number of cached tokens used in the Response. */
  cachedTokens: Option[Integer],
/* The number of text tokens used in the Response. */
  textTokens: Option[Integer],
/* The number of audio tokens used in the Response. */
  audioTokens: Option[Integer])

object RealtimeResponseUsageInputTokenDetails {
  import DateTimeCodecs._

  implicit val RealtimeResponseUsageInputTokenDetailsCodecJson: CodecJson[RealtimeResponseUsageInputTokenDetails] = CodecJson.derive[RealtimeResponseUsageInputTokenDetails]
  implicit val RealtimeResponseUsageInputTokenDetailsDecoder: EntityDecoder[RealtimeResponseUsageInputTokenDetails] = jsonOf[RealtimeResponseUsageInputTokenDetails]
  implicit val RealtimeResponseUsageInputTokenDetailsEncoder: EntityEncoder[RealtimeResponseUsageInputTokenDetails] = jsonEncoderOf[RealtimeResponseUsageInputTokenDetails]
}
