package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import RealtimeServerEventRateLimitsUpdatedRateLimitsInner._

case class RealtimeServerEventRateLimitsUpdatedRateLimitsInner (
  /* The name of the rate limit (`requests`, `tokens`).  */
  name: Option[Name],
/* The maximum allowed value for the rate limit. */
  limit: Option[Integer],
/* The remaining value before the limit is reached. */
  remaining: Option[Integer],
/* Seconds until the rate limit resets. */
  resetSeconds: Option[BigDecimal])

object RealtimeServerEventRateLimitsUpdatedRateLimitsInner {
  import DateTimeCodecs._
  sealed trait Name
  case object Requests extends Name
  case object Tokens extends Name

  object Name {
    def toName(s: String): Option[Name] = s match {
      case "Requests" => Some(Requests)
      case "Tokens" => Some(Tokens)
      case _ => None
    }

    def fromName(x: Name): String = x match {
      case Requests => "Requests"
      case Tokens => "Tokens"
    }
  }

  implicit val NameEnumEncoder: EncodeJson[Name] =
    EncodeJson[Name](is => StringEncodeJson(Name.fromName(is)))

  implicit val NameEnumDecoder: DecodeJson[Name] =
    DecodeJson.optionDecoder[Name](n => n.string.flatMap(jStr => Name.toName(jStr)), "Name failed to de-serialize")

  implicit val RealtimeServerEventRateLimitsUpdatedRateLimitsInnerCodecJson: CodecJson[RealtimeServerEventRateLimitsUpdatedRateLimitsInner] = CodecJson.derive[RealtimeServerEventRateLimitsUpdatedRateLimitsInner]
  implicit val RealtimeServerEventRateLimitsUpdatedRateLimitsInnerDecoder: EntityDecoder[RealtimeServerEventRateLimitsUpdatedRateLimitsInner] = jsonOf[RealtimeServerEventRateLimitsUpdatedRateLimitsInner]
  implicit val RealtimeServerEventRateLimitsUpdatedRateLimitsInnerEncoder: EntityEncoder[RealtimeServerEventRateLimitsUpdatedRateLimitsInner] = jsonEncoderOf[RealtimeServerEventRateLimitsUpdatedRateLimitsInner]
}
