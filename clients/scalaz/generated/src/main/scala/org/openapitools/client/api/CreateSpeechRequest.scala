package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CreateSpeechRequest._

case class CreateSpeechRequest (
  model: CreateSpeechRequestModel,
/* The text to generate audio for. The maximum length is 4096 characters. */
  input: String,
/* The voice to use when generating the audio. Supported voices are `alloy`, `echo`, `fable`, `onyx`, `nova`, and `shimmer`. Previews of the voices are available in the [Text to speech guide](/docs/guides/text-to-speech/voice-options). */
  voice: Voice,
/* The format to audio in. Supported formats are `mp3`, `opus`, `aac`, `flac`, `wav`, and `pcm`. */
  responseFormat: Option[ResponseFormat],
/* The speed of the generated audio. Select a value from `0.25` to `4.0`. `1.0` is the default. */
  speed: Option[BigDecimal])

object CreateSpeechRequest {
  import DateTimeCodecs._
  sealed trait Voice
  case object Alloy extends Voice
  case object Echo extends Voice
  case object Fable extends Voice
  case object Onyx extends Voice
  case object Nova extends Voice
  case object Shimmer extends Voice

  object Voice {
    def toVoice(s: String): Option[Voice] = s match {
      case "Alloy" => Some(Alloy)
      case "Echo" => Some(Echo)
      case "Fable" => Some(Fable)
      case "Onyx" => Some(Onyx)
      case "Nova" => Some(Nova)
      case "Shimmer" => Some(Shimmer)
      case _ => None
    }

    def fromVoice(x: Voice): String = x match {
      case Alloy => "Alloy"
      case Echo => "Echo"
      case Fable => "Fable"
      case Onyx => "Onyx"
      case Nova => "Nova"
      case Shimmer => "Shimmer"
    }
  }

  implicit val VoiceEnumEncoder: EncodeJson[Voice] =
    EncodeJson[Voice](is => StringEncodeJson(Voice.fromVoice(is)))

  implicit val VoiceEnumDecoder: DecodeJson[Voice] =
    DecodeJson.optionDecoder[Voice](n => n.string.flatMap(jStr => Voice.toVoice(jStr)), "Voice failed to de-serialize")
  sealed trait ResponseFormat
  case object Mp3 extends ResponseFormat
  case object Opus extends ResponseFormat
  case object Aac extends ResponseFormat
  case object Flac extends ResponseFormat
  case object Wav extends ResponseFormat
  case object Pcm extends ResponseFormat

  object ResponseFormat {
    def toResponseFormat(s: String): Option[ResponseFormat] = s match {
      case "Mp3" => Some(Mp3)
      case "Opus" => Some(Opus)
      case "Aac" => Some(Aac)
      case "Flac" => Some(Flac)
      case "Wav" => Some(Wav)
      case "Pcm" => Some(Pcm)
      case _ => None
    }

    def fromResponseFormat(x: ResponseFormat): String = x match {
      case Mp3 => "Mp3"
      case Opus => "Opus"
      case Aac => "Aac"
      case Flac => "Flac"
      case Wav => "Wav"
      case Pcm => "Pcm"
    }
  }

  implicit val ResponseFormatEnumEncoder: EncodeJson[ResponseFormat] =
    EncodeJson[ResponseFormat](is => StringEncodeJson(ResponseFormat.fromResponseFormat(is)))

  implicit val ResponseFormatEnumDecoder: DecodeJson[ResponseFormat] =
    DecodeJson.optionDecoder[ResponseFormat](n => n.string.flatMap(jStr => ResponseFormat.toResponseFormat(jStr)), "ResponseFormat failed to de-serialize")

  implicit val CreateSpeechRequestCodecJson: CodecJson[CreateSpeechRequest] = CodecJson.derive[CreateSpeechRequest]
  implicit val CreateSpeechRequestDecoder: EntityDecoder[CreateSpeechRequest] = jsonOf[CreateSpeechRequest]
  implicit val CreateSpeechRequestEncoder: EntityEncoder[CreateSpeechRequest] = jsonEncoderOf[CreateSpeechRequest]
}
