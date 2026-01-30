package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import UsageImagesResult._

case class UsageImagesResult (
  `object`: `Object`,
/* The number of images processed. */
  images: Integer,
/* The count of requests made to the model. */
  numModelRequests: Integer,
/* When `group_by=source`, this field provides the source of the grouped usage result, possible values are `image.generation`, `image.edit`, `image.variation`. */
  source: Option[String],
/* When `group_by=size`, this field provides the image size of the grouped usage result. */
  size: Option[String],
/* When `group_by=project_id`, this field provides the project ID of the grouped usage result. */
  projectId: Option[String],
/* When `group_by=user_id`, this field provides the user ID of the grouped usage result. */
  userId: Option[String],
/* When `group_by=api_key_id`, this field provides the API key ID of the grouped usage result. */
  apiKeyId: Option[String],
/* When `group_by=model`, this field provides the model name of the grouped usage result. */
  model: Option[String])

object UsageImagesResult {
  import DateTimeCodecs._
  sealed trait `Object`
  case object OrganizationUsageImagesResult extends `Object`

  object `Object` {
    def to`Object`(s: String): Option[`Object`] = s match {
      case "OrganizationUsageImagesResult" => Some(OrganizationUsageImagesResult)
      case _ => None
    }

    def from`Object`(x: `Object`): String = x match {
      case OrganizationUsageImagesResult => "OrganizationUsageImagesResult"
    }
  }

  implicit val `Object`EnumEncoder: EncodeJson[`Object`] =
    EncodeJson[`Object`](is => StringEncodeJson(`Object`.from`Object`(is)))

  implicit val `Object`EnumDecoder: DecodeJson[`Object`] =
    DecodeJson.optionDecoder[`Object`](n => n.string.flatMap(jStr => `Object`.to`Object`(jStr)), "`Object` failed to de-serialize")

  implicit val UsageImagesResultCodecJson: CodecJson[UsageImagesResult] = CodecJson.derive[UsageImagesResult]
  implicit val UsageImagesResultDecoder: EntityDecoder[UsageImagesResult] = jsonOf[UsageImagesResult]
  implicit val UsageImagesResultEncoder: EntityEncoder[UsageImagesResult] = jsonEncoderOf[UsageImagesResult]
}
