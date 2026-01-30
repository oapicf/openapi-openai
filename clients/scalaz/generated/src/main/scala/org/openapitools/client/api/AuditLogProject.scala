package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AuditLogProject._

case class AuditLogProject (
  /* The project ID. */
  id: Option[String],
/* The project title. */
  name: Option[String])

object AuditLogProject {
  import DateTimeCodecs._

  implicit val AuditLogProjectCodecJson: CodecJson[AuditLogProject] = CodecJson.derive[AuditLogProject]
  implicit val AuditLogProjectDecoder: EntityDecoder[AuditLogProject] = jsonOf[AuditLogProject]
  implicit val AuditLogProjectEncoder: EntityEncoder[AuditLogProject] = jsonEncoderOf[AuditLogProject]
}
