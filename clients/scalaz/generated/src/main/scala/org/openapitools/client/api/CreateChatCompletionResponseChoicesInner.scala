package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CreateChatCompletionResponseChoicesInner._

case class CreateChatCompletionResponseChoicesInner (
  index: Option[Integer],
message: Option[ChatCompletionResponseMessage],
finishReason: Option[FinishReason])

object CreateChatCompletionResponseChoicesInner {
  import DateTimeCodecs._
  sealed trait FinishReason
  case object Stop extends FinishReason
  case object Length extends FinishReason
  case object FunctionCall extends FinishReason

  object FinishReason {
    def toFinishReason(s: String): Option[FinishReason] = s match {
      case "Stop" => Some(Stop)
      case "Length" => Some(Length)
      case "FunctionCall" => Some(FunctionCall)
      case _ => None
    }

    def fromFinishReason(x: FinishReason): String = x match {
      case Stop => "Stop"
      case Length => "Length"
      case FunctionCall => "FunctionCall"
    }
  }

  implicit val FinishReasonEnumEncoder: EncodeJson[FinishReason] =
    EncodeJson[FinishReason](is => StringEncodeJson(FinishReason.fromFinishReason(is)))

  implicit val FinishReasonEnumDecoder: DecodeJson[FinishReason] =
    DecodeJson.optionDecoder[FinishReason](n => n.string.flatMap(jStr => FinishReason.toFinishReason(jStr)), "FinishReason failed to de-serialize")

  implicit val CreateChatCompletionResponseChoicesInnerCodecJson: CodecJson[CreateChatCompletionResponseChoicesInner] = CodecJson.derive[CreateChatCompletionResponseChoicesInner]
  implicit val CreateChatCompletionResponseChoicesInnerDecoder: EntityDecoder[CreateChatCompletionResponseChoicesInner] = jsonOf[CreateChatCompletionResponseChoicesInner]
  implicit val CreateChatCompletionResponseChoicesInnerEncoder: EntityEncoder[CreateChatCompletionResponseChoicesInner] = jsonEncoderOf[CreateChatCompletionResponseChoicesInner]
}
