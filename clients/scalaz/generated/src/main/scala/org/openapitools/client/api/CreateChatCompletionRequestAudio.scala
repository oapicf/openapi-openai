package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CreateChatCompletionRequestAudio._

case class CreateChatCompletionRequestAudio (
  /* The voice the model uses to respond. Supported voices are `ash`, `ballad`, `coral`, `sage`, and `verse` (also supported but not recommended are `alloy`, `echo`, and `shimmer`; these voices are less expressive).  */
  voice: Voice,
/* Specifies the output audio format. Must be one of `wav`, `mp3`, `flac`, `opus`, or `pcm16`.  */
  format: Format)

object CreateChatCompletionRequestAudio {
  import DateTimeCodecs._
  sealed trait Voice
  case object Alloy extends Voice
  case object Ash extends Voice
  case object Ballad extends Voice
  case object Coral extends Voice
  case object Echo extends Voice
  case object Sage extends Voice
  case object Shimmer extends Voice
  case object Verse extends Voice

  object Voice {
    def toVoice(s: String): Option[Voice] = s match {
      case "Alloy" => Some(Alloy)
      case "Ash" => Some(Ash)
      case "Ballad" => Some(Ballad)
      case "Coral" => Some(Coral)
      case "Echo" => Some(Echo)
      case "Sage" => Some(Sage)
      case "Shimmer" => Some(Shimmer)
      case "Verse" => Some(Verse)
      case _ => None
    }

    def fromVoice(x: Voice): String = x match {
      case Alloy => "Alloy"
      case Ash => "Ash"
      case Ballad => "Ballad"
      case Coral => "Coral"
      case Echo => "Echo"
      case Sage => "Sage"
      case Shimmer => "Shimmer"
      case Verse => "Verse"
    }
  }

  implicit val VoiceEnumEncoder: EncodeJson[Voice] =
    EncodeJson[Voice](is => StringEncodeJson(Voice.fromVoice(is)))

  implicit val VoiceEnumDecoder: DecodeJson[Voice] =
    DecodeJson.optionDecoder[Voice](n => n.string.flatMap(jStr => Voice.toVoice(jStr)), "Voice failed to de-serialize")
  sealed trait Format
  case object Wav extends Format
  case object Mp3 extends Format
  case object Flac extends Format
  case object Opus extends Format
  case object Pcm16 extends Format

  object Format {
    def toFormat(s: String): Option[Format] = s match {
      case "Wav" => Some(Wav)
      case "Mp3" => Some(Mp3)
      case "Flac" => Some(Flac)
      case "Opus" => Some(Opus)
      case "Pcm16" => Some(Pcm16)
      case _ => None
    }

    def fromFormat(x: Format): String = x match {
      case Wav => "Wav"
      case Mp3 => "Mp3"
      case Flac => "Flac"
      case Opus => "Opus"
      case Pcm16 => "Pcm16"
    }
  }

  implicit val FormatEnumEncoder: EncodeJson[Format] =
    EncodeJson[Format](is => StringEncodeJson(Format.fromFormat(is)))

  implicit val FormatEnumDecoder: DecodeJson[Format] =
    DecodeJson.optionDecoder[Format](n => n.string.flatMap(jStr => Format.toFormat(jStr)), "Format failed to de-serialize")

  implicit val CreateChatCompletionRequestAudioCodecJson: CodecJson[CreateChatCompletionRequestAudio] = CodecJson.derive[CreateChatCompletionRequestAudio]
  implicit val CreateChatCompletionRequestAudioDecoder: EntityDecoder[CreateChatCompletionRequestAudio] = jsonOf[CreateChatCompletionRequestAudio]
  implicit val CreateChatCompletionRequestAudioEncoder: EntityEncoder[CreateChatCompletionRequestAudio] = jsonEncoderOf[CreateChatCompletionRequestAudio]
}
