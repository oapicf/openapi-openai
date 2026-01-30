package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AuditLogProjectUpdatedChangesRequested._

case class AuditLogProjectUpdatedChangesRequested (
  /* The title of the project as seen on the dashboard. */
  title: Option[String])

object AuditLogProjectUpdatedChangesRequested {
  import DateTimeCodecs._

  implicit val AuditLogProjectUpdatedChangesRequestedCodecJson: CodecJson[AuditLogProjectUpdatedChangesRequested] = CodecJson.derive[AuditLogProjectUpdatedChangesRequested]
  implicit val AuditLogProjectUpdatedChangesRequestedDecoder: EntityDecoder[AuditLogProjectUpdatedChangesRequested] = jsonOf[AuditLogProjectUpdatedChangesRequested]
  implicit val AuditLogProjectUpdatedChangesRequestedEncoder: EntityEncoder[AuditLogProjectUpdatedChangesRequested] = jsonEncoderOf[AuditLogProjectUpdatedChangesRequested]
}
