package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CreateChatCompletionFunctionResponseChoicesInner._

case class CreateChatCompletionFunctionResponseChoicesInner (
  /* The reason the model stopped generating tokens. This will be `stop` if the model hit a natural stop point or a provided stop sequence, `length` if the maximum number of tokens specified in the request was reached, `content_filter` if content was omitted due to a flag from our content filters, or `function_call` if the model called a function.  */
  finishReason: FinishReason,
/* The index of the choice in the list of choices. */
  index: Integer,
message: ChatCompletionResponseMessage)

object CreateChatCompletionFunctionResponseChoicesInner {
  import DateTimeCodecs._
  sealed trait FinishReason
  case object Stop extends FinishReason
  case object Length extends FinishReason
  case object FunctionCall extends FinishReason
  case object ContentFilter extends FinishReason

  object FinishReason {
    def toFinishReason(s: String): Option[FinishReason] = s match {
      case "Stop" => Some(Stop)
      case "Length" => Some(Length)
      case "FunctionCall" => Some(FunctionCall)
      case "ContentFilter" => Some(ContentFilter)
      case _ => None
    }

    def fromFinishReason(x: FinishReason): String = x match {
      case Stop => "Stop"
      case Length => "Length"
      case FunctionCall => "FunctionCall"
      case ContentFilter => "ContentFilter"
    }
  }

  implicit val FinishReasonEnumEncoder: EncodeJson[FinishReason] =
    EncodeJson[FinishReason](is => StringEncodeJson(FinishReason.fromFinishReason(is)))

  implicit val FinishReasonEnumDecoder: DecodeJson[FinishReason] =
    DecodeJson.optionDecoder[FinishReason](n => n.string.flatMap(jStr => FinishReason.toFinishReason(jStr)), "FinishReason failed to de-serialize")

  implicit val CreateChatCompletionFunctionResponseChoicesInnerCodecJson: CodecJson[CreateChatCompletionFunctionResponseChoicesInner] = CodecJson.derive[CreateChatCompletionFunctionResponseChoicesInner]
  implicit val CreateChatCompletionFunctionResponseChoicesInnerDecoder: EntityDecoder[CreateChatCompletionFunctionResponseChoicesInner] = jsonOf[CreateChatCompletionFunctionResponseChoicesInner]
  implicit val CreateChatCompletionFunctionResponseChoicesInnerEncoder: EntityEncoder[CreateChatCompletionFunctionResponseChoicesInner] = jsonEncoderOf[CreateChatCompletionFunctionResponseChoicesInner]
}
