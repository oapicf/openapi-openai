package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AuditLogProjectUpdated._

case class AuditLogProjectUpdated (
  /* The project ID. */
  id: Option[String],
changesRequested: Option[AuditLogProjectUpdatedChangesRequested])

object AuditLogProjectUpdated {
  import DateTimeCodecs._

  implicit val AuditLogProjectUpdatedCodecJson: CodecJson[AuditLogProjectUpdated] = CodecJson.derive[AuditLogProjectUpdated]
  implicit val AuditLogProjectUpdatedDecoder: EntityDecoder[AuditLogProjectUpdated] = jsonOf[AuditLogProjectUpdated]
  implicit val AuditLogProjectUpdatedEncoder: EntityEncoder[AuditLogProjectUpdated] = jsonEncoderOf[AuditLogProjectUpdated]
}
