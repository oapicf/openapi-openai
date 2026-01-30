package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ProjectUserDeleteResponse._

case class ProjectUserDeleteResponse (
  `object`: `Object`,
id: String,
deleted: Boolean)

object ProjectUserDeleteResponse {
  import DateTimeCodecs._
  sealed trait `Object`
  case object OrganizationProjectUserDeleted extends `Object`

  object `Object` {
    def to`Object`(s: String): Option[`Object`] = s match {
      case "OrganizationProjectUserDeleted" => Some(OrganizationProjectUserDeleted)
      case _ => None
    }

    def from`Object`(x: `Object`): String = x match {
      case OrganizationProjectUserDeleted => "OrganizationProjectUserDeleted"
    }
  }

  implicit val `Object`EnumEncoder: EncodeJson[`Object`] =
    EncodeJson[`Object`](is => StringEncodeJson(`Object`.from`Object`(is)))

  implicit val `Object`EnumDecoder: DecodeJson[`Object`] =
    DecodeJson.optionDecoder[`Object`](n => n.string.flatMap(jStr => `Object`.to`Object`(jStr)), "`Object` failed to de-serialize")

  implicit val ProjectUserDeleteResponseCodecJson: CodecJson[ProjectUserDeleteResponse] = CodecJson.derive[ProjectUserDeleteResponse]
  implicit val ProjectUserDeleteResponseDecoder: EntityDecoder[ProjectUserDeleteResponse] = jsonOf[ProjectUserDeleteResponse]
  implicit val ProjectUserDeleteResponseEncoder: EntityEncoder[ProjectUserDeleteResponse] = jsonEncoderOf[ProjectUserDeleteResponse]
}
