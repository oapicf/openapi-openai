package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AuditLogServiceAccountUpdatedChangesRequested._

case class AuditLogServiceAccountUpdatedChangesRequested (
  /* The role of the service account. Is either `owner` or `member`. */
  role: Option[String])

object AuditLogServiceAccountUpdatedChangesRequested {
  import DateTimeCodecs._

  implicit val AuditLogServiceAccountUpdatedChangesRequestedCodecJson: CodecJson[AuditLogServiceAccountUpdatedChangesRequested] = CodecJson.derive[AuditLogServiceAccountUpdatedChangesRequested]
  implicit val AuditLogServiceAccountUpdatedChangesRequestedDecoder: EntityDecoder[AuditLogServiceAccountUpdatedChangesRequested] = jsonOf[AuditLogServiceAccountUpdatedChangesRequested]
  implicit val AuditLogServiceAccountUpdatedChangesRequestedEncoder: EntityEncoder[AuditLogServiceAccountUpdatedChangesRequested] = jsonEncoderOf[AuditLogServiceAccountUpdatedChangesRequested]
}
