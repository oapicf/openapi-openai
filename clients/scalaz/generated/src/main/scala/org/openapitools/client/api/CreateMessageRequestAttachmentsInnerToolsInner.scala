package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CreateMessageRequestAttachmentsInnerToolsInner._

case class CreateMessageRequestAttachmentsInnerToolsInner (
  /* The type of tool being defined: `code_interpreter` */
  `type`: `Type`)

object CreateMessageRequestAttachmentsInnerToolsInner {
  import DateTimeCodecs._
  sealed trait `Type`
  case object CodeInterpreter extends `Type`
  case object FileSearch extends `Type`

  object `Type` {
    def to`Type`(s: String): Option[`Type`] = s match {
      case "CodeInterpreter" => Some(CodeInterpreter)
      case "FileSearch" => Some(FileSearch)
      case _ => None
    }

    def from`Type`(x: `Type`): String = x match {
      case CodeInterpreter => "CodeInterpreter"
      case FileSearch => "FileSearch"
    }
  }

  implicit val `Type`EnumEncoder: EncodeJson[`Type`] =
    EncodeJson[`Type`](is => StringEncodeJson(`Type`.from`Type`(is)))

  implicit val `Type`EnumDecoder: DecodeJson[`Type`] =
    DecodeJson.optionDecoder[`Type`](n => n.string.flatMap(jStr => `Type`.to`Type`(jStr)), "`Type` failed to de-serialize")

  implicit val CreateMessageRequestAttachmentsInnerToolsInnerCodecJson: CodecJson[CreateMessageRequestAttachmentsInnerToolsInner] = CodecJson.derive[CreateMessageRequestAttachmentsInnerToolsInner]
  implicit val CreateMessageRequestAttachmentsInnerToolsInnerDecoder: EntityDecoder[CreateMessageRequestAttachmentsInnerToolsInner] = jsonOf[CreateMessageRequestAttachmentsInnerToolsInner]
  implicit val CreateMessageRequestAttachmentsInnerToolsInnerEncoder: EntityEncoder[CreateMessageRequestAttachmentsInnerToolsInner] = jsonEncoderOf[CreateMessageRequestAttachmentsInnerToolsInner]
}
