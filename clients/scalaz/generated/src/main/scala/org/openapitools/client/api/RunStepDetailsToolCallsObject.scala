package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import RunStepDetailsToolCallsObject._

case class RunStepDetailsToolCallsObject (
  /* Always `tool_calls`. */
  `type`: `Type`,
/* An array of tool calls the run step was involved in. These can be associated with one of three types of tools: `code_interpreter`, `file_search`, or `function`.  */
  toolCalls: List[RunStepDetailsToolCallsObjectToolCallsInner])

object RunStepDetailsToolCallsObject {
  import DateTimeCodecs._
  sealed trait `Type`
  case object ToolCalls extends `Type`

  object `Type` {
    def to`Type`(s: String): Option[`Type`] = s match {
      case "ToolCalls" => Some(ToolCalls)
      case _ => None
    }

    def from`Type`(x: `Type`): String = x match {
      case ToolCalls => "ToolCalls"
    }
  }

  implicit val `Type`EnumEncoder: EncodeJson[`Type`] =
    EncodeJson[`Type`](is => StringEncodeJson(`Type`.from`Type`(is)))

  implicit val `Type`EnumDecoder: DecodeJson[`Type`] =
    DecodeJson.optionDecoder[`Type`](n => n.string.flatMap(jStr => `Type`.to`Type`(jStr)), "`Type` failed to de-serialize")

  implicit val RunStepDetailsToolCallsObjectCodecJson: CodecJson[RunStepDetailsToolCallsObject] = CodecJson.derive[RunStepDetailsToolCallsObject]
  implicit val RunStepDetailsToolCallsObjectDecoder: EntityDecoder[RunStepDetailsToolCallsObject] = jsonOf[RunStepDetailsToolCallsObject]
  implicit val RunStepDetailsToolCallsObjectEncoder: EntityEncoder[RunStepDetailsToolCallsObject] = jsonEncoderOf[RunStepDetailsToolCallsObject]
}
