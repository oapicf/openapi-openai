package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AssistantsApiResponseFormatOption._

case class AssistantsApiResponseFormatOption (
  /* The type of response format being defined: `text` */
  `type`: `Type`,
jsonSchema: ResponseFormatJsonSchemaJsonSchema)

object AssistantsApiResponseFormatOption {
  import DateTimeCodecs._
  sealed trait `Type`
  case object Text extends `Type`
  case object JsonObject extends `Type`
  case object JsonSchema extends `Type`

  object `Type` {
    def to`Type`(s: String): Option[`Type`] = s match {
      case "Text" => Some(Text)
      case "JsonObject" => Some(JsonObject)
      case "JsonSchema" => Some(JsonSchema)
      case _ => None
    }

    def from`Type`(x: `Type`): String = x match {
      case Text => "Text"
      case JsonObject => "JsonObject"
      case JsonSchema => "JsonSchema"
    }
  }

  implicit val `Type`EnumEncoder: EncodeJson[`Type`] =
    EncodeJson[`Type`](is => StringEncodeJson(`Type`.from`Type`(is)))

  implicit val `Type`EnumDecoder: DecodeJson[`Type`] =
    DecodeJson.optionDecoder[`Type`](n => n.string.flatMap(jStr => `Type`.to`Type`(jStr)), "`Type` failed to de-serialize")

  implicit val AssistantsApiResponseFormatOptionCodecJson: CodecJson[AssistantsApiResponseFormatOption] = CodecJson.derive[AssistantsApiResponseFormatOption]
  implicit val AssistantsApiResponseFormatOptionDecoder: EntityDecoder[AssistantsApiResponseFormatOption] = jsonOf[AssistantsApiResponseFormatOption]
  implicit val AssistantsApiResponseFormatOptionEncoder: EntityEncoder[AssistantsApiResponseFormatOption] = jsonEncoderOf[AssistantsApiResponseFormatOption]
}
