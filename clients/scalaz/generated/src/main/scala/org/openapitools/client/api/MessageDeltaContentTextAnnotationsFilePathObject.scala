package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import MessageDeltaContentTextAnnotationsFilePathObject._

case class MessageDeltaContentTextAnnotationsFilePathObject (
  /* The index of the annotation in the text content part. */
  index: Integer,
/* Always `file_path`. */
  `type`: `Type`,
/* The text in the message content that needs to be replaced. */
  text: Option[String],
filePath: Option[MessageDeltaContentTextAnnotationsFilePathObjectFilePath],
startIndex: Option[Integer],
endIndex: Option[Integer])

object MessageDeltaContentTextAnnotationsFilePathObject {
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

  implicit val MessageDeltaContentTextAnnotationsFilePathObjectCodecJson: CodecJson[MessageDeltaContentTextAnnotationsFilePathObject] = CodecJson.derive[MessageDeltaContentTextAnnotationsFilePathObject]
  implicit val MessageDeltaContentTextAnnotationsFilePathObjectDecoder: EntityDecoder[MessageDeltaContentTextAnnotationsFilePathObject] = jsonOf[MessageDeltaContentTextAnnotationsFilePathObject]
  implicit val MessageDeltaContentTextAnnotationsFilePathObjectEncoder: EntityEncoder[MessageDeltaContentTextAnnotationsFilePathObject] = jsonEncoderOf[MessageDeltaContentTextAnnotationsFilePathObject]
}
