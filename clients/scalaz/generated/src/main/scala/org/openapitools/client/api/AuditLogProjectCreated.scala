package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AuditLogProjectCreated._

case class AuditLogProjectCreated (
  /* The project ID. */
  id: Option[String],
data: Option[AuditLogProjectCreatedData])

object AuditLogProjectCreated {
  import DateTimeCodecs._

  implicit val AuditLogProjectCreatedCodecJson: CodecJson[AuditLogProjectCreated] = CodecJson.derive[AuditLogProjectCreated]
  implicit val AuditLogProjectCreatedDecoder: EntityDecoder[AuditLogProjectCreated] = jsonOf[AuditLogProjectCreated]
  implicit val AuditLogProjectCreatedEncoder: EntityEncoder[AuditLogProjectCreated] = jsonEncoderOf[AuditLogProjectCreated]
}
