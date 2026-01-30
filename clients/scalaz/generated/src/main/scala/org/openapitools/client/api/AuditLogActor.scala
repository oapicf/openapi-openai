package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AuditLogActor._

case class AuditLogActor (
  /* The type of actor. Is either `session` or `api_key`. */
  `type`: Option[`Type`],
session: Option[AuditLogActorSession],
apiKey: Option[AuditLogActorApiKey])

object AuditLogActor {
  import DateTimeCodecs._
  sealed trait `Type`
  case object Session extends `Type`
  case object ApiKey extends `Type`

  object `Type` {
    def to`Type`(s: String): Option[`Type`] = s match {
      case "Session" => Some(Session)
      case "ApiKey" => Some(ApiKey)
      case _ => None
    }

    def from`Type`(x: `Type`): String = x match {
      case Session => "Session"
      case ApiKey => "ApiKey"
    }
  }

  implicit val `Type`EnumEncoder: EncodeJson[`Type`] =
    EncodeJson[`Type`](is => StringEncodeJson(`Type`.from`Type`(is)))

  implicit val `Type`EnumDecoder: DecodeJson[`Type`] =
    DecodeJson.optionDecoder[`Type`](n => n.string.flatMap(jStr => `Type`.to`Type`(jStr)), "`Type` failed to de-serialize")

  implicit val AuditLogActorCodecJson: CodecJson[AuditLogActor] = CodecJson.derive[AuditLogActor]
  implicit val AuditLogActorDecoder: EntityDecoder[AuditLogActor] = jsonOf[AuditLogActor]
  implicit val AuditLogActorEncoder: EntityEncoder[AuditLogActor] = jsonEncoderOf[AuditLogActor]
}
