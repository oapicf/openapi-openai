package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import Invite._

case class Invite (
  /* The object type, which is always `organization.invite` */
  `object`: `Object`,
/* The identifier, which can be referenced in API endpoints */
  id: String,
/* The email address of the individual to whom the invite was sent */
  email: String,
/* `owner` or `reader` */
  role: Role,
/* `accepted`,`expired`, or `pending` */
  status: Status,
/* The Unix timestamp (in seconds) of when the invite was sent. */
  invitedAt: Integer,
/* The Unix timestamp (in seconds) of when the invite expires. */
  expiresAt: Integer,
/* The Unix timestamp (in seconds) of when the invite was accepted. */
  acceptedAt: Option[Integer],
/* The projects that were granted membership upon acceptance of the invite. */
  projects: Option[List[InviteProjectsInner]])

object Invite {
  import DateTimeCodecs._
  sealed trait `Object`
  case object OrganizationInvite extends `Object`

  object `Object` {
    def to`Object`(s: String): Option[`Object`] = s match {
      case "OrganizationInvite" => Some(OrganizationInvite)
      case _ => None
    }

    def from`Object`(x: `Object`): String = x match {
      case OrganizationInvite => "OrganizationInvite"
    }
  }

  implicit val `Object`EnumEncoder: EncodeJson[`Object`] =
    EncodeJson[`Object`](is => StringEncodeJson(`Object`.from`Object`(is)))

  implicit val `Object`EnumDecoder: DecodeJson[`Object`] =
    DecodeJson.optionDecoder[`Object`](n => n.string.flatMap(jStr => `Object`.to`Object`(jStr)), "`Object` failed to de-serialize")
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
  sealed trait Status
  case object Accepted extends Status
  case object Expired extends Status
  case object Pending extends Status

  object Status {
    def toStatus(s: String): Option[Status] = s match {
      case "Accepted" => Some(Accepted)
      case "Expired" => Some(Expired)
      case "Pending" => Some(Pending)
      case _ => None
    }

    def fromStatus(x: Status): String = x match {
      case Accepted => "Accepted"
      case Expired => "Expired"
      case Pending => "Pending"
    }
  }

  implicit val StatusEnumEncoder: EncodeJson[Status] =
    EncodeJson[Status](is => StringEncodeJson(Status.fromStatus(is)))

  implicit val StatusEnumDecoder: DecodeJson[Status] =
    DecodeJson.optionDecoder[Status](n => n.string.flatMap(jStr => Status.toStatus(jStr)), "Status failed to de-serialize")

  implicit val InviteCodecJson: CodecJson[Invite] = CodecJson.derive[Invite]
  implicit val InviteDecoder: EntityDecoder[Invite] = jsonOf[Invite]
  implicit val InviteEncoder: EntityEncoder[Invite] = jsonEncoderOf[Invite]
}
