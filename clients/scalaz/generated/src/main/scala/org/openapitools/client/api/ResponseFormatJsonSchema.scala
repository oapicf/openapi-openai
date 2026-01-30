package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ResponseFormatJsonSchema._

case class ResponseFormatJsonSchema (
  /* The type of response format being defined: `json_schema` */
  `type`: `Type`,
jsonSchema: ResponseFormatJsonSchemaJsonSchema)

object ResponseFormatJsonSchema {
  import DateTimeCodecs._
  sealed trait `Type`
  case object JsonSchema extends `Type`

  object `Type` {
    def to`Type`(s: String): Option[`Type`] = s match {
      case "JsonSchema" => Some(JsonSchema)
      case _ => None
    }

    def from`Type`(x: `Type`): String = x match {
      case JsonSchema => "JsonSchema"
    }
  }

  implicit val `Type`EnumEncoder: EncodeJson[`Type`] =
    EncodeJson[`Type`](is => StringEncodeJson(`Type`.from`Type`(is)))

  implicit val `Type`EnumDecoder: DecodeJson[`Type`] =
    DecodeJson.optionDecoder[`Type`](n => n.string.flatMap(jStr => `Type`.to`Type`(jStr)), "`Type` failed to de-serialize")

  implicit val ResponseFormatJsonSchemaCodecJson: CodecJson[ResponseFormatJsonSchema] = CodecJson.derive[ResponseFormatJsonSchema]
  implicit val ResponseFormatJsonSchemaDecoder: EntityDecoder[ResponseFormatJsonSchema] = jsonOf[ResponseFormatJsonSchema]
  implicit val ResponseFormatJsonSchemaEncoder: EntityEncoder[ResponseFormatJsonSchema] = jsonEncoderOf[ResponseFormatJsonSchema]
}
