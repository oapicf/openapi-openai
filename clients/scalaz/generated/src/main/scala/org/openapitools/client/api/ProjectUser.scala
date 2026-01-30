package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ProjectUser._

case class ProjectUser (
  /* The object type, which is always `organization.project.user` */
  `object`: `Object`,
/* The identifier, which can be referenced in API endpoints */
  id: String,
/* The name of the user */
  name: String,
/* The email address of the user */
  email: String,
/* `owner` or `member` */
  role: Role,
/* The Unix timestamp (in seconds) of when the project was added. */
  addedAt: Integer)

object ProjectUser {
  import DateTimeCodecs._
  sealed trait `Object`
  case object OrganizationProjectUser extends `Object`

  object `Object` {
    def to`Object`(s: String): Option[`Object`] = s match {
      case "OrganizationProjectUser" => Some(OrganizationProjectUser)
      case _ => None
    }

    def from`Object`(x: `Object`): String = x match {
      case OrganizationProjectUser => "OrganizationProjectUser"
    }
  }

  implicit val `Object`EnumEncoder: EncodeJson[`Object`] =
    EncodeJson[`Object`](is => StringEncodeJson(`Object`.from`Object`(is)))

  implicit val `Object`EnumDecoder: DecodeJson[`Object`] =
    DecodeJson.optionDecoder[`Object`](n => n.string.flatMap(jStr => `Object`.to`Object`(jStr)), "`Object` failed to de-serialize")
  sealed trait Role
  case object Owner extends Role
  case object Member extends Role

  object Role {
    def toRole(s: String): Option[Role] = s match {
      case "Owner" => Some(Owner)
      case "Member" => Some(Member)
      case _ => None
    }

    def fromRole(x: Role): String = x match {
      case Owner => "Owner"
      case Member => "Member"
    }
  }

  implicit val RoleEnumEncoder: EncodeJson[Role] =
    EncodeJson[Role](is => StringEncodeJson(Role.fromRole(is)))

  implicit val RoleEnumDecoder: DecodeJson[Role] =
    DecodeJson.optionDecoder[Role](n => n.string.flatMap(jStr => Role.toRole(jStr)), "Role failed to de-serialize")

  implicit val ProjectUserCodecJson: CodecJson[ProjectUser] = CodecJson.derive[ProjectUser]
  implicit val ProjectUserDecoder: EntityDecoder[ProjectUser] = jsonOf[ProjectUser]
  implicit val ProjectUserEncoder: EntityEncoder[ProjectUser] = jsonEncoderOf[ProjectUser]
}
