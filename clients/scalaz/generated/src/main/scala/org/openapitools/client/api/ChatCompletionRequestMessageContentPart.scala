package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ChatCompletionRequestMessageContentPart._

case class ChatCompletionRequestMessageContentPart (
  /* The type of the content part. */
  `type`: `Type`,
/* The text content. */
  text: String,
imageUrl: ChatCompletionRequestMessageContentPartImageImageUrl)

object ChatCompletionRequestMessageContentPart {
  import DateTimeCodecs._
  sealed trait `Type`
  case object Text extends `Type`
  case object ImageUrl extends `Type`

  object `Type` {
    def to`Type`(s: String): Option[`Type`] = s match {
      case "Text" => Some(Text)
      case "ImageUrl" => Some(ImageUrl)
      case _ => None
    }

    def from`Type`(x: `Type`): String = x match {
      case Text => "Text"
      case ImageUrl => "ImageUrl"
    }
  }

  implicit val `Type`EnumEncoder: EncodeJson[`Type`] =
    EncodeJson[`Type`](is => StringEncodeJson(`Type`.from`Type`(is)))

  implicit val `Type`EnumDecoder: DecodeJson[`Type`] =
    DecodeJson.optionDecoder[`Type`](n => n.string.flatMap(jStr => `Type`.to`Type`(jStr)), "`Type` failed to de-serialize")

  implicit val ChatCompletionRequestMessageContentPartCodecJson: CodecJson[ChatCompletionRequestMessageContentPart] = CodecJson.derive[ChatCompletionRequestMessageContentPart]
  implicit val ChatCompletionRequestMessageContentPartDecoder: EntityDecoder[ChatCompletionRequestMessageContentPart] = jsonOf[ChatCompletionRequestMessageContentPart]
  implicit val ChatCompletionRequestMessageContentPartEncoder: EntityEncoder[ChatCompletionRequestMessageContentPart] = jsonEncoderOf[ChatCompletionRequestMessageContentPart]
}
