package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import RunStepDeltaStepDetailsToolCallsObjectToolCallsInner._

case class RunStepDeltaStepDetailsToolCallsObjectToolCallsInner (
  /* The index of the tool call in the tool calls array. */
  index: Integer,
/* The ID of the tool call object. */
  id: Option[String],
/* The type of tool call. This is always going to be `code_interpreter` for this type of tool call. */
  `type`: `Type`,
codeInterpreter: Option[RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter],
/* For now, this is always going to be an empty object. */
  retrieval: Option[Any],
function: Option[RunStepDeltaStepDetailsToolCallsFunctionObjectFunction])

object RunStepDeltaStepDetailsToolCallsObjectToolCallsInner {
  import DateTimeCodecs._
  sealed trait `Type`
  case object CodeInterpreter extends `Type`
  case object Retrieval extends `Type`
  case object Function extends `Type`

  object `Type` {
    def to`Type`(s: String): Option[`Type`] = s match {
      case "CodeInterpreter" => Some(CodeInterpreter)
      case "Retrieval" => Some(Retrieval)
      case "Function" => Some(Function)
      case _ => None
    }

    def from`Type`(x: `Type`): String = x match {
      case CodeInterpreter => "CodeInterpreter"
      case Retrieval => "Retrieval"
      case Function => "Function"
    }
  }

  implicit val `Type`EnumEncoder: EncodeJson[`Type`] =
    EncodeJson[`Type`](is => StringEncodeJson(`Type`.from`Type`(is)))

  implicit val `Type`EnumDecoder: DecodeJson[`Type`] =
    DecodeJson.optionDecoder[`Type`](n => n.string.flatMap(jStr => `Type`.to`Type`(jStr)), "`Type` failed to de-serialize")

  implicit val RunStepDeltaStepDetailsToolCallsObjectToolCallsInnerCodecJson: CodecJson[RunStepDeltaStepDetailsToolCallsObjectToolCallsInner] = CodecJson.derive[RunStepDeltaStepDetailsToolCallsObjectToolCallsInner]
  implicit val RunStepDeltaStepDetailsToolCallsObjectToolCallsInnerDecoder: EntityDecoder[RunStepDeltaStepDetailsToolCallsObjectToolCallsInner] = jsonOf[RunStepDeltaStepDetailsToolCallsObjectToolCallsInner]
  implicit val RunStepDeltaStepDetailsToolCallsObjectToolCallsInnerEncoder: EntityEncoder[RunStepDeltaStepDetailsToolCallsObjectToolCallsInner] = jsonEncoderOf[RunStepDeltaStepDetailsToolCallsObjectToolCallsInner]
}
