package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AuditLogServiceAccountCreatedData._

case class AuditLogServiceAccountCreatedData (
  /* The role of the service account. Is either `owner` or `member`. */
  role: Option[String])

object AuditLogServiceAccountCreatedData {
  import DateTimeCodecs._

  implicit val AuditLogServiceAccountCreatedDataCodecJson: CodecJson[AuditLogServiceAccountCreatedData] = CodecJson.derive[AuditLogServiceAccountCreatedData]
  implicit val AuditLogServiceAccountCreatedDataDecoder: EntityDecoder[AuditLogServiceAccountCreatedData] = jsonOf[AuditLogServiceAccountCreatedData]
  implicit val AuditLogServiceAccountCreatedDataEncoder: EntityEncoder[AuditLogServiceAccountCreatedData] = jsonEncoderOf[AuditLogServiceAccountCreatedData]
}
