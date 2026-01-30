package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import UsageTimeBucketResultInner._

case class UsageTimeBucketResultInner (
  `object`: `Object`,
/* The aggregated number of input tokens used. */
  inputTokens: Integer,
/* The aggregated number of text input tokens that has been cached from previous requests. For customers subscribe to scale tier, this includes scale tier tokens. */
  inputCachedTokens: Option[Integer],
/* The aggregated number of text output tokens used. For customers subscribe to scale tier, this includes scale tier tokens. */
  outputTokens: Integer,
/* The aggregated number of audio input tokens used, including cached tokens. */
  inputAudioTokens: Option[Integer],
/* The aggregated number of audio output tokens used. */
  outputAudioTokens: Option[Integer],
/* The count of requests made to the model. */
  numModelRequests: Integer,
/* When `group_by=project_id`, this field provides the project ID of the grouped costs result. */
  projectId: Option[String],
/* When `group_by=user_id`, this field provides the user ID of the grouped usage result. */
  userId: Option[String],
/* When `group_by=api_key_id`, this field provides the API key ID of the grouped usage result. */
  apiKeyId: Option[String],
/* When `group_by=model`, this field provides the model name of the grouped usage result. */
  model: Option[String],
/* When `group_by=batch`, this field tells whether the grouped usage result is batch or not. */
  batch: Option[Boolean],
/* The number of images processed. */
  images: Integer,
/* When `group_by=source`, this field provides the source of the grouped usage result, possible values are `image.generation`, `image.edit`, `image.variation`. */
  source: Option[String],
/* When `group_by=size`, this field provides the image size of the grouped usage result. */
  size: Option[String],
/* The number of characters processed. */
  characters: Integer,
/* The number of seconds processed. */
  seconds: Integer,
/* The vector stores usage in bytes. */
  usageBytes: Integer,
/* The number of code interpreter sessions. */
  sessions: Integer,
amount: Option[CostsResultAmount],
/* When `group_by=line_item`, this field provides the line item of the grouped costs result. */
  lineItem: Option[String])

object UsageTimeBucketResultInner {
  import DateTimeCodecs._
  sealed trait `Object`
  case object OrganizationCostsResult extends `Object`

  object `Object` {
    def to`Object`(s: String): Option[`Object`] = s match {
      case "OrganizationCostsResult" => Some(OrganizationCostsResult)
      case _ => None
    }

    def from`Object`(x: `Object`): String = x match {
      case OrganizationCostsResult => "OrganizationCostsResult"
    }
  }

  implicit val `Object`EnumEncoder: EncodeJson[`Object`] =
    EncodeJson[`Object`](is => StringEncodeJson(`Object`.from`Object`(is)))

  implicit val `Object`EnumDecoder: DecodeJson[`Object`] =
    DecodeJson.optionDecoder[`Object`](n => n.string.flatMap(jStr => `Object`.to`Object`(jStr)), "`Object` failed to de-serialize")

  implicit val UsageTimeBucketResultInnerCodecJson: CodecJson[UsageTimeBucketResultInner] = CodecJson.derive[UsageTimeBucketResultInner]
  implicit val UsageTimeBucketResultInnerDecoder: EntityDecoder[UsageTimeBucketResultInner] = jsonOf[UsageTimeBucketResultInner]
  implicit val UsageTimeBucketResultInnerEncoder: EntityEncoder[UsageTimeBucketResultInner] = jsonEncoderOf[UsageTimeBucketResultInner]
}
