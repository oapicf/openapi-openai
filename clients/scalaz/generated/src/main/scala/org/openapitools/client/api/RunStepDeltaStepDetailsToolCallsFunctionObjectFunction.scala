package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import RunStepDeltaStepDetailsToolCallsFunctionObjectFunction._

case class RunStepDeltaStepDetailsToolCallsFunctionObjectFunction (
  /* The name of the function. */
  name: Option[String],
/* The arguments passed to the function. */
  arguments: Option[String],
/* The output of the function. This will be `null` if the outputs have not been [submitted](/docs/api-reference/runs/submitToolOutputs) yet. */
  output: Option[String])

object RunStepDeltaStepDetailsToolCallsFunctionObjectFunction {
  import DateTimeCodecs._

  implicit val RunStepDeltaStepDetailsToolCallsFunctionObjectFunctionCodecJson: CodecJson[RunStepDeltaStepDetailsToolCallsFunctionObjectFunction] = CodecJson.derive[RunStepDeltaStepDetailsToolCallsFunctionObjectFunction]
  implicit val RunStepDeltaStepDetailsToolCallsFunctionObjectFunctionDecoder: EntityDecoder[RunStepDeltaStepDetailsToolCallsFunctionObjectFunction] = jsonOf[RunStepDeltaStepDetailsToolCallsFunctionObjectFunction]
  implicit val RunStepDeltaStepDetailsToolCallsFunctionObjectFunctionEncoder: EntityEncoder[RunStepDeltaStepDetailsToolCallsFunctionObjectFunction] = jsonEncoderOf[RunStepDeltaStepDetailsToolCallsFunctionObjectFunction]
}
