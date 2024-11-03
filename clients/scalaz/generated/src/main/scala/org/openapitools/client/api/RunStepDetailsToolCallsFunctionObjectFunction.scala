package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import RunStepDetailsToolCallsFunctionObjectFunction._

case class RunStepDetailsToolCallsFunctionObjectFunction (
  /* The name of the function. */
  name: String,
/* The arguments passed to the function. */
  arguments: String,
/* The output of the function. This will be `null` if the outputs have not been [submitted](/docs/api-reference/runs/submitToolOutputs) yet. */
  output: String)

object RunStepDetailsToolCallsFunctionObjectFunction {
  import DateTimeCodecs._

  implicit val RunStepDetailsToolCallsFunctionObjectFunctionCodecJson: CodecJson[RunStepDetailsToolCallsFunctionObjectFunction] = CodecJson.derive[RunStepDetailsToolCallsFunctionObjectFunction]
  implicit val RunStepDetailsToolCallsFunctionObjectFunctionDecoder: EntityDecoder[RunStepDetailsToolCallsFunctionObjectFunction] = jsonOf[RunStepDetailsToolCallsFunctionObjectFunction]
  implicit val RunStepDetailsToolCallsFunctionObjectFunctionEncoder: EntityEncoder[RunStepDetailsToolCallsFunctionObjectFunction] = jsonEncoderOf[RunStepDetailsToolCallsFunctionObjectFunction]
}
