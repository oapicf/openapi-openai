package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import MessageContentTextAnnotationsFilePathObject._

case class MessageContentTextAnnotationsFilePathObject (
  /* Always `file_path`. */
  `type`: `Type`,
/* The text in the message content that needs to be replaced. */
  text: String,
filePath: MessageContentTextAnnotationsFilePathObjectFilePath,
startIndex: Integer,
endIndex: Integer)

object MessageContentTextAnnotationsFilePathObject {
  import DateTimeCodecs._
  sealed trait `Type`
  case object FilePath extends `Type`

  object `Type` {
    def to`Type`(s: String): Option[`Type`] = s match {
      case "FilePath" => Some(FilePath)
      case _ => None
    }

    def from`Type`(x: `Type`): String = x match {
      case FilePath => "FilePath"
    }
  }

  implicit val `Type`EnumEncoder: EncodeJson[`Type`] =
    EncodeJson[`Type`](is => StringEncodeJson(`Type`.from`Type`(is)))

  implicit val `Type`EnumDecoder: DecodeJson[`Type`] =
    DecodeJson.optionDecoder[`Type`](n => n.string.flatMap(jStr => `Type`.to`Type`(jStr)), "`Type` failed to de-serialize")

  implicit val MessageContentTextAnnotationsFilePathObjectCodecJson: CodecJson[MessageContentTextAnnotationsFilePathObject] = CodecJson.derive[MessageContentTextAnnotationsFilePathObject]
  implicit val MessageContentTextAnnotationsFilePathObjectDecoder: EntityDecoder[MessageContentTextAnnotationsFilePathObject] = jsonOf[MessageContentTextAnnotationsFilePathObject]
  implicit val MessageContentTextAnnotationsFilePathObjectEncoder: EntityEncoder[MessageContentTextAnnotationsFilePathObject] = jsonEncoderOf[MessageContentTextAnnotationsFilePathObject]
}
