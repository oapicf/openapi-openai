package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AuditLogOrganizationUpdated._

case class AuditLogOrganizationUpdated (
  /* The organization ID. */
  id: Option[String],
changesRequested: Option[AuditLogOrganizationUpdatedChangesRequested])

object AuditLogOrganizationUpdated {
  import DateTimeCodecs._

  implicit val AuditLogOrganizationUpdatedCodecJson: CodecJson[AuditLogOrganizationUpdated] = CodecJson.derive[AuditLogOrganizationUpdated]
  implicit val AuditLogOrganizationUpdatedDecoder: EntityDecoder[AuditLogOrganizationUpdated] = jsonOf[AuditLogOrganizationUpdated]
  implicit val AuditLogOrganizationUpdatedEncoder: EntityEncoder[AuditLogOrganizationUpdated] = jsonEncoderOf[AuditLogOrganizationUpdated]
}
