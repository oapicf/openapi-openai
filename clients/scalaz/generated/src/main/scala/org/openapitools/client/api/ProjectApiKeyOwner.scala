package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ProjectApiKeyOwner._

case class ProjectApiKeyOwner (
  /* `user` or `service_account` */
  `type`: Option[`Type`],
user: Option[ProjectUser],
serviceAccount: Option[ProjectServiceAccount])

object ProjectApiKeyOwner {
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

  implicit val ProjectApiKeyOwnerCodecJson: CodecJson[ProjectApiKeyOwner] = CodecJson.derive[ProjectApiKeyOwner]
  implicit val ProjectApiKeyOwnerDecoder: EntityDecoder[ProjectApiKeyOwner] = jsonOf[ProjectApiKeyOwner]
  implicit val ProjectApiKeyOwnerEncoder: EntityEncoder[ProjectApiKeyOwner] = jsonEncoderOf[ProjectApiKeyOwner]
}
