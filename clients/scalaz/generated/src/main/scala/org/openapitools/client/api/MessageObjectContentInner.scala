package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import MessageObjectContentInner._

case class MessageObjectContentInner (
  /* Always `image_file`. */
  `type`: `Type`,
imageFile: MessageContentImageFileObjectImageFile,
text: MessageContentTextObjectText)

object MessageObjectContentInner {
  import DateTimeCodecs._
  sealed trait `Type`
  case object ImageFile extends `Type`
  case object Text extends `Type`

  object `Type` {
    def to`Type`(s: String): Option[`Type`] = s match {
      case "ImageFile" => Some(ImageFile)
      case "Text" => Some(Text)
      case _ => None
    }

    def from`Type`(x: `Type`): String = x match {
      case ImageFile => "ImageFile"
      case Text => "Text"
    }
  }

  implicit val `Type`EnumEncoder: EncodeJson[`Type`] =
    EncodeJson[`Type`](is => StringEncodeJson(`Type`.from`Type`(is)))

  implicit val `Type`EnumDecoder: DecodeJson[`Type`] =
    DecodeJson.optionDecoder[`Type`](n => n.string.flatMap(jStr => `Type`.to`Type`(jStr)), "`Type` failed to de-serialize")

  implicit val MessageObjectContentInnerCodecJson: CodecJson[MessageObjectContentInner] = CodecJson.derive[MessageObjectContentInner]
  implicit val MessageObjectContentInnerDecoder: EntityDecoder[MessageObjectContentInner] = jsonOf[MessageObjectContentInner]
  implicit val MessageObjectContentInnerEncoder: EntityEncoder[MessageObjectContentInner] = jsonEncoderOf[MessageObjectContentInner]
}
