package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import UsageAudioTranscriptionsResult._

case class UsageAudioTranscriptionsResult (
  `object`: `Object`,
/* The number of seconds processed. */
  seconds: Integer,
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

object UsageAudioTranscriptionsResult {
  import DateTimeCodecs._
  sealed trait `Object`
  case object OrganizationUsageAudioTranscriptionsResult extends `Object`

  object `Object` {
    def to`Object`(s: String): Option[`Object`] = s match {
      case "OrganizationUsageAudioTranscriptionsResult" => Some(OrganizationUsageAudioTranscriptionsResult)
      case _ => None
    }

    def from`Object`(x: `Object`): String = x match {
      case OrganizationUsageAudioTranscriptionsResult => "OrganizationUsageAudioTranscriptionsResult"
    }
  }

  implicit val `Object`EnumEncoder: EncodeJson[`Object`] =
    EncodeJson[`Object`](is => StringEncodeJson(`Object`.from`Object`(is)))

  implicit val `Object`EnumDecoder: DecodeJson[`Object`] =
    DecodeJson.optionDecoder[`Object`](n => n.string.flatMap(jStr => `Object`.to`Object`(jStr)), "`Object` failed to de-serialize")

  implicit val UsageAudioTranscriptionsResultCodecJson: CodecJson[UsageAudioTranscriptionsResult] = CodecJson.derive[UsageAudioTranscriptionsResult]
  implicit val UsageAudioTranscriptionsResultDecoder: EntityDecoder[UsageAudioTranscriptionsResult] = jsonOf[UsageAudioTranscriptionsResult]
  implicit val UsageAudioTranscriptionsResultEncoder: EntityEncoder[UsageAudioTranscriptionsResult] = jsonEncoderOf[UsageAudioTranscriptionsResult]
}
