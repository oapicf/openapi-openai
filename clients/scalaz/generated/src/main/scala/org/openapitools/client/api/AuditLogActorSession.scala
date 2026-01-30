package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AuditLogActorSession._

case class AuditLogActorSession (
  user: Option[AuditLogActorUser],
/* The IP address from which the action was performed. */
  ipAddress: Option[String])

object AuditLogActorSession {
  import DateTimeCodecs._

  implicit val AuditLogActorSessionCodecJson: CodecJson[AuditLogActorSession] = CodecJson.derive[AuditLogActorSession]
  implicit val AuditLogActorSessionDecoder: EntityDecoder[AuditLogActorSession] = jsonOf[AuditLogActorSession]
  implicit val AuditLogActorSessionEncoder: EntityEncoder[AuditLogActorSession] = jsonEncoderOf[AuditLogActorSession]
}
