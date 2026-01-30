package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import RealtimeServerEventRateLimitsUpdated._

case class RealtimeServerEventRateLimitsUpdated (
  /* The unique ID of the server event. */
  eventId: String,
/* The event type, must be `rate_limits.updated`. */
  `type`: `Type`,
/* List of rate limit information. */
  rateLimits: List[RealtimeServerEventRateLimitsUpdatedRateLimitsInner])

object RealtimeServerEventRateLimitsUpdated {
  import DateTimeCodecs._
  sealed trait `Type`
  case object RateLimitsUpdated extends `Type`

  object `Type` {
    def to`Type`(s: String): Option[`Type`] = s match {
      case "RateLimitsUpdated" => Some(RateLimitsUpdated)
      case _ => None
    }

    def from`Type`(x: `Type`): String = x match {
      case RateLimitsUpdated => "RateLimitsUpdated"
    }
  }

  implicit val `Type`EnumEncoder: EncodeJson[`Type`] =
    EncodeJson[`Type`](is => StringEncodeJson(`Type`.from`Type`(is)))

  implicit val `Type`EnumDecoder: DecodeJson[`Type`] =
    DecodeJson.optionDecoder[`Type`](n => n.string.flatMap(jStr => `Type`.to`Type`(jStr)), "`Type` failed to de-serialize")

  implicit val RealtimeServerEventRateLimitsUpdatedCodecJson: CodecJson[RealtimeServerEventRateLimitsUpdated] = CodecJson.derive[RealtimeServerEventRateLimitsUpdated]
  implicit val RealtimeServerEventRateLimitsUpdatedDecoder: EntityDecoder[RealtimeServerEventRateLimitsUpdated] = jsonOf[RealtimeServerEventRateLimitsUpdated]
  implicit val RealtimeServerEventRateLimitsUpdatedEncoder: EntityEncoder[RealtimeServerEventRateLimitsUpdated] = jsonEncoderOf[RealtimeServerEventRateLimitsUpdated]
}
