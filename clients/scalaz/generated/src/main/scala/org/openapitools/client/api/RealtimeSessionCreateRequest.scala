package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import RealtimeSessionCreateRequest._

case class RealtimeSessionCreateRequest (
  /* The set of modalities the model can respond with. To disable audio, set this to [\"text\"].  */
  modalities: Option[List[Modalities]],
/* The Realtime model used for this session.  */
  model: Model,
/* The default system instructions (i.e. system message) prepended to model  calls. This field allows the client to guide the model on desired  responses. The model can be instructed on response content and format,  (e.g. \"be extremely succinct\", \"act friendly\", \"here are examples of good  responses\") and on audio behavior (e.g. \"talk quickly\", \"inject emotion  into your voice\", \"laugh frequently\"). The instructions are not guaranteed  to be followed by the model, but they provide guidance to the model on the  desired behavior.  Note that the server sets default instructions which will be used if this  field is not set and are visible in the `session.created` event at the  start of the session.  */
  instructions: Option[String],
/* The voice the model uses to respond. Voice cannot be changed during the  session once the model has responded with audio at least once. Current  voice options are `alloy`, `ash`, `ballad`, `coral`, `echo` `sage`,  `shimmer` and `verse`.  */
  voice: Option[Voice],
/* The format of input audio. Options are `pcm16`, `g711_ulaw`, or `g711_alaw`.  */
  inputAudioFormat: Option[InputAudioFormat],
/* The format of output audio. Options are `pcm16`, `g711_ulaw`, or `g711_alaw`.  */
  outputAudioFormat: Option[OutputAudioFormat],
inputAudioTranscription: Option[RealtimeSessionInputAudioTranscription],
turnDetection: Option[RealtimeSessionCreateRequestTurnDetection],
/* Tools (functions) available to the model. */
  tools: Option[List[RealtimeResponseCreateParamsToolsInner]],
/* How the model chooses tools. Options are `auto`, `none`, `required`, or  specify a function.  */
  toolChoice: Option[String],
/* Sampling temperature for the model, limited to [0.6, 1.2]. Defaults to 0.8.  */
  temperature: Option[BigDecimal],
maxResponseOutputTokens: Option[RealtimeResponseCreateParamsMaxResponseOutputTokens])

object RealtimeSessionCreateRequest {
  import DateTimeCodecs._
  sealed trait List[Modalities]

  object List[Modalities] {
    def toList[Modalities](s: String): Option[List[Modalities]] = s match {
      case _ => None
    }

    def fromList[Modalities](x: List[Modalities]): String = x match {
    }
  }

  implicit val List[Modalities]EnumEncoder: EncodeJson[List[Modalities]] =
    EncodeJson[List[Modalities]](is => StringEncodeJson(List[Modalities].fromList[Modalities](is)))

  implicit val List[Modalities]EnumDecoder: DecodeJson[List[Modalities]] =
    DecodeJson.optionDecoder[List[Modalities]](n => n.string.flatMap(jStr => List[Modalities].toList[Modalities](jStr)), "List[Modalities] failed to de-serialize")
  sealed trait Model
  case object Gpt4oRealtimePreview extends Model
  case object Gpt4oRealtimePreview20241001 extends Model
  case object Gpt4oRealtimePreview20241217 extends Model
  case object Gpt4oMiniRealtimePreview extends Model
  case object Gpt4oMiniRealtimePreview20241217 extends Model

  object Model {
    def toModel(s: String): Option[Model] = s match {
      case "Gpt4oRealtimePreview" => Some(Gpt4oRealtimePreview)
      case "Gpt4oRealtimePreview20241001" => Some(Gpt4oRealtimePreview20241001)
      case "Gpt4oRealtimePreview20241217" => Some(Gpt4oRealtimePreview20241217)
      case "Gpt4oMiniRealtimePreview" => Some(Gpt4oMiniRealtimePreview)
      case "Gpt4oMiniRealtimePreview20241217" => Some(Gpt4oMiniRealtimePreview20241217)
      case _ => None
    }

    def fromModel(x: Model): String = x match {
      case Gpt4oRealtimePreview => "Gpt4oRealtimePreview"
      case Gpt4oRealtimePreview20241001 => "Gpt4oRealtimePreview20241001"
      case Gpt4oRealtimePreview20241217 => "Gpt4oRealtimePreview20241217"
      case Gpt4oMiniRealtimePreview => "Gpt4oMiniRealtimePreview"
      case Gpt4oMiniRealtimePreview20241217 => "Gpt4oMiniRealtimePreview20241217"
    }
  }

  implicit val ModelEnumEncoder: EncodeJson[Model] =
    EncodeJson[Model](is => StringEncodeJson(Model.fromModel(is)))

  implicit val ModelEnumDecoder: DecodeJson[Model] =
    DecodeJson.optionDecoder[Model](n => n.string.flatMap(jStr => Model.toModel(jStr)), "Model failed to de-serialize")
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
  sealed trait InputAudioFormat
  case object Pcm16 extends InputAudioFormat
  case object G711Ulaw extends InputAudioFormat
  case object G711Alaw extends InputAudioFormat

  object InputAudioFormat {
    def toInputAudioFormat(s: String): Option[InputAudioFormat] = s match {
      case "Pcm16" => Some(Pcm16)
      case "G711Ulaw" => Some(G711Ulaw)
      case "G711Alaw" => Some(G711Alaw)
      case _ => None
    }

    def fromInputAudioFormat(x: InputAudioFormat): String = x match {
      case Pcm16 => "Pcm16"
      case G711Ulaw => "G711Ulaw"
      case G711Alaw => "G711Alaw"
    }
  }

  implicit val InputAudioFormatEnumEncoder: EncodeJson[InputAudioFormat] =
    EncodeJson[InputAudioFormat](is => StringEncodeJson(InputAudioFormat.fromInputAudioFormat(is)))

  implicit val InputAudioFormatEnumDecoder: DecodeJson[InputAudioFormat] =
    DecodeJson.optionDecoder[InputAudioFormat](n => n.string.flatMap(jStr => InputAudioFormat.toInputAudioFormat(jStr)), "InputAudioFormat failed to de-serialize")
  sealed trait OutputAudioFormat
  case object Pcm16 extends OutputAudioFormat
  case object G711Ulaw extends OutputAudioFormat
  case object G711Alaw extends OutputAudioFormat

  object OutputAudioFormat {
    def toOutputAudioFormat(s: String): Option[OutputAudioFormat] = s match {
      case "Pcm16" => Some(Pcm16)
      case "G711Ulaw" => Some(G711Ulaw)
      case "G711Alaw" => Some(G711Alaw)
      case _ => None
    }

    def fromOutputAudioFormat(x: OutputAudioFormat): String = x match {
      case Pcm16 => "Pcm16"
      case G711Ulaw => "G711Ulaw"
      case G711Alaw => "G711Alaw"
    }
  }

  implicit val OutputAudioFormatEnumEncoder: EncodeJson[OutputAudioFormat] =
    EncodeJson[OutputAudioFormat](is => StringEncodeJson(OutputAudioFormat.fromOutputAudioFormat(is)))

  implicit val OutputAudioFormatEnumDecoder: DecodeJson[OutputAudioFormat] =
    DecodeJson.optionDecoder[OutputAudioFormat](n => n.string.flatMap(jStr => OutputAudioFormat.toOutputAudioFormat(jStr)), "OutputAudioFormat failed to de-serialize")

  implicit val RealtimeSessionCreateRequestCodecJson: CodecJson[RealtimeSessionCreateRequest] = CodecJson.derive[RealtimeSessionCreateRequest]
  implicit val RealtimeSessionCreateRequestDecoder: EntityDecoder[RealtimeSessionCreateRequest] = jsonOf[RealtimeSessionCreateRequest]
  implicit val RealtimeSessionCreateRequestEncoder: EntityEncoder[RealtimeSessionCreateRequest] = jsonEncoderOf[RealtimeSessionCreateRequest]
}
