package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AuditLogActorUser._

case class AuditLogActorUser (
  /* The user id. */
  id: Option[String],
/* The user email. */
  email: Option[String])

object AuditLogActorUser {
  import DateTimeCodecs._

  implicit val AuditLogActorUserCodecJson: CodecJson[AuditLogActorUser] = CodecJson.derive[AuditLogActorUser]
  implicit val AuditLogActorUserDecoder: EntityDecoder[AuditLogActorUser] = jsonOf[AuditLogActorUser]
  implicit val AuditLogActorUserEncoder: EntityEncoder[AuditLogActorUser] = jsonEncoderOf[AuditLogActorUser]
}
