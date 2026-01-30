package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import UserDeleteResponse._

case class UserDeleteResponse (
  `object`: `Object`,
id: String,
deleted: Boolean)

object UserDeleteResponse {
  import DateTimeCodecs._
  sealed trait `Object`
  case object OrganizationUserDeleted extends `Object`

  object `Object` {
    def to`Object`(s: String): Option[`Object`] = s match {
      case "OrganizationUserDeleted" => Some(OrganizationUserDeleted)
      case _ => None
    }

    def from`Object`(x: `Object`): String = x match {
      case OrganizationUserDeleted => "OrganizationUserDeleted"
    }
  }

  implicit val `Object`EnumEncoder: EncodeJson[`Object`] =
    EncodeJson[`Object`](is => StringEncodeJson(`Object`.from`Object`(is)))

  implicit val `Object`EnumDecoder: DecodeJson[`Object`] =
    DecodeJson.optionDecoder[`Object`](n => n.string.flatMap(jStr => `Object`.to`Object`(jStr)), "`Object` failed to de-serialize")

  implicit val UserDeleteResponseCodecJson: CodecJson[UserDeleteResponse] = CodecJson.derive[UserDeleteResponse]
  implicit val UserDeleteResponseDecoder: EntityDecoder[UserDeleteResponse] = jsonOf[UserDeleteResponse]
  implicit val UserDeleteResponseEncoder: EntityEncoder[UserDeleteResponse] = jsonEncoderOf[UserDeleteResponse]
}
