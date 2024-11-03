package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import MessageContentTextObjectTextAnnotationsInner._

case class MessageContentTextObjectTextAnnotationsInner (
  /* Always `file_citation`. */
  `type`: `Type`,
/* The text in the message content that needs to be replaced. */
  text: String,
fileCitation: MessageContentTextAnnotationsFileCitationObjectFileCitation,
startIndex: Integer,
endIndex: Integer,
filePath: MessageContentTextAnnotationsFilePathObjectFilePath)

object MessageContentTextObjectTextAnnotationsInner {
  import DateTimeCodecs._
  sealed trait `Type`
  case object FileCitation extends `Type`
  case object FilePath extends `Type`

  object `Type` {
    def to`Type`(s: String): Option[`Type`] = s match {
      case "FileCitation" => Some(FileCitation)
      case "FilePath" => Some(FilePath)
      case _ => None
    }

    def from`Type`(x: `Type`): String = x match {
      case FileCitation => "FileCitation"
      case FilePath => "FilePath"
    }
  }

  implicit val `Type`EnumEncoder: EncodeJson[`Type`] =
    EncodeJson[`Type`](is => StringEncodeJson(`Type`.from`Type`(is)))

  implicit val `Type`EnumDecoder: DecodeJson[`Type`] =
    DecodeJson.optionDecoder[`Type`](n => n.string.flatMap(jStr => `Type`.to`Type`(jStr)), "`Type` failed to de-serialize")

  implicit val MessageContentTextObjectTextAnnotationsInnerCodecJson: CodecJson[MessageContentTextObjectTextAnnotationsInner] = CodecJson.derive[MessageContentTextObjectTextAnnotationsInner]
  implicit val MessageContentTextObjectTextAnnotationsInnerDecoder: EntityDecoder[MessageContentTextObjectTextAnnotationsInner] = jsonOf[MessageContentTextObjectTextAnnotationsInner]
  implicit val MessageContentTextObjectTextAnnotationsInnerEncoder: EntityEncoder[MessageContentTextObjectTextAnnotationsInner] = jsonEncoderOf[MessageContentTextObjectTextAnnotationsInner]
}
