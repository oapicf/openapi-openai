package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import OtherChunkingStrategyResponseParam._

case class OtherChunkingStrategyResponseParam (
  /* Always `other`. */
  `type`: `Type`)

object OtherChunkingStrategyResponseParam {
  import DateTimeCodecs._
  sealed trait `Type`
  case object Other extends `Type`

  object `Type` {
    def to`Type`(s: String): Option[`Type`] = s match {
      case "Other" => Some(Other)
      case _ => None
    }

    def from`Type`(x: `Type`): String = x match {
      case Other => "Other"
    }
  }

  implicit val `Type`EnumEncoder: EncodeJson[`Type`] =
    EncodeJson[`Type`](is => StringEncodeJson(`Type`.from`Type`(is)))

  implicit val `Type`EnumDecoder: DecodeJson[`Type`] =
    DecodeJson.optionDecoder[`Type`](n => n.string.flatMap(jStr => `Type`.to`Type`(jStr)), "`Type` failed to de-serialize")

  implicit val OtherChunkingStrategyResponseParamCodecJson: CodecJson[OtherChunkingStrategyResponseParam] = CodecJson.derive[OtherChunkingStrategyResponseParam]
  implicit val OtherChunkingStrategyResponseParamDecoder: EntityDecoder[OtherChunkingStrategyResponseParam] = jsonOf[OtherChunkingStrategyResponseParam]
  implicit val OtherChunkingStrategyResponseParamEncoder: EntityEncoder[OtherChunkingStrategyResponseParam] = jsonEncoderOf[OtherChunkingStrategyResponseParam]
}
