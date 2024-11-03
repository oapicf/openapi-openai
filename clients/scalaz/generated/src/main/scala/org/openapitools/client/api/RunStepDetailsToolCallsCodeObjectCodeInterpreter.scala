package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import RunStepDetailsToolCallsCodeObjectCodeInterpreter._

case class RunStepDetailsToolCallsCodeObjectCodeInterpreter (
  /* The input to the Code Interpreter tool call. */
  input: String,
/* The outputs from the Code Interpreter tool call. Code Interpreter can output one or more items, including text (`logs`) or images (`image`). Each of these are represented by a different object type. */
  outputs: List[RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner])

object RunStepDetailsToolCallsCodeObjectCodeInterpreter {
  import DateTimeCodecs._

  implicit val RunStepDetailsToolCallsCodeObjectCodeInterpreterCodecJson: CodecJson[RunStepDetailsToolCallsCodeObjectCodeInterpreter] = CodecJson.derive[RunStepDetailsToolCallsCodeObjectCodeInterpreter]
  implicit val RunStepDetailsToolCallsCodeObjectCodeInterpreterDecoder: EntityDecoder[RunStepDetailsToolCallsCodeObjectCodeInterpreter] = jsonOf[RunStepDetailsToolCallsCodeObjectCodeInterpreter]
  implicit val RunStepDetailsToolCallsCodeObjectCodeInterpreterEncoder: EntityEncoder[RunStepDetailsToolCallsCodeObjectCodeInterpreter] = jsonEncoderOf[RunStepDetailsToolCallsCodeObjectCodeInterpreter]
}
