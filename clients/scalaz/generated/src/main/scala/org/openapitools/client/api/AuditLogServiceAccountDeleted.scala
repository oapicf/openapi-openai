package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AuditLogServiceAccountDeleted._

case class AuditLogServiceAccountDeleted (
  /* The service account ID. */
  id: Option[String])

object AuditLogServiceAccountDeleted {
  import DateTimeCodecs._

  implicit val AuditLogServiceAccountDeletedCodecJson: CodecJson[AuditLogServiceAccountDeleted] = CodecJson.derive[AuditLogServiceAccountDeleted]
  implicit val AuditLogServiceAccountDeletedDecoder: EntityDecoder[AuditLogServiceAccountDeleted] = jsonOf[AuditLogServiceAccountDeleted]
  implicit val AuditLogServiceAccountDeletedEncoder: EntityEncoder[AuditLogServiceAccountDeleted] = jsonEncoderOf[AuditLogServiceAccountDeleted]
}
