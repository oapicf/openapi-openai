package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ListFilesResponse._

case class ListFilesResponse (
  data: List[OpenAIFile],
`object`: `Object`)

object ListFilesResponse {
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

  implicit val ListFilesResponseCodecJson: CodecJson[ListFilesResponse] = CodecJson.derive[ListFilesResponse]
  implicit val ListFilesResponseDecoder: EntityDecoder[ListFilesResponse] = jsonOf[ListFilesResponse]
  implicit val ListFilesResponseEncoder: EntityEncoder[ListFilesResponse] = jsonEncoderOf[ListFilesResponse]
}
