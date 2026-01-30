package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import StaticChunkingStrategy._

case class StaticChunkingStrategy (
  /* Always `static`. */
  `type`: `Type`,
static: StaticChunkingStrategyStatic)

object StaticChunkingStrategy {
  import DateTimeCodecs._
  sealed trait `Type`
  case object Static extends `Type`

  object `Type` {
    def to`Type`(s: String): Option[`Type`] = s match {
      case "Static" => Some(Static)
      case _ => None
    }

    def from`Type`(x: `Type`): String = x match {
      case Static => "Static"
    }
  }

  implicit val `Type`EnumEncoder: EncodeJson[`Type`] =
    EncodeJson[`Type`](is => StringEncodeJson(`Type`.from`Type`(is)))

  implicit val `Type`EnumDecoder: DecodeJson[`Type`] =
    DecodeJson.optionDecoder[`Type`](n => n.string.flatMap(jStr => `Type`.to`Type`(jStr)), "`Type` failed to de-serialize")

  implicit val StaticChunkingStrategyCodecJson: CodecJson[StaticChunkingStrategy] = CodecJson.derive[StaticChunkingStrategy]
  implicit val StaticChunkingStrategyDecoder: EntityDecoder[StaticChunkingStrategy] = jsonOf[StaticChunkingStrategy]
  implicit val StaticChunkingStrategyEncoder: EntityEncoder[StaticChunkingStrategy] = jsonEncoderOf[StaticChunkingStrategy]
}
