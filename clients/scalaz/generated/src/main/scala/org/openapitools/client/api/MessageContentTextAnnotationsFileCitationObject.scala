package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import MessageContentTextAnnotationsFileCitationObject._

case class MessageContentTextAnnotationsFileCitationObject (
  /* Always `file_citation`. */
  `type`: `Type`,
/* The text in the message content that needs to be replaced. */
  text: String,
fileCitation: MessageContentTextAnnotationsFileCitationObjectFileCitation,
startIndex: Integer,
endIndex: Integer)

object MessageContentTextAnnotationsFileCitationObject {
  import DateTimeCodecs._
  sealed trait `Type`
  case object FileCitation extends `Type`

  object `Type` {
    def to`Type`(s: String): Option[`Type`] = s match {
      case "FileCitation" => Some(FileCitation)
      case _ => None
    }

    def from`Type`(x: `Type`): String = x match {
      case FileCitation => "FileCitation"
    }
  }

  implicit val `Type`EnumEncoder: EncodeJson[`Type`] =
    EncodeJson[`Type`](is => StringEncodeJson(`Type`.from`Type`(is)))

  implicit val `Type`EnumDecoder: DecodeJson[`Type`] =
    DecodeJson.optionDecoder[`Type`](n => n.string.flatMap(jStr => `Type`.to`Type`(jStr)), "`Type` failed to de-serialize")

  implicit val MessageContentTextAnnotationsFileCitationObjectCodecJson: CodecJson[MessageContentTextAnnotationsFileCitationObject] = CodecJson.derive[MessageContentTextAnnotationsFileCitationObject]
  implicit val MessageContentTextAnnotationsFileCitationObjectDecoder: EntityDecoder[MessageContentTextAnnotationsFileCitationObject] = jsonOf[MessageContentTextAnnotationsFileCitationObject]
  implicit val MessageContentTextAnnotationsFileCitationObjectEncoder: EntityEncoder[MessageContentTextAnnotationsFileCitationObject] = jsonEncoderOf[MessageContentTextAnnotationsFileCitationObject]
}
