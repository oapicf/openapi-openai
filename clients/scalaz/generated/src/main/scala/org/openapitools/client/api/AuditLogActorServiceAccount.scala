package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AuditLogActorServiceAccount._

case class AuditLogActorServiceAccount (
  /* The service account id. */
  id: Option[String])

object AuditLogActorServiceAccount {
  import DateTimeCodecs._

  implicit val AuditLogActorServiceAccountCodecJson: CodecJson[AuditLogActorServiceAccount] = CodecJson.derive[AuditLogActorServiceAccount]
  implicit val AuditLogActorServiceAccountDecoder: EntityDecoder[AuditLogActorServiceAccount] = jsonOf[AuditLogActorServiceAccount]
  implicit val AuditLogActorServiceAccountEncoder: EntityEncoder[AuditLogActorServiceAccount] = jsonEncoderOf[AuditLogActorServiceAccount]
}
