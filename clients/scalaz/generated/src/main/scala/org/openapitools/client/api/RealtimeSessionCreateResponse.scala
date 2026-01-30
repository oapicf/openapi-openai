package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import RealtimeSessionCreateResponse._

case class RealtimeSessionCreateResponse (
  clientSecret: Option[RealtimeSessionCreateResponseClientSecret],
/* The set of modalities the model can respond with. To disable audio, set this to [\"text\"].  */
  modalities: Option[List[Modalities]],
/* The default system instructions (i.e. system message) prepended to model  calls. This field allows the client to guide the model on desired  responses. The model can be instructed on response content and format,  (e.g. \"be extremely succinct\", \"act friendly\", \"here are examples of good  responses\") and on audio behavior (e.g. \"talk quickly\", \"inject emotion  into your voice\", \"laugh frequently\"). The instructions are not guaranteed  to be followed by the model, but they provide guidance to the model on the  desired behavior.  Note that the server sets default instructions which will be used if this  field is not set and are visible in the `session.created` event at the  start of the session.  */
  instructions: Option[String],
/* The voice the model uses to respond. Voice cannot be changed during the  session once the model has responded with audio at least once. Current  voice options are `alloy`, `ash`, `ballad`, `coral`, `echo` `sage`,  `shimmer` and `verse`.  */
  voice: Option[Voice],
/* The format of input audio. Options are `pcm16`, `g711_ulaw`, or `g711_alaw`.  */
  inputAudioFormat: Option[String],
/* The format of output audio. Options are `pcm16`, `g711_ulaw`, or `g711_alaw`.  */
  outputAudioFormat: Option[String],
inputAudioTranscription: Option[RealtimeSessionInputAudioTranscription],
turnDetection: Option[RealtimeSessionCreateResponseTurnDetection],
/* Tools (functions) available to the model. */
  tools: Option[List[RealtimeResponseCreateParamsToolsInner]],
/* How the model chooses tools. Options are `auto`, `none`, `required`, or  specify a function.  */
  toolChoice: Option[String],
/* Sampling temperature for the model, limited to [0.6, 1.2]. Defaults to 0.8.  */
  temperature: Option[BigDecimal],
maxResponseOutputTokens: Option[RealtimeResponseCreateParamsMaxResponseOutputTokens])

object RealtimeSessionCreateResponse {
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

  implicit val RealtimeSessionCreateResponseCodecJson: CodecJson[RealtimeSessionCreateResponse] = CodecJson.derive[RealtimeSessionCreateResponse]
  implicit val RealtimeSessionCreateResponseDecoder: EntityDecoder[RealtimeSessionCreateResponse] = jsonOf[RealtimeSessionCreateResponse]
  implicit val RealtimeSessionCreateResponseEncoder: EntityEncoder[RealtimeSessionCreateResponse] = jsonEncoderOf[RealtimeSessionCreateResponse]
}
