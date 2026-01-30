package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ChatCompletionRequestMessageContentPartAudio._

case class ChatCompletionRequestMessageContentPartAudio (
  /* The type of the content part. Always `input_audio`. */
  `type`: `Type`,
inputAudio: ChatCompletionRequestMessageContentPartAudioInputAudio)

object ChatCompletionRequestMessageContentPartAudio {
  import DateTimeCodecs._
  sealed trait `Type`
  case object InputAudio extends `Type`

  object `Type` {
    def to`Type`(s: String): Option[`Type`] = s match {
      case "InputAudio" => Some(InputAudio)
      case _ => None
    }

    def from`Type`(x: `Type`): String = x match {
      case InputAudio => "InputAudio"
    }
  }

  implicit val `Type`EnumEncoder: EncodeJson[`Type`] =
    EncodeJson[`Type`](is => StringEncodeJson(`Type`.from`Type`(is)))

  implicit val `Type`EnumDecoder: DecodeJson[`Type`] =
    DecodeJson.optionDecoder[`Type`](n => n.string.flatMap(jStr => `Type`.to`Type`(jStr)), "`Type` failed to de-serialize")

  implicit val ChatCompletionRequestMessageContentPartAudioCodecJson: CodecJson[ChatCompletionRequestMessageContentPartAudio] = CodecJson.derive[ChatCompletionRequestMessageContentPartAudio]
  implicit val ChatCompletionRequestMessageContentPartAudioDecoder: EntityDecoder[ChatCompletionRequestMessageContentPartAudio] = jsonOf[ChatCompletionRequestMessageContentPartAudio]
  implicit val ChatCompletionRequestMessageContentPartAudioEncoder: EntityEncoder[ChatCompletionRequestMessageContentPartAudio] = jsonEncoderOf[ChatCompletionRequestMessageContentPartAudio]
}
