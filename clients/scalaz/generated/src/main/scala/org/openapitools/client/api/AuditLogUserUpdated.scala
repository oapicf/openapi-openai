package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AuditLogUserUpdated._

case class AuditLogUserUpdated (
  /* The project ID. */
  id: Option[String],
changesRequested: Option[AuditLogUserUpdatedChangesRequested])

object AuditLogUserUpdated {
  import DateTimeCodecs._

  implicit val AuditLogUserUpdatedCodecJson: CodecJson[AuditLogUserUpdated] = CodecJson.derive[AuditLogUserUpdated]
  implicit val AuditLogUserUpdatedDecoder: EntityDecoder[AuditLogUserUpdated] = jsonOf[AuditLogUserUpdated]
  implicit val AuditLogUserUpdatedEncoder: EntityEncoder[AuditLogUserUpdated] = jsonEncoderOf[AuditLogUserUpdated]
}
