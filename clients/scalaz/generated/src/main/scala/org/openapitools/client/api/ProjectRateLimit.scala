package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ProjectRateLimit._

case class ProjectRateLimit (
  /* The object type, which is always `project.rate_limit` */
  `object`: `Object`,
/* The identifier, which can be referenced in API endpoints. */
  id: String,
/* The model this rate limit applies to. */
  model: String,
/* The maximum requests per minute. */
  maxRequestsPer1Minute: Integer,
/* The maximum tokens per minute. */
  maxTokensPer1Minute: Integer,
/* The maximum images per minute. Only present for relevant models. */
  maxImagesPer1Minute: Option[Integer],
/* The maximum audio megabytes per minute. Only present for relevant models. */
  maxAudioMegabytesPer1Minute: Option[Integer],
/* The maximum requests per day. Only present for relevant models. */
  maxRequestsPer1Day: Option[Integer],
/* The maximum batch input tokens per day. Only present for relevant models. */
  batch1DayMaxInputTokens: Option[Integer])

object ProjectRateLimit {
  import DateTimeCodecs._
  sealed trait `Object`
  case object ProjectRateLimit extends `Object`

  object `Object` {
    def to`Object`(s: String): Option[`Object`] = s match {
      case "ProjectRateLimit" => Some(ProjectRateLimit)
      case _ => None
    }

    def from`Object`(x: `Object`): String = x match {
      case ProjectRateLimit => "ProjectRateLimit"
    }
  }

  implicit val `Object`EnumEncoder: EncodeJson[`Object`] =
    EncodeJson[`Object`](is => StringEncodeJson(`Object`.from`Object`(is)))

  implicit val `Object`EnumDecoder: DecodeJson[`Object`] =
    DecodeJson.optionDecoder[`Object`](n => n.string.flatMap(jStr => `Object`.to`Object`(jStr)), "`Object` failed to de-serialize")

  implicit val ProjectRateLimitCodecJson: CodecJson[ProjectRateLimit] = CodecJson.derive[ProjectRateLimit]
  implicit val ProjectRateLimitDecoder: EntityDecoder[ProjectRateLimit] = jsonOf[ProjectRateLimit]
  implicit val ProjectRateLimitEncoder: EntityEncoder[ProjectRateLimit] = jsonEncoderOf[ProjectRateLimit]
}
