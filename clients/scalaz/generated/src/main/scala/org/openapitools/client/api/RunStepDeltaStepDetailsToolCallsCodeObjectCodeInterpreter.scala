package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter._

case class RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter (
  /* The input to the Code Interpreter tool call. */
  input: Option[String],
/* The outputs from the Code Interpreter tool call. Code Interpreter can output one or more items, including text (`logs`) or images (`image`). Each of these are represented by a different object type. */
  outputs: Option[List[RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner]])

object RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter {
  import DateTimeCodecs._

  implicit val RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterCodecJson: CodecJson[RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter] = CodecJson.derive[RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter]
  implicit val RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterDecoder: EntityDecoder[RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter] = jsonOf[RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter]
  implicit val RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterEncoder: EntityEncoder[RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter] = jsonEncoderOf[RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter]
}
