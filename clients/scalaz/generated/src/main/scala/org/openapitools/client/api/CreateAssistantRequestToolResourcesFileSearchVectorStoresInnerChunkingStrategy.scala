package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy._

case class CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy (
  /* Always `auto`. */
  `type`: `Type`,
static: StaticChunkingStrategyStatic)

object CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy {
  import DateTimeCodecs._
  sealed trait `Type`
  case object Auto extends `Type`
  case object Static extends `Type`

  object `Type` {
    def to`Type`(s: String): Option[`Type`] = s match {
      case "Auto" => Some(Auto)
      case "Static" => Some(Static)
      case _ => None
    }

    def from`Type`(x: `Type`): String = x match {
      case Auto => "Auto"
      case Static => "Static"
    }
  }

  implicit val `Type`EnumEncoder: EncodeJson[`Type`] =
    EncodeJson[`Type`](is => StringEncodeJson(`Type`.from`Type`(is)))

  implicit val `Type`EnumDecoder: DecodeJson[`Type`] =
    DecodeJson.optionDecoder[`Type`](n => n.string.flatMap(jStr => `Type`.to`Type`(jStr)), "`Type` failed to de-serialize")

  implicit val CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategyCodecJson: CodecJson[CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy] = CodecJson.derive[CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy]
  implicit val CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategyDecoder: EntityDecoder[CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy] = jsonOf[CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy]
  implicit val CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategyEncoder: EntityEncoder[CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy] = jsonEncoderOf[CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy]
}
