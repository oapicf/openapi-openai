package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AuditLogUserDeleted._

case class AuditLogUserDeleted (
  /* The user ID. */
  id: Option[String])

object AuditLogUserDeleted {
  import DateTimeCodecs._

  implicit val AuditLogUserDeletedCodecJson: CodecJson[AuditLogUserDeleted] = CodecJson.derive[AuditLogUserDeleted]
  implicit val AuditLogUserDeletedDecoder: EntityDecoder[AuditLogUserDeleted] = jsonOf[AuditLogUserDeleted]
  implicit val AuditLogUserDeletedEncoder: EntityEncoder[AuditLogUserDeleted] = jsonEncoderOf[AuditLogUserDeleted]
}
