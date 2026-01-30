package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ChatCompletionRequestMessageContentPartAudioInputAudio._

case class ChatCompletionRequestMessageContentPartAudioInputAudio (
  /* Base64 encoded audio data. */
  data: String,
/* The format of the encoded audio data. Currently supports \"wav\" and \"mp3\".  */
  format: Format)

object ChatCompletionRequestMessageContentPartAudioInputAudio {
  import DateTimeCodecs._
  sealed trait Format
  case object Wav extends Format
  case object Mp3 extends Format

  object Format {
    def toFormat(s: String): Option[Format] = s match {
      case "Wav" => Some(Wav)
      case "Mp3" => Some(Mp3)
      case _ => None
    }

    def fromFormat(x: Format): String = x match {
      case Wav => "Wav"
      case Mp3 => "Mp3"
    }
  }

  implicit val FormatEnumEncoder: EncodeJson[Format] =
    EncodeJson[Format](is => StringEncodeJson(Format.fromFormat(is)))

  implicit val FormatEnumDecoder: DecodeJson[Format] =
    DecodeJson.optionDecoder[Format](n => n.string.flatMap(jStr => Format.toFormat(jStr)), "Format failed to de-serialize")

  implicit val ChatCompletionRequestMessageContentPartAudioInputAudioCodecJson: CodecJson[ChatCompletionRequestMessageContentPartAudioInputAudio] = CodecJson.derive[ChatCompletionRequestMessageContentPartAudioInputAudio]
  implicit val ChatCompletionRequestMessageContentPartAudioInputAudioDecoder: EntityDecoder[ChatCompletionRequestMessageContentPartAudioInputAudio] = jsonOf[ChatCompletionRequestMessageContentPartAudioInputAudio]
  implicit val ChatCompletionRequestMessageContentPartAudioInputAudioEncoder: EntityEncoder[ChatCompletionRequestMessageContentPartAudioInputAudio] = jsonEncoderOf[ChatCompletionRequestMessageContentPartAudioInputAudio]
}
