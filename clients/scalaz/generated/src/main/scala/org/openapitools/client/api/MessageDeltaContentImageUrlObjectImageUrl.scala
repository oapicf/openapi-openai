package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import MessageDeltaContentImageUrlObjectImageUrl._

case class MessageDeltaContentImageUrlObjectImageUrl (
  /* The URL of the image, must be a supported image types: jpeg, jpg, png, gif, webp. */
  url: Option[String],
/* Specifies the detail level of the image. `low` uses fewer tokens, you can opt in to high resolution using `high`. */
  detail: Option[Detail])

object MessageDeltaContentImageUrlObjectImageUrl {
  import DateTimeCodecs._
  sealed trait Detail
  case object Auto extends Detail
  case object Low extends Detail
  case object High extends Detail

  object Detail {
    def toDetail(s: String): Option[Detail] = s match {
      case "Auto" => Some(Auto)
      case "Low" => Some(Low)
      case "High" => Some(High)
      case _ => None
    }

    def fromDetail(x: Detail): String = x match {
      case Auto => "Auto"
      case Low => "Low"
      case High => "High"
    }
  }

  implicit val DetailEnumEncoder: EncodeJson[Detail] =
    EncodeJson[Detail](is => StringEncodeJson(Detail.fromDetail(is)))

  implicit val DetailEnumDecoder: DecodeJson[Detail] =
    DecodeJson.optionDecoder[Detail](n => n.string.flatMap(jStr => Detail.toDetail(jStr)), "Detail failed to de-serialize")

  implicit val MessageDeltaContentImageUrlObjectImageUrlCodecJson: CodecJson[MessageDeltaContentImageUrlObjectImageUrl] = CodecJson.derive[MessageDeltaContentImageUrlObjectImageUrl]
  implicit val MessageDeltaContentImageUrlObjectImageUrlDecoder: EntityDecoder[MessageDeltaContentImageUrlObjectImageUrl] = jsonOf[MessageDeltaContentImageUrlObjectImageUrl]
  implicit val MessageDeltaContentImageUrlObjectImageUrlEncoder: EntityEncoder[MessageDeltaContentImageUrlObjectImageUrl] = jsonEncoderOf[MessageDeltaContentImageUrlObjectImageUrl]
}
