package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AuditLogServiceAccountCreated._

case class AuditLogServiceAccountCreated (
  /* The service account ID. */
  id: Option[String],
data: Option[AuditLogServiceAccountCreatedData])

object AuditLogServiceAccountCreated {
  import DateTimeCodecs._

  implicit val AuditLogServiceAccountCreatedCodecJson: CodecJson[AuditLogServiceAccountCreated] = CodecJson.derive[AuditLogServiceAccountCreated]
  implicit val AuditLogServiceAccountCreatedDecoder: EntityDecoder[AuditLogServiceAccountCreated] = jsonOf[AuditLogServiceAccountCreated]
  implicit val AuditLogServiceAccountCreatedEncoder: EntityEncoder[AuditLogServiceAccountCreated] = jsonEncoderOf[AuditLogServiceAccountCreated]
}
