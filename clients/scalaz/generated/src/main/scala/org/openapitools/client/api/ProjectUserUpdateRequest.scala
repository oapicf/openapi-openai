package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ProjectUserUpdateRequest._

case class ProjectUserUpdateRequest (
  /* `owner` or `member` */
  role: Role)

object ProjectUserUpdateRequest {
  import DateTimeCodecs._
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

  implicit val ProjectUserUpdateRequestCodecJson: CodecJson[ProjectUserUpdateRequest] = CodecJson.derive[ProjectUserUpdateRequest]
  implicit val ProjectUserUpdateRequestDecoder: EntityDecoder[ProjectUserUpdateRequest] = jsonOf[ProjectUserUpdateRequest]
  implicit val ProjectUserUpdateRequestEncoder: EntityEncoder[ProjectUserUpdateRequest] = jsonEncoderOf[ProjectUserUpdateRequest]
}
