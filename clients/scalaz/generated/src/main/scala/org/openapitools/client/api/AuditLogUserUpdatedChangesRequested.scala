package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AuditLogUserUpdatedChangesRequested._

case class AuditLogUserUpdatedChangesRequested (
  /* The role of the user. Is either `owner` or `member`. */
  role: Option[String])

object AuditLogUserUpdatedChangesRequested {
  import DateTimeCodecs._

  implicit val AuditLogUserUpdatedChangesRequestedCodecJson: CodecJson[AuditLogUserUpdatedChangesRequested] = CodecJson.derive[AuditLogUserUpdatedChangesRequested]
  implicit val AuditLogUserUpdatedChangesRequestedDecoder: EntityDecoder[AuditLogUserUpdatedChangesRequested] = jsonOf[AuditLogUserUpdatedChangesRequested]
  implicit val AuditLogUserUpdatedChangesRequestedEncoder: EntityEncoder[AuditLogUserUpdatedChangesRequested] = jsonEncoderOf[AuditLogUserUpdatedChangesRequested]
}
