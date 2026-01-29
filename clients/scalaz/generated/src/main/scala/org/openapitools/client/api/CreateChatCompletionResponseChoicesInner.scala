package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CreateChatCompletionResponseChoicesInner._

case class CreateChatCompletionResponseChoicesInner (
  /* The reason the model stopped generating tokens. This will be `stop` if the model hit a natural stop point or a provided stop sequence, `length` if the maximum number of tokens specified in the request was reached, `content_filter` if content was omitted due to a flag from our content filters, `tool_calls` if the model called a tool, or `function_call` (deprecated) if the model called a function.  */
  finishReason: FinishReason,
/* The index of the choice in the list of choices. */
  index: Integer,
message: ChatCompletionResponseMessage,
logprobs: CreateChatCompletionResponseChoicesInnerLogprobs)

object CreateChatCompletionResponseChoicesInner {
  import DateTimeCodecs._
  sealed trait FinishReason
  case object Stop extends FinishReason
  case object Length extends FinishReason
  case object ToolCalls extends FinishReason
  case object ContentFilter extends FinishReason
  case object FunctionCall extends FinishReason

  object FinishReason {
    def toFinishReason(s: String): Option[FinishReason] = s match {
      case "Stop" => Some(Stop)
      case "Length" => Some(Length)
      case "ToolCalls" => Some(ToolCalls)
      case "ContentFilter" => Some(ContentFilter)
      case "FunctionCall" => Some(FunctionCall)
      case _ => None
    }

    def fromFinishReason(x: FinishReason): String = x match {
      case Stop => "Stop"
      case Length => "Length"
      case ToolCalls => "ToolCalls"
      case ContentFilter => "ContentFilter"
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
