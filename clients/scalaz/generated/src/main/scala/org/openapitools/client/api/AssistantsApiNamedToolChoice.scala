package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AssistantsApiNamedToolChoice._

case class AssistantsApiNamedToolChoice (
  /* The type of the tool. If type is `function`, the function name must be set */
  `type`: `Type`,
function: Option[ChatCompletionNamedToolChoiceFunction])

object AssistantsApiNamedToolChoice {
  import DateTimeCodecs._
  sealed trait `Type`
  case object Function extends `Type`
  case object CodeInterpreter extends `Type`
  case object Retrieval extends `Type`

  object `Type` {
    def to`Type`(s: String): Option[`Type`] = s match {
      case "Function" => Some(Function)
      case "CodeInterpreter" => Some(CodeInterpreter)
      case "Retrieval" => Some(Retrieval)
      case _ => None
    }

    def from`Type`(x: `Type`): String = x match {
      case Function => "Function"
      case CodeInterpreter => "CodeInterpreter"
      case Retrieval => "Retrieval"
    }
  }

  implicit val `Type`EnumEncoder: EncodeJson[`Type`] =
    EncodeJson[`Type`](is => StringEncodeJson(`Type`.from`Type`(is)))

  implicit val `Type`EnumDecoder: DecodeJson[`Type`] =
    DecodeJson.optionDecoder[`Type`](n => n.string.flatMap(jStr => `Type`.to`Type`(jStr)), "`Type` failed to de-serialize")

  implicit val AssistantsApiNamedToolChoiceCodecJson: CodecJson[AssistantsApiNamedToolChoice] = CodecJson.derive[AssistantsApiNamedToolChoice]
  implicit val AssistantsApiNamedToolChoiceDecoder: EntityDecoder[AssistantsApiNamedToolChoice] = jsonOf[AssistantsApiNamedToolChoice]
  implicit val AssistantsApiNamedToolChoiceEncoder: EntityEncoder[AssistantsApiNamedToolChoice] = jsonEncoderOf[AssistantsApiNamedToolChoice]
}
