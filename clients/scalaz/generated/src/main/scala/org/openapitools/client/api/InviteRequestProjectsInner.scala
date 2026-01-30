package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import InviteRequestProjectsInner._

case class InviteRequestProjectsInner (
  /* Project's public ID */
  id: String,
/* Project membership role */
  role: Role)

object InviteRequestProjectsInner {
  import DateTimeCodecs._
  sealed trait Role
  case object Member extends Role
  case object Owner extends Role

  object Role {
    def toRole(s: String): Option[Role] = s match {
      case "Member" => Some(Member)
      case "Owner" => Some(Owner)
      case _ => None
    }

    def fromRole(x: Role): String = x match {
      case Member => "Member"
      case Owner => "Owner"
    }
  }

  implicit val RoleEnumEncoder: EncodeJson[Role] =
    EncodeJson[Role](is => StringEncodeJson(Role.fromRole(is)))

  implicit val RoleEnumDecoder: DecodeJson[Role] =
    DecodeJson.optionDecoder[Role](n => n.string.flatMap(jStr => Role.toRole(jStr)), "Role failed to de-serialize")

  implicit val InviteRequestProjectsInnerCodecJson: CodecJson[InviteRequestProjectsInner] = CodecJson.derive[InviteRequestProjectsInner]
  implicit val InviteRequestProjectsInnerDecoder: EntityDecoder[InviteRequestProjectsInner] = jsonOf[InviteRequestProjectsInner]
  implicit val InviteRequestProjectsInnerEncoder: EntityEncoder[InviteRequestProjectsInner] = jsonEncoderOf[InviteRequestProjectsInner]
}
