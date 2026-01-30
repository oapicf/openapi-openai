package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import RunStepDetailsToolCallsObjectToolCallsInner._

case class RunStepDetailsToolCallsObjectToolCallsInner (
  /* The ID of the tool call object. */
  id: String,
/* The type of tool call. This is always going to be `code_interpreter` for this type of tool call. */
  `type`: `Type`,
codeInterpreter: RunStepDetailsToolCallsCodeObjectCodeInterpreter,
fileSearch: RunStepDetailsToolCallsFileSearchObjectFileSearch,
function: RunStepDetailsToolCallsFunctionObjectFunction)

object RunStepDetailsToolCallsObjectToolCallsInner {
  import DateTimeCodecs._
  sealed trait `Type`
  case object CodeInterpreter extends `Type`
  case object FileSearch extends `Type`
  case object Function extends `Type`

  object `Type` {
    def to`Type`(s: String): Option[`Type`] = s match {
      case "CodeInterpreter" => Some(CodeInterpreter)
      case "FileSearch" => Some(FileSearch)
      case "Function" => Some(Function)
      case _ => None
    }

    def from`Type`(x: `Type`): String = x match {
      case CodeInterpreter => "CodeInterpreter"
      case FileSearch => "FileSearch"
      case Function => "Function"
    }
  }

  implicit val `Type`EnumEncoder: EncodeJson[`Type`] =
    EncodeJson[`Type`](is => StringEncodeJson(`Type`.from`Type`(is)))

  implicit val `Type`EnumDecoder: DecodeJson[`Type`] =
    DecodeJson.optionDecoder[`Type`](n => n.string.flatMap(jStr => `Type`.to`Type`(jStr)), "`Type` failed to de-serialize")

  implicit val RunStepDetailsToolCallsObjectToolCallsInnerCodecJson: CodecJson[RunStepDetailsToolCallsObjectToolCallsInner] = CodecJson.derive[RunStepDetailsToolCallsObjectToolCallsInner]
  implicit val RunStepDetailsToolCallsObjectToolCallsInnerDecoder: EntityDecoder[RunStepDetailsToolCallsObjectToolCallsInner] = jsonOf[RunStepDetailsToolCallsObjectToolCallsInner]
  implicit val RunStepDetailsToolCallsObjectToolCallsInnerEncoder: EntityEncoder[RunStepDetailsToolCallsObjectToolCallsInner] = jsonEncoderOf[RunStepDetailsToolCallsObjectToolCallsInner]
}
