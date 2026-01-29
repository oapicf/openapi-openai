package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner._

case class RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner (
  /* Always `logs`. */
  `type`: `Type`,
/* The text output from the Code Interpreter tool call. */
  logs: String,
image: RunStepDetailsToolCallsCodeOutputImageObjectImage)

object RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner {
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

  implicit val RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInnerCodecJson: CodecJson[RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner] = CodecJson.derive[RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner]
  implicit val RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInnerDecoder: EntityDecoder[RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner] = jsonOf[RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner]
  implicit val RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInnerEncoder: EntityEncoder[RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner] = jsonEncoderOf[RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner]
}
