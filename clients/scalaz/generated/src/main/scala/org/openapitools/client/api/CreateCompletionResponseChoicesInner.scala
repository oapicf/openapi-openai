package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CreateCompletionResponseChoicesInner._

case class CreateCompletionResponseChoicesInner (
  text: String,
index: Integer,
logprobs: CreateCompletionResponseChoicesInnerLogprobs,
finishReason: FinishReason)

object CreateCompletionResponseChoicesInner {
  import DateTimeCodecs._
  sealed trait FinishReason
  case object Stop extends FinishReason
  case object Length extends FinishReason

  object FinishReason {
    def toFinishReason(s: String): Option[FinishReason] = s match {
      case "Stop" => Some(Stop)
      case "Length" => Some(Length)
      case _ => None
    }

    def fromFinishReason(x: FinishReason): String = x match {
      case Stop => "Stop"
      case Length => "Length"
    }
  }

  implicit val FinishReasonEnumEncoder: EncodeJson[FinishReason] =
    EncodeJson[FinishReason](is => StringEncodeJson(FinishReason.fromFinishReason(is)))

  implicit val FinishReasonEnumDecoder: DecodeJson[FinishReason] =
    DecodeJson.optionDecoder[FinishReason](n => n.string.flatMap(jStr => FinishReason.toFinishReason(jStr)), "FinishReason failed to de-serialize")

  implicit val CreateCompletionResponseChoicesInnerCodecJson: CodecJson[CreateCompletionResponseChoicesInner] = CodecJson.derive[CreateCompletionResponseChoicesInner]
  implicit val CreateCompletionResponseChoicesInnerDecoder: EntityDecoder[CreateCompletionResponseChoicesInner] = jsonOf[CreateCompletionResponseChoicesInner]
  implicit val CreateCompletionResponseChoicesInnerEncoder: EntityEncoder[CreateCompletionResponseChoicesInner] = jsonEncoderOf[CreateCompletionResponseChoicesInner]
}
