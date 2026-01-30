package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CreateModerationRequestInputOneOfInner._

case class CreateModerationRequestInputOneOfInner (
  /* Always `image_url`. */
  `type`: `Type`,
imageUrl: CreateModerationRequestInputOneOfInnerOneOfImageUrl,
/* A string of text to classify. */
  text: String)

object CreateModerationRequestInputOneOfInner {
  import DateTimeCodecs._
  sealed trait `Type`
  case object ImageUrl extends `Type`
  case object Text extends `Type`

  object `Type` {
    def to`Type`(s: String): Option[`Type`] = s match {
      case "ImageUrl" => Some(ImageUrl)
      case "Text" => Some(Text)
      case _ => None
    }

    def from`Type`(x: `Type`): String = x match {
      case ImageUrl => "ImageUrl"
      case Text => "Text"
    }
  }

  implicit val `Type`EnumEncoder: EncodeJson[`Type`] =
    EncodeJson[`Type`](is => StringEncodeJson(`Type`.from`Type`(is)))

  implicit val `Type`EnumDecoder: DecodeJson[`Type`] =
    DecodeJson.optionDecoder[`Type`](n => n.string.flatMap(jStr => `Type`.to`Type`(jStr)), "`Type` failed to de-serialize")

  implicit val CreateModerationRequestInputOneOfInnerCodecJson: CodecJson[CreateModerationRequestInputOneOfInner] = CodecJson.derive[CreateModerationRequestInputOneOfInner]
  implicit val CreateModerationRequestInputOneOfInnerDecoder: EntityDecoder[CreateModerationRequestInputOneOfInner] = jsonOf[CreateModerationRequestInputOneOfInner]
  implicit val CreateModerationRequestInputOneOfInnerEncoder: EntityEncoder[CreateModerationRequestInputOneOfInner] = jsonEncoderOf[CreateModerationRequestInputOneOfInner]
}
