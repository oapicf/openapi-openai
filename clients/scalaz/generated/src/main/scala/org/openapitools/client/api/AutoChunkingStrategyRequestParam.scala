package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AutoChunkingStrategyRequestParam._

case class AutoChunkingStrategyRequestParam (
  /* Always `auto`. */
  `type`: `Type`)

object AutoChunkingStrategyRequestParam {
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

  implicit val AutoChunkingStrategyRequestParamCodecJson: CodecJson[AutoChunkingStrategyRequestParam] = CodecJson.derive[AutoChunkingStrategyRequestParam]
  implicit val AutoChunkingStrategyRequestParamDecoder: EntityDecoder[AutoChunkingStrategyRequestParam] = jsonOf[AutoChunkingStrategyRequestParam]
  implicit val AutoChunkingStrategyRequestParamEncoder: EntityEncoder[AutoChunkingStrategyRequestParam] = jsonEncoderOf[AutoChunkingStrategyRequestParam]
}
