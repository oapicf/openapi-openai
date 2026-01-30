package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AutoChunkingStrategy._

case class AutoChunkingStrategy (
  /* Always `auto`. */
  `type`: `Type`)

object AutoChunkingStrategy {
  import DateTimeCodecs._
  sealed trait `Type`
  case object Auto extends `Type`

  object `Type` {
    def to`Type`(s: String): Option[`Type`] = s match {
      case "Auto" => Some(Auto)
      case _ => None
    }

    def from`Type`(x: `Type`): String = x match {
      case Auto => "Auto"
    }
  }

  implicit val `Type`EnumEncoder: EncodeJson[`Type`] =
    EncodeJson[`Type`](is => StringEncodeJson(`Type`.from`Type`(is)))

  implicit val `Type`EnumDecoder: DecodeJson[`Type`] =
    DecodeJson.optionDecoder[`Type`](n => n.string.flatMap(jStr => `Type`.to`Type`(jStr)), "`Type` failed to de-serialize")

  implicit val AutoChunkingStrategyCodecJson: CodecJson[AutoChunkingStrategy] = CodecJson.derive[AutoChunkingStrategy]
  implicit val AutoChunkingStrategyDecoder: EntityDecoder[AutoChunkingStrategy] = jsonOf[AutoChunkingStrategy]
  implicit val AutoChunkingStrategyEncoder: EntityEncoder[AutoChunkingStrategy] = jsonEncoderOf[AutoChunkingStrategy]
}
