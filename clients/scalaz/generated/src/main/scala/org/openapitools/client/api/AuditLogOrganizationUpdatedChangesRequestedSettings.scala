package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AuditLogOrganizationUpdatedChangesRequestedSettings._

case class AuditLogOrganizationUpdatedChangesRequestedSettings (
  /* Visibility of the threads page which shows messages created with the Assistants API and Playground. One of `ANY_ROLE`, `OWNERS`, or `NONE`. */
  threadsUiVisibility: Option[String],
/* Visibility of the usage dashboard which shows activity and costs for your organization. One of `ANY_ROLE` or `OWNERS`. */
  usageDashboardVisibility: Option[String])

object AuditLogOrganizationUpdatedChangesRequestedSettings {
  import DateTimeCodecs._

  implicit val AuditLogOrganizationUpdatedChangesRequestedSettingsCodecJson: CodecJson[AuditLogOrganizationUpdatedChangesRequestedSettings] = CodecJson.derive[AuditLogOrganizationUpdatedChangesRequestedSettings]
  implicit val AuditLogOrganizationUpdatedChangesRequestedSettingsDecoder: EntityDecoder[AuditLogOrganizationUpdatedChangesRequestedSettings] = jsonOf[AuditLogOrganizationUpdatedChangesRequestedSettings]
  implicit val AuditLogOrganizationUpdatedChangesRequestedSettingsEncoder: EntityEncoder[AuditLogOrganizationUpdatedChangesRequestedSettings] = jsonEncoderOf[AuditLogOrganizationUpdatedChangesRequestedSettings]
}
