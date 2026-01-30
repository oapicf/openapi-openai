package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import UsageModerationsResult._

case class UsageModerationsResult (
  `object`: `Object`,
/* The aggregated number of input tokens used. */
  inputTokens: Integer,
/* The count of requests made to the model. */
  numModelRequests: Integer,
/* When `group_by=project_id`, this field provides the project ID of the grouped usage result. */
  projectId: Option[String],
/* When `group_by=user_id`, this field provides the user ID of the grouped usage result. */
  userId: Option[String],
/* When `group_by=api_key_id`, this field provides the API key ID of the grouped usage result. */
  apiKeyId: Option[String],
/* When `group_by=model`, this field provides the model name of the grouped usage result. */
  model: Option[String])

object UsageModerationsResult {
  import DateTimeCodecs._
  sealed trait `Object`
  case object OrganizationUsageModerationsResult extends `Object`

  object `Object` {
    def to`Object`(s: String): Option[`Object`] = s match {
      case "OrganizationUsageModerationsResult" => Some(OrganizationUsageModerationsResult)
      case _ => None
    }

    def from`Object`(x: `Object`): String = x match {
      case OrganizationUsageModerationsResult => "OrganizationUsageModerationsResult"
    }
  }

  implicit val `Object`EnumEncoder: EncodeJson[`Object`] =
    EncodeJson[`Object`](is => StringEncodeJson(`Object`.from`Object`(is)))

  implicit val `Object`EnumDecoder: DecodeJson[`Object`] =
    DecodeJson.optionDecoder[`Object`](n => n.string.flatMap(jStr => `Object`.to`Object`(jStr)), "`Object` failed to de-serialize")

  implicit val UsageModerationsResultCodecJson: CodecJson[UsageModerationsResult] = CodecJson.derive[UsageModerationsResult]
  implicit val UsageModerationsResultDecoder: EntityDecoder[UsageModerationsResult] = jsonOf[UsageModerationsResult]
  implicit val UsageModerationsResultEncoder: EntityEncoder[UsageModerationsResult] = jsonEncoderOf[UsageModerationsResult]
}
