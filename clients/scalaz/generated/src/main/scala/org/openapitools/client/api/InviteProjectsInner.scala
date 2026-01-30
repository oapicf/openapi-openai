package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import InviteProjectsInner._

case class InviteProjectsInner (
  /* Project's public ID */
  id: Option[String],
/* Project membership role */
  role: Option[Role])

object InviteProjectsInner {
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

  implicit val InviteProjectsInnerCodecJson: CodecJson[InviteProjectsInner] = CodecJson.derive[InviteProjectsInner]
  implicit val InviteProjectsInnerDecoder: EntityDecoder[InviteProjectsInner] = jsonOf[InviteProjectsInner]
  implicit val InviteProjectsInnerEncoder: EntityEncoder[InviteProjectsInner] = jsonEncoderOf[InviteProjectsInner]
}
