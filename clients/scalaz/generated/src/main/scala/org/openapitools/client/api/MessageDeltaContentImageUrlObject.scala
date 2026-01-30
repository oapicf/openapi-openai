package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import MessageDeltaContentImageUrlObject._

case class MessageDeltaContentImageUrlObject (
  /* The index of the content part in the message. */
  index: Integer,
/* Always `image_url`. */
  `type`: `Type`,
imageUrl: Option[MessageDeltaContentImageUrlObjectImageUrl])

object MessageDeltaContentImageUrlObject {
  import DateTimeCodecs._
  sealed trait `Type`
  case object ImageUrl extends `Type`

  object `Type` {
    def to`Type`(s: String): Option[`Type`] = s match {
      case "ImageUrl" => Some(ImageUrl)
      case _ => None
    }

    def from`Type`(x: `Type`): String = x match {
      case ImageUrl => "ImageUrl"
    }
  }

  implicit val `Type`EnumEncoder: EncodeJson[`Type`] =
    EncodeJson[`Type`](is => StringEncodeJson(`Type`.from`Type`(is)))

  implicit val `Type`EnumDecoder: DecodeJson[`Type`] =
    DecodeJson.optionDecoder[`Type`](n => n.string.flatMap(jStr => `Type`.to`Type`(jStr)), "`Type` failed to de-serialize")

  implicit val MessageDeltaContentImageUrlObjectCodecJson: CodecJson[MessageDeltaContentImageUrlObject] = CodecJson.derive[MessageDeltaContentImageUrlObject]
  implicit val MessageDeltaContentImageUrlObjectDecoder: EntityDecoder[MessageDeltaContentImageUrlObject] = jsonOf[MessageDeltaContentImageUrlObject]
  implicit val MessageDeltaContentImageUrlObjectEncoder: EntityEncoder[MessageDeltaContentImageUrlObject] = jsonEncoderOf[MessageDeltaContentImageUrlObject]
}
