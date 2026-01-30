package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AuditLogInviteSentData._

case class AuditLogInviteSentData (
  /* The email invited to the organization. */
  email: Option[String],
/* The role the email was invited to be. Is either `owner` or `member`. */
  role: Option[String])

object AuditLogInviteSentData {
  import DateTimeCodecs._

  implicit val AuditLogInviteSentDataCodecJson: CodecJson[AuditLogInviteSentData] = CodecJson.derive[AuditLogInviteSentData]
  implicit val AuditLogInviteSentDataDecoder: EntityDecoder[AuditLogInviteSentData] = jsonOf[AuditLogInviteSentData]
  implicit val AuditLogInviteSentDataEncoder: EntityEncoder[AuditLogInviteSentData] = jsonEncoderOf[AuditLogInviteSentData]
}
