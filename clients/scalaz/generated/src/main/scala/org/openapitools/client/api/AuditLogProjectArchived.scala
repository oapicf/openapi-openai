package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AuditLogProjectArchived._

case class AuditLogProjectArchived (
  /* The project ID. */
  id: Option[String])

object AuditLogProjectArchived {
  import DateTimeCodecs._

  implicit val AuditLogProjectArchivedCodecJson: CodecJson[AuditLogProjectArchived] = CodecJson.derive[AuditLogProjectArchived]
  implicit val AuditLogProjectArchivedDecoder: EntityDecoder[AuditLogProjectArchived] = jsonOf[AuditLogProjectArchived]
  implicit val AuditLogProjectArchivedEncoder: EntityEncoder[AuditLogProjectArchived] = jsonEncoderOf[AuditLogProjectArchived]
}
