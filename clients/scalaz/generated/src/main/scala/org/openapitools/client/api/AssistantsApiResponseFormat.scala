package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AssistantsApiResponseFormat._

case class AssistantsApiResponseFormat (
  /* Must be one of `text` or `json_object`. */
  `type`: Option[`Type`])

object AssistantsApiResponseFormat {
  import DateTimeCodecs._
  sealed trait `Type`
  case object Text extends `Type`
  case object JsonObject extends `Type`

  object `Type` {
    def to`Type`(s: String): Option[`Type`] = s match {
      case "Text" => Some(Text)
      case "JsonObject" => Some(JsonObject)
      case _ => None
    }

    def from`Type`(x: `Type`): String = x match {
      case Text => "Text"
      case JsonObject => "JsonObject"
    }
  }

  implicit val `Type`EnumEncoder: EncodeJson[`Type`] =
    EncodeJson[`Type`](is => StringEncodeJson(`Type`.from`Type`(is)))

  implicit val `Type`EnumDecoder: DecodeJson[`Type`] =
    DecodeJson.optionDecoder[`Type`](n => n.string.flatMap(jStr => `Type`.to`Type`(jStr)), "`Type` failed to de-serialize")

  implicit val AssistantsApiResponseFormatCodecJson: CodecJson[AssistantsApiResponseFormat] = CodecJson.derive[AssistantsApiResponseFormat]
  implicit val AssistantsApiResponseFormatDecoder: EntityDecoder[AssistantsApiResponseFormat] = jsonOf[AssistantsApiResponseFormat]
  implicit val AssistantsApiResponseFormatEncoder: EntityEncoder[AssistantsApiResponseFormat] = jsonEncoderOf[AssistantsApiResponseFormat]
}
