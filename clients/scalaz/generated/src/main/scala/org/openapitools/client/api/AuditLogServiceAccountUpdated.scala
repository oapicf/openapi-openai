package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AuditLogServiceAccountUpdated._

case class AuditLogServiceAccountUpdated (
  /* The service account ID. */
  id: Option[String],
changesRequested: Option[AuditLogServiceAccountUpdatedChangesRequested])

object AuditLogServiceAccountUpdated {
  import DateTimeCodecs._

  implicit val AuditLogServiceAccountUpdatedCodecJson: CodecJson[AuditLogServiceAccountUpdated] = CodecJson.derive[AuditLogServiceAccountUpdated]
  implicit val AuditLogServiceAccountUpdatedDecoder: EntityDecoder[AuditLogServiceAccountUpdated] = jsonOf[AuditLogServiceAccountUpdated]
  implicit val AuditLogServiceAccountUpdatedEncoder: EntityEncoder[AuditLogServiceAccountUpdated] = jsonEncoderOf[AuditLogServiceAccountUpdated]
}
