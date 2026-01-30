package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import InviteRequest._

case class InviteRequest (
  /* Send an email to this address */
  email: String,
/* `owner` or `reader` */
  role: Role,
/* An array of projects to which membership is granted at the same time the org invite is accepted. If omitted, the user will be invited to the default project for compatibility with legacy behavior. */
  projects: Option[List[InviteRequestProjectsInner]])

object InviteRequest {
  import DateTimeCodecs._
  sealed trait Role
  case object Reader extends Role
  case object Owner extends Role

  object Role {
    def toRole(s: String): Option[Role] = s match {
      case "Reader" => Some(Reader)
      case "Owner" => Some(Owner)
      case _ => None
    }

    def fromRole(x: Role): String = x match {
      case Reader => "Reader"
      case Owner => "Owner"
    }
  }

  implicit val RoleEnumEncoder: EncodeJson[Role] =
    EncodeJson[Role](is => StringEncodeJson(Role.fromRole(is)))

  implicit val RoleEnumDecoder: DecodeJson[Role] =
    DecodeJson.optionDecoder[Role](n => n.string.flatMap(jStr => Role.toRole(jStr)), "Role failed to de-serialize")

  implicit val InviteRequestCodecJson: CodecJson[InviteRequest] = CodecJson.derive[InviteRequest]
  implicit val InviteRequestDecoder: EntityDecoder[InviteRequest] = jsonOf[InviteRequest]
  implicit val InviteRequestEncoder: EntityEncoder[InviteRequest] = jsonEncoderOf[InviteRequest]
}
