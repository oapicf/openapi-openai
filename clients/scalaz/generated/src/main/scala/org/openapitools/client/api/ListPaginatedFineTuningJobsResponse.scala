package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ListPaginatedFineTuningJobsResponse._

case class ListPaginatedFineTuningJobsResponse (
  data: List[FineTuningJob],
hasMore: Boolean,
`object`: `Object`)

object ListPaginatedFineTuningJobsResponse {
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

  implicit val ListPaginatedFineTuningJobsResponseCodecJson: CodecJson[ListPaginatedFineTuningJobsResponse] = CodecJson.derive[ListPaginatedFineTuningJobsResponse]
  implicit val ListPaginatedFineTuningJobsResponseDecoder: EntityDecoder[ListPaginatedFineTuningJobsResponse] = jsonOf[ListPaginatedFineTuningJobsResponse]
  implicit val ListPaginatedFineTuningJobsResponseEncoder: EntityEncoder[ListPaginatedFineTuningJobsResponse] = jsonEncoderOf[ListPaginatedFineTuningJobsResponse]
}
