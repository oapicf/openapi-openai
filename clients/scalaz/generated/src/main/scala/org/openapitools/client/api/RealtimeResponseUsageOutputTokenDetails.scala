package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import RealtimeResponseUsageOutputTokenDetails._

case class RealtimeResponseUsageOutputTokenDetails (
  /* The number of text tokens used in the Response. */
  textTokens: Option[Integer],
/* The number of audio tokens used in the Response. */
  audioTokens: Option[Integer])

object RealtimeResponseUsageOutputTokenDetails {
  import DateTimeCodecs._

  implicit val RealtimeResponseUsageOutputTokenDetailsCodecJson: CodecJson[RealtimeResponseUsageOutputTokenDetails] = CodecJson.derive[RealtimeResponseUsageOutputTokenDetails]
  implicit val RealtimeResponseUsageOutputTokenDetailsDecoder: EntityDecoder[RealtimeResponseUsageOutputTokenDetails] = jsonOf[RealtimeResponseUsageOutputTokenDetails]
  implicit val RealtimeResponseUsageOutputTokenDetailsEncoder: EntityEncoder[RealtimeResponseUsageOutputTokenDetails] = jsonEncoderOf[RealtimeResponseUsageOutputTokenDetails]
}
