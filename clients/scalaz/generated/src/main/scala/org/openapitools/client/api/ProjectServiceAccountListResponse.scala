package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ProjectServiceAccountListResponse._

case class ProjectServiceAccountListResponse (
  `object`: `Object`,
data: List[ProjectServiceAccount],
firstId: String,
lastId: String,
hasMore: Boolean)

object ProjectServiceAccountListResponse {
  import DateTimeCodecs._
  sealed trait `Object`
  case object List extends `Object`

  object `Object` {
    def to`Object`(s: String): Option[`Object`] = s match {
      case "List" => Some(List)
      case _ => None
    }

    def from`Object`(x: `Object`): String = x match {
      case List => "List"
    }
  }

  implicit val `Object`EnumEncoder: EncodeJson[`Object`] =
    EncodeJson[`Object`](is => StringEncodeJson(`Object`.from`Object`(is)))

  implicit val `Object`EnumDecoder: DecodeJson[`Object`] =
    DecodeJson.optionDecoder[`Object`](n => n.string.flatMap(jStr => `Object`.to`Object`(jStr)), "`Object` failed to de-serialize")

  implicit val ProjectServiceAccountListResponseCodecJson: CodecJson[ProjectServiceAccountListResponse] = CodecJson.derive[ProjectServiceAccountListResponse]
  implicit val ProjectServiceAccountListResponseDecoder: EntityDecoder[ProjectServiceAccountListResponse] = jsonOf[ProjectServiceAccountListResponse]
  implicit val ProjectServiceAccountListResponseEncoder: EntityEncoder[ProjectServiceAccountListResponse] = jsonEncoderOf[ProjectServiceAccountListResponse]
}
