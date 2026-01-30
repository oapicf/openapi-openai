package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import UsageTimeBucket._

case class UsageTimeBucket (
  `object`: `Object`,
startTime: Integer,
endTime: Integer,
result: List[UsageTimeBucketResultInner])

object UsageTimeBucket {
  import DateTimeCodecs._
  sealed trait `Object`
  case object Bucket extends `Object`

  object `Object` {
    def to`Object`(s: String): Option[`Object`] = s match {
      case "Bucket" => Some(Bucket)
      case _ => None
    }

    def from`Object`(x: `Object`): String = x match {
      case Bucket => "Bucket"
    }
  }

  implicit val `Object`EnumEncoder: EncodeJson[`Object`] =
    EncodeJson[`Object`](is => StringEncodeJson(`Object`.from`Object`(is)))

  implicit val `Object`EnumDecoder: DecodeJson[`Object`] =
    DecodeJson.optionDecoder[`Object`](n => n.string.flatMap(jStr => `Object`.to`Object`(jStr)), "`Object` failed to de-serialize")

  implicit val UsageTimeBucketCodecJson: CodecJson[UsageTimeBucket] = CodecJson.derive[UsageTimeBucket]
  implicit val UsageTimeBucketDecoder: EntityDecoder[UsageTimeBucket] = jsonOf[UsageTimeBucket]
  implicit val UsageTimeBucketEncoder: EntityEncoder[UsageTimeBucket] = jsonEncoderOf[UsageTimeBucket]
}
