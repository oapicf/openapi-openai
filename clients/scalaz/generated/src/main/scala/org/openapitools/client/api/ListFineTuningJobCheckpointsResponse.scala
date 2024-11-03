package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ListFineTuningJobCheckpointsResponse._

case class ListFineTuningJobCheckpointsResponse (
  data: List[FineTuningJobCheckpoint],
`object`: `Object`,
firstId: Option[String],
lastId: Option[String],
hasMore: Boolean)

object ListFineTuningJobCheckpointsResponse {
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

  implicit val ListFineTuningJobCheckpointsResponseCodecJson: CodecJson[ListFineTuningJobCheckpointsResponse] = CodecJson.derive[ListFineTuningJobCheckpointsResponse]
  implicit val ListFineTuningJobCheckpointsResponseDecoder: EntityDecoder[ListFineTuningJobCheckpointsResponse] = jsonOf[ListFineTuningJobCheckpointsResponse]
  implicit val ListFineTuningJobCheckpointsResponseEncoder: EntityEncoder[ListFineTuningJobCheckpointsResponse] = jsonEncoderOf[ListFineTuningJobCheckpointsResponse]
}
