package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner._

case class RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner (
  /* The index of the output in the outputs array. */
  index: Integer,
/* Always `logs`. */
  `type`: `Type`,
/* The text output from the Code Interpreter tool call. */
  logs: Option[String],
image: Option[RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage])

object RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner {
  import DateTimeCodecs._
  sealed trait `Type`
  case object Logs extends `Type`
  case object Image extends `Type`

  object `Type` {
    def to`Type`(s: String): Option[`Type`] = s match {
      case "Logs" => Some(Logs)
      case "Image" => Some(Image)
      case _ => None
    }

    def from`Type`(x: `Type`): String = x match {
      case Logs => "Logs"
      case Image => "Image"
    }
  }

  implicit val `Type`EnumEncoder: EncodeJson[`Type`] =
    EncodeJson[`Type`](is => StringEncodeJson(`Type`.from`Type`(is)))

  implicit val `Type`EnumDecoder: DecodeJson[`Type`] =
    DecodeJson.optionDecoder[`Type`](n => n.string.flatMap(jStr => `Type`.to`Type`(jStr)), "`Type` failed to de-serialize")

  implicit val RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInnerCodecJson: CodecJson[RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner] = CodecJson.derive[RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner]
  implicit val RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInnerDecoder: EntityDecoder[RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner] = jsonOf[RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner]
  implicit val RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInnerEncoder: EntityEncoder[RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner] = jsonEncoderOf[RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner]
}
