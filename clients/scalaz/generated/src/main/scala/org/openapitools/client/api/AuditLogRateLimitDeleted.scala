package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AuditLogRateLimitDeleted._

case class AuditLogRateLimitDeleted (
  /* The rate limit ID */
  id: Option[String])

object AuditLogRateLimitDeleted {
  import DateTimeCodecs._

  implicit val AuditLogRateLimitDeletedCodecJson: CodecJson[AuditLogRateLimitDeleted] = CodecJson.derive[AuditLogRateLimitDeleted]
  implicit val AuditLogRateLimitDeletedDecoder: EntityDecoder[AuditLogRateLimitDeleted] = jsonOf[AuditLogRateLimitDeleted]
  implicit val AuditLogRateLimitDeletedEncoder: EntityEncoder[AuditLogRateLimitDeleted] = jsonEncoderOf[AuditLogRateLimitDeleted]
}
