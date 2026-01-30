package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import StaticChunkingStrategyResponseParam._

case class StaticChunkingStrategyResponseParam (
  /* Always `static`. */
  `type`: `Type`,
static: StaticChunkingStrategy)

object StaticChunkingStrategyResponseParam {
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

  implicit val StaticChunkingStrategyResponseParamCodecJson: CodecJson[StaticChunkingStrategyResponseParam] = CodecJson.derive[StaticChunkingStrategyResponseParam]
  implicit val StaticChunkingStrategyResponseParamDecoder: EntityDecoder[StaticChunkingStrategyResponseParam] = jsonOf[StaticChunkingStrategyResponseParam]
  implicit val StaticChunkingStrategyResponseParamEncoder: EntityEncoder[StaticChunkingStrategyResponseParam] = jsonEncoderOf[StaticChunkingStrategyResponseParam]
}
