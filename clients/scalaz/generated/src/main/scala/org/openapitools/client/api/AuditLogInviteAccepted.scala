package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AuditLogInviteAccepted._

case class AuditLogInviteAccepted (
  /* The ID of the invite. */
  id: Option[String])

object AuditLogInviteAccepted {
  import DateTimeCodecs._

  implicit val AuditLogInviteAcceptedCodecJson: CodecJson[AuditLogInviteAccepted] = CodecJson.derive[AuditLogInviteAccepted]
  implicit val AuditLogInviteAcceptedDecoder: EntityDecoder[AuditLogInviteAccepted] = jsonOf[AuditLogInviteAccepted]
  implicit val AuditLogInviteAcceptedEncoder: EntityEncoder[AuditLogInviteAccepted] = jsonEncoderOf[AuditLogInviteAccepted]
}
