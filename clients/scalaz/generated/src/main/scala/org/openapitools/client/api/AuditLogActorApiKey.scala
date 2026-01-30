package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AuditLogActorApiKey._

case class AuditLogActorApiKey (
  /* The tracking id of the API key. */
  id: Option[String],
/* The type of API key. Can be either `user` or `service_account`. */
  `type`: Option[`Type`],
user: Option[AuditLogActorUser],
serviceAccount: Option[AuditLogActorServiceAccount])

object AuditLogActorApiKey {
  import DateTimeCodecs._
  sealed trait `Type`
  case object User extends `Type`
  case object ServiceAccount extends `Type`

  object `Type` {
    def to`Type`(s: String): Option[`Type`] = s match {
      case "User" => Some(User)
      case "ServiceAccount" => Some(ServiceAccount)
      case _ => None
    }

    def from`Type`(x: `Type`): String = x match {
      case User => "User"
      case ServiceAccount => "ServiceAccount"
    }
  }

  implicit val `Type`EnumEncoder: EncodeJson[`Type`] =
    EncodeJson[`Type`](is => StringEncodeJson(`Type`.from`Type`(is)))

  implicit val `Type`EnumDecoder: DecodeJson[`Type`] =
    DecodeJson.optionDecoder[`Type`](n => n.string.flatMap(jStr => `Type`.to`Type`(jStr)), "`Type` failed to de-serialize")

  implicit val AuditLogActorApiKeyCodecJson: CodecJson[AuditLogActorApiKey] = CodecJson.derive[AuditLogActorApiKey]
  implicit val AuditLogActorApiKeyDecoder: EntityDecoder[AuditLogActorApiKey] = jsonOf[AuditLogActorApiKey]
  implicit val AuditLogActorApiKeyEncoder: EntityEncoder[AuditLogActorApiKey] = jsonEncoderOf[AuditLogActorApiKey]
}
