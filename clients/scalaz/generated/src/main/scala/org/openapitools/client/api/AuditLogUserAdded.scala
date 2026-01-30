package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AuditLogUserAdded._

case class AuditLogUserAdded (
  /* The user ID. */
  id: Option[String],
data: Option[AuditLogUserAddedData])

object AuditLogUserAdded {
  import DateTimeCodecs._

  implicit val AuditLogUserAddedCodecJson: CodecJson[AuditLogUserAdded] = CodecJson.derive[AuditLogUserAdded]
  implicit val AuditLogUserAddedDecoder: EntityDecoder[AuditLogUserAdded] = jsonOf[AuditLogUserAdded]
  implicit val AuditLogUserAddedEncoder: EntityEncoder[AuditLogUserAdded] = jsonEncoderOf[AuditLogUserAdded]
}
