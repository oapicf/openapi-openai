package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ProjectApiKeyDeleteResponse._

case class ProjectApiKeyDeleteResponse (
  `object`: `Object`,
id: String,
deleted: Boolean)

object ProjectApiKeyDeleteResponse {
  import DateTimeCodecs._
  sealed trait `Object`
  case object OrganizationProjectApiKeyDeleted extends `Object`

  object `Object` {
    def to`Object`(s: String): Option[`Object`] = s match {
      case "OrganizationProjectApiKeyDeleted" => Some(OrganizationProjectApiKeyDeleted)
      case _ => None
    }

    def from`Object`(x: `Object`): String = x match {
      case OrganizationProjectApiKeyDeleted => "OrganizationProjectApiKeyDeleted"
    }
  }

  implicit val `Object`EnumEncoder: EncodeJson[`Object`] =
    EncodeJson[`Object`](is => StringEncodeJson(`Object`.from`Object`(is)))

  implicit val `Object`EnumDecoder: DecodeJson[`Object`] =
    DecodeJson.optionDecoder[`Object`](n => n.string.flatMap(jStr => `Object`.to`Object`(jStr)), "`Object` failed to de-serialize")

  implicit val ProjectApiKeyDeleteResponseCodecJson: CodecJson[ProjectApiKeyDeleteResponse] = CodecJson.derive[ProjectApiKeyDeleteResponse]
  implicit val ProjectApiKeyDeleteResponseDecoder: EntityDecoder[ProjectApiKeyDeleteResponse] = jsonOf[ProjectApiKeyDeleteResponse]
  implicit val ProjectApiKeyDeleteResponseEncoder: EntityEncoder[ProjectApiKeyDeleteResponse] = jsonEncoderOf[ProjectApiKeyDeleteResponse]
}
