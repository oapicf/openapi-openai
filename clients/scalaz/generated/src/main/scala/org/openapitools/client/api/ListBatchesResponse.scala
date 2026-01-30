package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ListBatchesResponse._

case class ListBatchesResponse (
  data: List[Batch],
firstId: Option[String],
lastId: Option[String],
hasMore: Boolean,
`object`: `Object`)

object ListBatchesResponse {
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

  implicit val ListBatchesResponseCodecJson: CodecJson[ListBatchesResponse] = CodecJson.derive[ListBatchesResponse]
  implicit val ListBatchesResponseDecoder: EntityDecoder[ListBatchesResponse] = jsonOf[ListBatchesResponse]
  implicit val ListBatchesResponseEncoder: EntityEncoder[ListBatchesResponse] = jsonEncoderOf[ListBatchesResponse]
}
