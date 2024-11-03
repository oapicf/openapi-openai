package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject._

case class RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject (
  /* The index of the output in the outputs array. */
  index: Integer,
/* Always `logs`. */
  `type`: `Type`,
/* The text output from the Code Interpreter tool call. */
  logs: Option[String])

object RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject {
  import DateTimeCodecs._
  sealed trait `Type`
  case object Logs extends `Type`

  object `Type` {
    def to`Type`(s: String): Option[`Type`] = s match {
      case "Logs" => Some(Logs)
      case _ => None
    }

    def from`Type`(x: `Type`): String = x match {
      case Logs => "Logs"
    }
  }

  implicit val `Type`EnumEncoder: EncodeJson[`Type`] =
    EncodeJson[`Type`](is => StringEncodeJson(`Type`.from`Type`(is)))

  implicit val `Type`EnumDecoder: DecodeJson[`Type`] =
    DecodeJson.optionDecoder[`Type`](n => n.string.flatMap(jStr => `Type`.to`Type`(jStr)), "`Type` failed to de-serialize")

  implicit val RunStepDeltaStepDetailsToolCallsCodeOutputLogsObjectCodecJson: CodecJson[RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject] = CodecJson.derive[RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject]
  implicit val RunStepDeltaStepDetailsToolCallsCodeOutputLogsObjectDecoder: EntityDecoder[RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject] = jsonOf[RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject]
  implicit val RunStepDeltaStepDetailsToolCallsCodeOutputLogsObjectEncoder: EntityEncoder[RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject] = jsonEncoderOf[RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject]
}
