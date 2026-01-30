package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import MessageContentImageUrlObject._

case class MessageContentImageUrlObject (
  /* The type of the content part. */
  `type`: `Type`,
imageUrl: MessageContentImageUrlObjectImageUrl)

object MessageContentImageUrlObject {
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

  implicit val MessageContentImageUrlObjectCodecJson: CodecJson[MessageContentImageUrlObject] = CodecJson.derive[MessageContentImageUrlObject]
  implicit val MessageContentImageUrlObjectDecoder: EntityDecoder[MessageContentImageUrlObject] = jsonOf[MessageContentImageUrlObject]
  implicit val MessageContentImageUrlObjectEncoder: EntityEncoder[MessageContentImageUrlObject] = jsonEncoderOf[MessageContentImageUrlObject]
}
