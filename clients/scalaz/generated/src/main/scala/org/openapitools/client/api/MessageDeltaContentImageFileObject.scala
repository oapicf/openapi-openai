package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import MessageDeltaContentImageFileObject._

case class MessageDeltaContentImageFileObject (
  /* The index of the content part in the message. */
  index: Integer,
/* Always `image_file`. */
  `type`: `Type`,
imageFile: Option[MessageDeltaContentImageFileObjectImageFile])

object MessageDeltaContentImageFileObject {
  import DateTimeCodecs._
  sealed trait `Type`
  case object ImageFile extends `Type`

  object `Type` {
    def to`Type`(s: String): Option[`Type`] = s match {
      case "ImageFile" => Some(ImageFile)
      case _ => None
    }

    def from`Type`(x: `Type`): String = x match {
      case ImageFile => "ImageFile"
    }
  }

  implicit val `Type`EnumEncoder: EncodeJson[`Type`] =
    EncodeJson[`Type`](is => StringEncodeJson(`Type`.from`Type`(is)))

  implicit val `Type`EnumDecoder: DecodeJson[`Type`] =
    DecodeJson.optionDecoder[`Type`](n => n.string.flatMap(jStr => `Type`.to`Type`(jStr)), "`Type` failed to de-serialize")

  implicit val MessageDeltaContentImageFileObjectCodecJson: CodecJson[MessageDeltaContentImageFileObject] = CodecJson.derive[MessageDeltaContentImageFileObject]
  implicit val MessageDeltaContentImageFileObjectDecoder: EntityDecoder[MessageDeltaContentImageFileObject] = jsonOf[MessageDeltaContentImageFileObject]
  implicit val MessageDeltaContentImageFileObjectEncoder: EntityEncoder[MessageDeltaContentImageFileObject] = jsonEncoderOf[MessageDeltaContentImageFileObject]
}
