package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AuditLogRateLimitUpdated._

case class AuditLogRateLimitUpdated (
  /* The rate limit ID */
  id: Option[String],
changesRequested: Option[AuditLogRateLimitUpdatedChangesRequested])

object AuditLogRateLimitUpdated {
  import DateTimeCodecs._

  implicit val AuditLogRateLimitUpdatedCodecJson: CodecJson[AuditLogRateLimitUpdated] = CodecJson.derive[AuditLogRateLimitUpdated]
  implicit val AuditLogRateLimitUpdatedDecoder: EntityDecoder[AuditLogRateLimitUpdated] = jsonOf[AuditLogRateLimitUpdated]
  implicit val AuditLogRateLimitUpdatedEncoder: EntityEncoder[AuditLogRateLimitUpdated] = jsonEncoderOf[AuditLogRateLimitUpdated]
}
