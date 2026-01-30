package model

import play.api.libs.json._

/**
  * The definition of the function that was called.
  * @param name The name of the function.
  * @param arguments The arguments passed to the function.
  * @param output The output of the function. This will be `null` if the outputs have not been [submitted](/docs/api-reference/runs/submitToolOutputs) yet.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class RunStepDeltaStepDetailsToolCallsFunctionObjectFunction(
  name: Option[String],
  arguments: Option[String],
  output: Option[String]
)

object RunStepDeltaStepDetailsToolCallsFunctionObjectFunction {
  implicit lazy val runStepDeltaStepDetailsToolCallsFunctionObjectFunctionJsonFormat: Format[RunStepDeltaStepDetailsToolCallsFunctionObjectFunction] = Json.format[RunStepDeltaStepDetailsToolCallsFunctionObjectFunction]
}

