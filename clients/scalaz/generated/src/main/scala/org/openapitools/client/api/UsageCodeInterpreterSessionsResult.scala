package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import UsageCodeInterpreterSessionsResult._

case class UsageCodeInterpreterSessionsResult (
  `object`: `Object`,
/* The number of code interpreter sessions. */
  sessions: Integer,
/* When `group_by=project_id`, this field provides the project ID of the grouped usage result. */
  projectId: Option[String])

object UsageCodeInterpreterSessionsResult {
  import DateTimeCodecs._
  sealed trait `Object`
  case object OrganizationUsageCodeInterpreterSessionsResult extends `Object`

  object `Object` {
    def to`Object`(s: String): Option[`Object`] = s match {
      case "OrganizationUsageCodeInterpreterSessionsResult" => Some(OrganizationUsageCodeInterpreterSessionsResult)
      case _ => None
    }

    def from`Object`(x: `Object`): String = x match {
      case OrganizationUsageCodeInterpreterSessionsResult => "OrganizationUsageCodeInterpreterSessionsResult"
    }
  }

  implicit val `Object`EnumEncoder: EncodeJson[`Object`] =
    EncodeJson[`Object`](is => StringEncodeJson(`Object`.from`Object`(is)))

  implicit val `Object`EnumDecoder: DecodeJson[`Object`] =
    DecodeJson.optionDecoder[`Object`](n => n.string.flatMap(jStr => `Object`.to`Object`(jStr)), "`Object` failed to de-serialize")

  implicit val UsageCodeInterpreterSessionsResultCodecJson: CodecJson[UsageCodeInterpreterSessionsResult] = CodecJson.derive[UsageCodeInterpreterSessionsResult]
  implicit val UsageCodeInterpreterSessionsResultDecoder: EntityDecoder[UsageCodeInterpreterSessionsResult] = jsonOf[UsageCodeInterpreterSessionsResult]
  implicit val UsageCodeInterpreterSessionsResultEncoder: EntityEncoder[UsageCodeInterpreterSessionsResult] = jsonEncoderOf[UsageCodeInterpreterSessionsResult]
}
