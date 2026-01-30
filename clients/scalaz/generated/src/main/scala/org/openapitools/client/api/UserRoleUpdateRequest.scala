package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import UserRoleUpdateRequest._

case class UserRoleUpdateRequest (
  /* `owner` or `reader` */
  role: Role)

object UserRoleUpdateRequest {
  import DateTimeCodecs._
  sealed trait Role
  case object Owner extends Role
  case object Reader extends Role

  object Role {
    def toRole(s: String): Option[Role] = s match {
      case "Owner" => Some(Owner)
      case "Reader" => Some(Reader)
      case _ => None
    }

    def fromRole(x: Role): String = x match {
      case Owner => "Owner"
      case Reader => "Reader"
    }
  }

  implicit val RoleEnumEncoder: EncodeJson[Role] =
    EncodeJson[Role](is => StringEncodeJson(Role.fromRole(is)))

  implicit val RoleEnumDecoder: DecodeJson[Role] =
    DecodeJson.optionDecoder[Role](n => n.string.flatMap(jStr => Role.toRole(jStr)), "Role failed to de-serialize")

  implicit val UserRoleUpdateRequestCodecJson: CodecJson[UserRoleUpdateRequest] = CodecJson.derive[UserRoleUpdateRequest]
  implicit val UserRoleUpdateRequestDecoder: EntityDecoder[UserRoleUpdateRequest] = jsonOf[UserRoleUpdateRequest]
  implicit val UserRoleUpdateRequestEncoder: EntityEncoder[UserRoleUpdateRequest] = jsonEncoderOf[UserRoleUpdateRequest]
}
