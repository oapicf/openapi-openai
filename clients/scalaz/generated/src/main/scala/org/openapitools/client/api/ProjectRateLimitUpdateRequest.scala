package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ProjectRateLimitUpdateRequest._

case class ProjectRateLimitUpdateRequest (
  /* The maximum requests per minute. */
  maxRequestsPer1Minute: Option[Integer],
/* The maximum tokens per minute. */
  maxTokensPer1Minute: Option[Integer],
/* The maximum images per minute. Only relevant for certain models. */
  maxImagesPer1Minute: Option[Integer],
/* The maximum audio megabytes per minute. Only relevant for certain models. */
  maxAudioMegabytesPer1Minute: Option[Integer],
/* The maximum requests per day. Only relevant for certain models. */
  maxRequestsPer1Day: Option[Integer],
/* The maximum batch input tokens per day. Only relevant for certain models. */
  batch1DayMaxInputTokens: Option[Integer])

object ProjectRateLimitUpdateRequest {
  import DateTimeCodecs._

  implicit val ProjectRateLimitUpdateRequestCodecJson: CodecJson[ProjectRateLimitUpdateRequest] = CodecJson.derive[ProjectRateLimitUpdateRequest]
  implicit val ProjectRateLimitUpdateRequestDecoder: EntityDecoder[ProjectRateLimitUpdateRequest] = jsonOf[ProjectRateLimitUpdateRequest]
  implicit val ProjectRateLimitUpdateRequestEncoder: EntityEncoder[ProjectRateLimitUpdateRequest] = jsonEncoderOf[ProjectRateLimitUpdateRequest]
}
