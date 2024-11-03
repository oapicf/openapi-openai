package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.net.URI

import ChatCompletionRequestMessageContentPartImageImageUrl._

case class ChatCompletionRequestMessageContentPartImageImageUrl (
  /* Either a URL of the image or the base64 encoded image data. */
  url: URI,
/* Specifies the detail level of the image. Learn more in the [Vision guide](/docs/guides/vision/low-or-high-fidelity-image-understanding). */
  detail: Option[Detail])

object ChatCompletionRequestMessageContentPartImageImageUrl {
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

  implicit val ChatCompletionRequestMessageContentPartImageImageUrlCodecJson: CodecJson[ChatCompletionRequestMessageContentPartImageImageUrl] = CodecJson.derive[ChatCompletionRequestMessageContentPartImageImageUrl]
  implicit val ChatCompletionRequestMessageContentPartImageImageUrlDecoder: EntityDecoder[ChatCompletionRequestMessageContentPartImageImageUrl] = jsonOf[ChatCompletionRequestMessageContentPartImageImageUrl]
  implicit val ChatCompletionRequestMessageContentPartImageImageUrlEncoder: EntityEncoder[ChatCompletionRequestMessageContentPartImageImageUrl] = jsonEncoderOf[ChatCompletionRequestMessageContentPartImageImageUrl]
}
