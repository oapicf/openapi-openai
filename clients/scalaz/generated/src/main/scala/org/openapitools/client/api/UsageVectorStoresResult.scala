package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import UsageVectorStoresResult._

case class UsageVectorStoresResult (
  `object`: `Object`,
/* The vector stores usage in bytes. */
  usageBytes: Integer,
/* When `group_by=project_id`, this field provides the project ID of the grouped usage result. */
  projectId: Option[String])

object UsageVectorStoresResult {
  import DateTimeCodecs._
  sealed trait `Object`
  case object OrganizationUsageVectorStoresResult extends `Object`

  object `Object` {
    def to`Object`(s: String): Option[`Object`] = s match {
      case "OrganizationUsageVectorStoresResult" => Some(OrganizationUsageVectorStoresResult)
      case _ => None
    }

    def from`Object`(x: `Object`): String = x match {
      case OrganizationUsageVectorStoresResult => "OrganizationUsageVectorStoresResult"
    }
  }

  implicit val `Object`EnumEncoder: EncodeJson[`Object`] =
    EncodeJson[`Object`](is => StringEncodeJson(`Object`.from`Object`(is)))

  implicit val `Object`EnumDecoder: DecodeJson[`Object`] =
    DecodeJson.optionDecoder[`Object`](n => n.string.flatMap(jStr => `Object`.to`Object`(jStr)), "`Object` failed to de-serialize")

  implicit val UsageVectorStoresResultCodecJson: CodecJson[UsageVectorStoresResult] = CodecJson.derive[UsageVectorStoresResult]
  implicit val UsageVectorStoresResultDecoder: EntityDecoder[UsageVectorStoresResult] = jsonOf[UsageVectorStoresResult]
  implicit val UsageVectorStoresResultEncoder: EntityEncoder[UsageVectorStoresResult] = jsonEncoderOf[UsageVectorStoresResult]
}
