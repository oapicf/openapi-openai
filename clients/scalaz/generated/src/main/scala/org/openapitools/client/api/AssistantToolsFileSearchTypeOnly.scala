package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AssistantToolsFileSearchTypeOnly._

case class AssistantToolsFileSearchTypeOnly (
  /* The type of tool being defined: `file_search` */
  `type`: `Type`)

object AssistantToolsFileSearchTypeOnly {
  import DateTimeCodecs._
  sealed trait `Type`
  case object FileSearch extends `Type`

  object `Type` {
    def to`Type`(s: String): Option[`Type`] = s match {
      case "FileSearch" => Some(FileSearch)
      case _ => None
    }

    def from`Type`(x: `Type`): String = x match {
      case FileSearch => "FileSearch"
    }
  }

  implicit val `Type`EnumEncoder: EncodeJson[`Type`] =
    EncodeJson[`Type`](is => StringEncodeJson(`Type`.from`Type`(is)))

  implicit val `Type`EnumDecoder: DecodeJson[`Type`] =
    DecodeJson.optionDecoder[`Type`](n => n.string.flatMap(jStr => `Type`.to`Type`(jStr)), "`Type` failed to de-serialize")

  implicit val AssistantToolsFileSearchTypeOnlyCodecJson: CodecJson[AssistantToolsFileSearchTypeOnly] = CodecJson.derive[AssistantToolsFileSearchTypeOnly]
  implicit val AssistantToolsFileSearchTypeOnlyDecoder: EntityDecoder[AssistantToolsFileSearchTypeOnly] = jsonOf[AssistantToolsFileSearchTypeOnly]
  implicit val AssistantToolsFileSearchTypeOnlyEncoder: EntityEncoder[AssistantToolsFileSearchTypeOnly] = jsonEncoderOf[AssistantToolsFileSearchTypeOnly]
}
