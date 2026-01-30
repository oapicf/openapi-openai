package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AuditLogRateLimitUpdatedChangesRequested._

case class AuditLogRateLimitUpdatedChangesRequested (
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

object AuditLogRateLimitUpdatedChangesRequested {
  import DateTimeCodecs._

  implicit val AuditLogRateLimitUpdatedChangesRequestedCodecJson: CodecJson[AuditLogRateLimitUpdatedChangesRequested] = CodecJson.derive[AuditLogRateLimitUpdatedChangesRequested]
  implicit val AuditLogRateLimitUpdatedChangesRequestedDecoder: EntityDecoder[AuditLogRateLimitUpdatedChangesRequested] = jsonOf[AuditLogRateLimitUpdatedChangesRequested]
  implicit val AuditLogRateLimitUpdatedChangesRequestedEncoder: EntityEncoder[AuditLogRateLimitUpdatedChangesRequested] = jsonEncoderOf[AuditLogRateLimitUpdatedChangesRequested]
}
