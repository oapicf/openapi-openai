package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ChatCompletionNamedToolChoice._

case class ChatCompletionNamedToolChoice (
  /* The type of the tool. Currently, only `function` is supported. */
  `type`: `Type`,
function: ChatCompletionNamedToolChoiceFunction)

object ChatCompletionNamedToolChoice {
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

  implicit val ChatCompletionNamedToolChoiceCodecJson: CodecJson[ChatCompletionNamedToolChoice] = CodecJson.derive[ChatCompletionNamedToolChoice]
  implicit val ChatCompletionNamedToolChoiceDecoder: EntityDecoder[ChatCompletionNamedToolChoice] = jsonOf[ChatCompletionNamedToolChoice]
  implicit val ChatCompletionNamedToolChoiceEncoder: EntityEncoder[ChatCompletionNamedToolChoice] = jsonEncoderOf[ChatCompletionNamedToolChoice]
}
