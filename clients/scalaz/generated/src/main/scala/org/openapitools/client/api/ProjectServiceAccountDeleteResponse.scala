package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ProjectServiceAccountDeleteResponse._

case class ProjectServiceAccountDeleteResponse (
  `object`: `Object`,
id: String,
deleted: Boolean)

object ProjectServiceAccountDeleteResponse {
  import DateTimeCodecs._
  sealed trait `Object`
  case object OrganizationProjectServiceAccountDeleted extends `Object`

  object `Object` {
    def to`Object`(s: String): Option[`Object`] = s match {
      case "OrganizationProjectServiceAccountDeleted" => Some(OrganizationProjectServiceAccountDeleted)
      case _ => None
    }

    def from`Object`(x: `Object`): String = x match {
      case OrganizationProjectServiceAccountDeleted => "OrganizationProjectServiceAccountDeleted"
    }
  }

  implicit val `Object`EnumEncoder: EncodeJson[`Object`] =
    EncodeJson[`Object`](is => StringEncodeJson(`Object`.from`Object`(is)))

  implicit val `Object`EnumDecoder: DecodeJson[`Object`] =
    DecodeJson.optionDecoder[`Object`](n => n.string.flatMap(jStr => `Object`.to`Object`(jStr)), "`Object` failed to de-serialize")

  implicit val ProjectServiceAccountDeleteResponseCodecJson: CodecJson[ProjectServiceAccountDeleteResponse] = CodecJson.derive[ProjectServiceAccountDeleteResponse]
  implicit val ProjectServiceAccountDeleteResponseDecoder: EntityDecoder[ProjectServiceAccountDeleteResponse] = jsonOf[ProjectServiceAccountDeleteResponse]
  implicit val ProjectServiceAccountDeleteResponseEncoder: EntityEncoder[ProjectServiceAccountDeleteResponse] = jsonEncoderOf[ProjectServiceAccountDeleteResponse]
}
