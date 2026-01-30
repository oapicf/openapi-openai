package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AuditLogInviteSent._

case class AuditLogInviteSent (
  /* The ID of the invite. */
  id: Option[String],
data: Option[AuditLogInviteSentData])

object AuditLogInviteSent {
  import DateTimeCodecs._

  implicit val AuditLogInviteSentCodecJson: CodecJson[AuditLogInviteSent] = CodecJson.derive[AuditLogInviteSent]
  implicit val AuditLogInviteSentDecoder: EntityDecoder[AuditLogInviteSent] = jsonOf[AuditLogInviteSent]
  implicit val AuditLogInviteSentEncoder: EntityEncoder[AuditLogInviteSent] = jsonEncoderOf[AuditLogInviteSent]
}
