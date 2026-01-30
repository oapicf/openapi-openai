package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import Project._

case class Project (
  /* The identifier, which can be referenced in API endpoints */
  id: String,
/* The object type, which is always `organization.project` */
  `object`: `Object`,
/* The name of the project. This appears in reporting. */
  name: String,
/* The Unix timestamp (in seconds) of when the project was created. */
  createdAt: Integer,
/* The Unix timestamp (in seconds) of when the project was archived or `null`. */
  archivedAt: Option[Integer],
/* `active` or `archived` */
  status: Status)

object Project {
  import DateTimeCodecs._
  sealed trait `Object`
  case object OrganizationProject extends `Object`

  object `Object` {
    def to`Object`(s: String): Option[`Object`] = s match {
      case "OrganizationProject" => Some(OrganizationProject)
      case _ => None
    }

    def from`Object`(x: `Object`): String = x match {
      case OrganizationProject => "OrganizationProject"
    }
  }

  implicit val `Object`EnumEncoder: EncodeJson[`Object`] =
    EncodeJson[`Object`](is => StringEncodeJson(`Object`.from`Object`(is)))

  implicit val `Object`EnumDecoder: DecodeJson[`Object`] =
    DecodeJson.optionDecoder[`Object`](n => n.string.flatMap(jStr => `Object`.to`Object`(jStr)), "`Object` failed to de-serialize")
  sealed trait Status
  case object Active extends Status
  case object Archived extends Status

  object Status {
    def toStatus(s: String): Option[Status] = s match {
      case "Active" => Some(Active)
      case "Archived" => Some(Archived)
      case _ => None
    }

    def fromStatus(x: Status): String = x match {
      case Active => "Active"
      case Archived => "Archived"
    }
  }

  implicit val StatusEnumEncoder: EncodeJson[Status] =
    EncodeJson[Status](is => StringEncodeJson(Status.fromStatus(is)))

  implicit val StatusEnumDecoder: DecodeJson[Status] =
    DecodeJson.optionDecoder[Status](n => n.string.flatMap(jStr => Status.toStatus(jStr)), "Status failed to de-serialize")

  implicit val ProjectCodecJson: CodecJson[Project] = CodecJson.derive[Project]
  implicit val ProjectDecoder: EntityDecoder[Project] = jsonOf[Project]
  implicit val ProjectEncoder: EntityEncoder[Project] = jsonEncoderOf[Project]
}
