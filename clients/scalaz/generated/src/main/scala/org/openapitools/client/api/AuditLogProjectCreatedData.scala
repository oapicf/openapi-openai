package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AuditLogProjectCreatedData._

case class AuditLogProjectCreatedData (
  /* The project name. */
  name: Option[String],
/* The title of the project as seen on the dashboard. */
  title: Option[String])

object AuditLogProjectCreatedData {
  import DateTimeCodecs._

  implicit val AuditLogProjectCreatedDataCodecJson: CodecJson[AuditLogProjectCreatedData] = CodecJson.derive[AuditLogProjectCreatedData]
  implicit val AuditLogProjectCreatedDataDecoder: EntityDecoder[AuditLogProjectCreatedData] = jsonOf[AuditLogProjectCreatedData]
  implicit val AuditLogProjectCreatedDataEncoder: EntityEncoder[AuditLogProjectCreatedData] = jsonEncoderOf[AuditLogProjectCreatedData]
}
