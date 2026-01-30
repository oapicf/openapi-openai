package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AuditLogOrganizationUpdatedChangesRequested._

case class AuditLogOrganizationUpdatedChangesRequested (
  /* The organization title. */
  title: Option[String],
/* The organization description. */
  description: Option[String],
/* The organization name. */
  name: Option[String],
settings: Option[AuditLogOrganizationUpdatedChangesRequestedSettings])

object AuditLogOrganizationUpdatedChangesRequested {
  import DateTimeCodecs._

  implicit val AuditLogOrganizationUpdatedChangesRequestedCodecJson: CodecJson[AuditLogOrganizationUpdatedChangesRequested] = CodecJson.derive[AuditLogOrganizationUpdatedChangesRequested]
  implicit val AuditLogOrganizationUpdatedChangesRequestedDecoder: EntityDecoder[AuditLogOrganizationUpdatedChangesRequested] = jsonOf[AuditLogOrganizationUpdatedChangesRequested]
  implicit val AuditLogOrganizationUpdatedChangesRequestedEncoder: EntityEncoder[AuditLogOrganizationUpdatedChangesRequested] = jsonEncoderOf[AuditLogOrganizationUpdatedChangesRequested]
}
