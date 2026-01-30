package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import UsageResponse._

case class UsageResponse (
  `object`: `Object`,
data: List[UsageTimeBucket],
hasMore: Boolean,
nextPage: String)

object UsageResponse {
  import DateTimeCodecs._
  sealed trait `Object`
  case object Page extends `Object`

  object `Object` {
    def to`Object`(s: String): Option[`Object`] = s match {
      case "Page" => Some(Page)
      case _ => None
    }

    def from`Object`(x: `Object`): String = x match {
      case Page => "Page"
    }
  }

  implicit val `Object`EnumEncoder: EncodeJson[`Object`] =
    EncodeJson[`Object`](is => StringEncodeJson(`Object`.from`Object`(is)))

  implicit val `Object`EnumDecoder: DecodeJson[`Object`] =
    DecodeJson.optionDecoder[`Object`](n => n.string.flatMap(jStr => `Object`.to`Object`(jStr)), "`Object` failed to de-serialize")

  implicit val UsageResponseCodecJson: CodecJson[UsageResponse] = CodecJson.derive[UsageResponse]
  implicit val UsageResponseDecoder: EntityDecoder[UsageResponse] = jsonOf[UsageResponse]
  implicit val UsageResponseEncoder: EntityEncoder[UsageResponse] = jsonEncoderOf[UsageResponse]
}
