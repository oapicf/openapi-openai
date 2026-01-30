package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CostsResult._

case class CostsResult (
  `object`: `Object`,
amount: Option[CostsResultAmount],
/* When `group_by=line_item`, this field provides the line item of the grouped costs result. */
  lineItem: Option[String],
/* When `group_by=project_id`, this field provides the project ID of the grouped costs result. */
  projectId: Option[String])

object CostsResult {
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

  implicit val CostsResultCodecJson: CodecJson[CostsResult] = CodecJson.derive[CostsResult]
  implicit val CostsResultDecoder: EntityDecoder[CostsResult] = jsonOf[CostsResult]
  implicit val CostsResultEncoder: EntityEncoder[CostsResult] = jsonEncoderOf[CostsResult]
}
