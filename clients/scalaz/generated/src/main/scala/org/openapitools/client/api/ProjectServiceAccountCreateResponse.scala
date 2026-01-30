package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ProjectServiceAccountCreateResponse._

case class ProjectServiceAccountCreateResponse (
  `object`: `Object`,
id: String,
name: String,
/* Service accounts can only have one role of type `member` */
  role: Role,
createdAt: Integer,
apiKey: ProjectServiceAccountApiKey)

object ProjectServiceAccountCreateResponse {
  import DateTimeCodecs._
  sealed trait `Object`
  case object OrganizationProjectServiceAccount extends `Object`

  object `Object` {
    def to`Object`(s: String): Option[`Object`] = s match {
      case "OrganizationProjectServiceAccount" => Some(OrganizationProjectServiceAccount)
      case _ => None
    }

    def from`Object`(x: `Object`): String = x match {
      case OrganizationProjectServiceAccount => "OrganizationProjectServiceAccount"
    }
  }

  implicit val `Object`EnumEncoder: EncodeJson[`Object`] =
    EncodeJson[`Object`](is => StringEncodeJson(`Object`.from`Object`(is)))

  implicit val `Object`EnumDecoder: DecodeJson[`Object`] =
    DecodeJson.optionDecoder[`Object`](n => n.string.flatMap(jStr => `Object`.to`Object`(jStr)), "`Object` failed to de-serialize")
  sealed trait Role
  case object Member extends Role

  object Role {
    def toRole(s: String): Option[Role] = s match {
      case "Member" => Some(Member)
      case _ => None
    }

    def fromRole(x: Role): String = x match {
      case Member => "Member"
    }
  }

  implicit val RoleEnumEncoder: EncodeJson[Role] =
    EncodeJson[Role](is => StringEncodeJson(Role.fromRole(is)))

  implicit val RoleEnumDecoder: DecodeJson[Role] =
    DecodeJson.optionDecoder[Role](n => n.string.flatMap(jStr => Role.toRole(jStr)), "Role failed to de-serialize")

  implicit val ProjectServiceAccountCreateResponseCodecJson: CodecJson[ProjectServiceAccountCreateResponse] = CodecJson.derive[ProjectServiceAccountCreateResponse]
  implicit val ProjectServiceAccountCreateResponseDecoder: EntityDecoder[ProjectServiceAccountCreateResponse] = jsonOf[ProjectServiceAccountCreateResponse]
  implicit val ProjectServiceAccountCreateResponseEncoder: EntityEncoder[ProjectServiceAccountCreateResponse] = jsonEncoderOf[ProjectServiceAccountCreateResponse]
}
