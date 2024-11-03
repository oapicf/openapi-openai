package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import RunStepDeltaStepDetailsToolCallsCodeObject._

case class RunStepDeltaStepDetailsToolCallsCodeObject (
  /* The index of the tool call in the tool calls array. */
  index: Integer,
/* The ID of the tool call. */
  id: Option[String],
/* The type of tool call. This is always going to be `code_interpreter` for this type of tool call. */
  `type`: `Type`,
codeInterpreter: Option[RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter])

object RunStepDeltaStepDetailsToolCallsCodeObject {
  import DateTimeCodecs._
  sealed trait `Type`
  case object CodeInterpreter extends `Type`

  object `Type` {
    def to`Type`(s: String): Option[`Type`] = s match {
      case "CodeInterpreter" => Some(CodeInterpreter)
      case _ => None
    }

    def from`Type`(x: `Type`): String = x match {
      case CodeInterpreter => "CodeInterpreter"
    }
  }

  implicit val `Type`EnumEncoder: EncodeJson[`Type`] =
    EncodeJson[`Type`](is => StringEncodeJson(`Type`.from`Type`(is)))

  implicit val `Type`EnumDecoder: DecodeJson[`Type`] =
    DecodeJson.optionDecoder[`Type`](n => n.string.flatMap(jStr => `Type`.to`Type`(jStr)), "`Type` failed to de-serialize")

  implicit val RunStepDeltaStepDetailsToolCallsCodeObjectCodecJson: CodecJson[RunStepDeltaStepDetailsToolCallsCodeObject] = CodecJson.derive[RunStepDeltaStepDetailsToolCallsCodeObject]
  implicit val RunStepDeltaStepDetailsToolCallsCodeObjectDecoder: EntityDecoder[RunStepDeltaStepDetailsToolCallsCodeObject] = jsonOf[RunStepDeltaStepDetailsToolCallsCodeObject]
  implicit val RunStepDeltaStepDetailsToolCallsCodeObjectEncoder: EntityEncoder[RunStepDeltaStepDetailsToolCallsCodeObject] = jsonEncoderOf[RunStepDeltaStepDetailsToolCallsCodeObject]
}
