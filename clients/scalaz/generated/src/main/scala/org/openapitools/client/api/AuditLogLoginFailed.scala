package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AuditLogLoginFailed._

case class AuditLogLoginFailed (
  /* The error code of the failure. */
  errorCode: Option[String],
/* The error message of the failure. */
  errorMessage: Option[String])

object AuditLogLoginFailed {
  import DateTimeCodecs._

  implicit val AuditLogLoginFailedCodecJson: CodecJson[AuditLogLoginFailed] = CodecJson.derive[AuditLogLoginFailed]
  implicit val AuditLogLoginFailedDecoder: EntityDecoder[AuditLogLoginFailed] = jsonOf[AuditLogLoginFailed]
  implicit val AuditLogLoginFailedEncoder: EntityEncoder[AuditLogLoginFailed] = jsonEncoderOf[AuditLogLoginFailed]
}
