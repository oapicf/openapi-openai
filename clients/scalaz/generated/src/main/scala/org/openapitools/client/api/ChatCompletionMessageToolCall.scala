package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ChatCompletionMessageToolCall._

case class ChatCompletionMessageToolCall (
  /* The ID of the tool call. */
  id: String,
/* The type of the tool. Currently, only `function` is supported. */
  `type`: `Type`,
function: ChatCompletionMessageToolCallFunction)

object ChatCompletionMessageToolCall {
  import DateTimeCodecs._
  sealed trait `Type`
  case object Function extends `Type`

  object `Type` {
    def to`Type`(s: String): Option[`Type`] = s match {
      case "Function" => Some(Function)
      case _ => None
    }

    def from`Type`(x: `Type`): String = x match {
      case Function => "Function"
    }
  }

  implicit val `Type`EnumEncoder: EncodeJson[`Type`] =
    EncodeJson[`Type`](is => StringEncodeJson(`Type`.from`Type`(is)))

  implicit val `Type`EnumDecoder: DecodeJson[`Type`] =
    DecodeJson.optionDecoder[`Type`](n => n.string.flatMap(jStr => `Type`.to`Type`(jStr)), "`Type` failed to de-serialize")

  implicit val ChatCompletionMessageToolCallCodecJson: CodecJson[ChatCompletionMessageToolCall] = CodecJson.derive[ChatCompletionMessageToolCall]
  implicit val ChatCompletionMessageToolCallDecoder: EntityDecoder[ChatCompletionMessageToolCall] = jsonOf[ChatCompletionMessageToolCall]
  implicit val ChatCompletionMessageToolCallEncoder: EntityEncoder[ChatCompletionMessageToolCall] = jsonEncoderOf[ChatCompletionMessageToolCall]
}
