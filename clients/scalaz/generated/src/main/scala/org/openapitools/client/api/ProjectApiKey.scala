package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ProjectApiKey._

case class ProjectApiKey (
  /* The object type, which is always `organization.project.api_key` */
  `object`: `Object`,
/* The redacted value of the API key */
  redactedValue: String,
/* The name of the API key */
  name: String,
/* The Unix timestamp (in seconds) of when the API key was created */
  createdAt: Integer,
/* The identifier, which can be referenced in API endpoints */
  id: String,
owner: ProjectApiKeyOwner)

object ProjectApiKey {
  import DateTimeCodecs._
  sealed trait `Object`
  case object OrganizationProjectApiKey extends `Object`

  object `Object` {
    def to`Object`(s: String): Option[`Object`] = s match {
      case "OrganizationProjectApiKey" => Some(OrganizationProjectApiKey)
      case _ => None
    }

    def from`Object`(x: `Object`): String = x match {
      case OrganizationProjectApiKey => "OrganizationProjectApiKey"
    }
  }

  implicit val `Object`EnumEncoder: EncodeJson[`Object`] =
    EncodeJson[`Object`](is => StringEncodeJson(`Object`.from`Object`(is)))

  implicit val `Object`EnumDecoder: DecodeJson[`Object`] =
    DecodeJson.optionDecoder[`Object`](n => n.string.flatMap(jStr => `Object`.to`Object`(jStr)), "`Object` failed to de-serialize")

  implicit val ProjectApiKeyCodecJson: CodecJson[ProjectApiKey] = CodecJson.derive[ProjectApiKey]
  implicit val ProjectApiKeyDecoder: EntityDecoder[ProjectApiKey] = jsonOf[ProjectApiKey]
  implicit val ProjectApiKeyEncoder: EntityEncoder[ProjectApiKey] = jsonEncoderOf[ProjectApiKey]
}
