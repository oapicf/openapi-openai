package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import VectorStoreFileObjectChunkingStrategy._

case class VectorStoreFileObjectChunkingStrategy (
  /* Always `static`. */
  `type`: `Type`,
static: StaticChunkingStrategy)

object VectorStoreFileObjectChunkingStrategy {
  import DateTimeCodecs._
  sealed trait `Type`
  case object Static extends `Type`
  case object Other extends `Type`

  object `Type` {
    def to`Type`(s: String): Option[`Type`] = s match {
      case "Static" => Some(Static)
      case "Other" => Some(Other)
      case _ => None
    }

    def from`Type`(x: `Type`): String = x match {
      case Static => "Static"
      case Other => "Other"
    }
  }

  implicit val `Type`EnumEncoder: EncodeJson[`Type`] =
    EncodeJson[`Type`](is => StringEncodeJson(`Type`.from`Type`(is)))

  implicit val `Type`EnumDecoder: DecodeJson[`Type`] =
    DecodeJson.optionDecoder[`Type`](n => n.string.flatMap(jStr => `Type`.to`Type`(jStr)), "`Type` failed to de-serialize")

  implicit val VectorStoreFileObjectChunkingStrategyCodecJson: CodecJson[VectorStoreFileObjectChunkingStrategy] = CodecJson.derive[VectorStoreFileObjectChunkingStrategy]
  implicit val VectorStoreFileObjectChunkingStrategyDecoder: EntityDecoder[VectorStoreFileObjectChunkingStrategy] = jsonOf[VectorStoreFileObjectChunkingStrategy]
  implicit val VectorStoreFileObjectChunkingStrategyEncoder: EntityEncoder[VectorStoreFileObjectChunkingStrategy] = jsonEncoderOf[VectorStoreFileObjectChunkingStrategy]
}
