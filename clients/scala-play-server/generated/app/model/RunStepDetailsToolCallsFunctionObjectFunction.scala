package model

import play.api.libs.json._

/**
  * The definition of the function that was called.
  * @param name The name of the function.
  * @param arguments The arguments passed to the function.
  * @param output The output of the function. This will be `null` if the outputs have not been [submitted](/docs/api-reference/runs/submitToolOutputs) yet.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-03T11:15:39.331426426Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class RunStepDetailsToolCallsFunctionObjectFunction(
  name: String,
  arguments: String,
  output: String
)

object RunStepDetailsToolCallsFunctionObjectFunction {
  implicit lazy val runStepDetailsToolCallsFunctionObjectFunctionJsonFormat: Format[RunStepDetailsToolCallsFunctionObjectFunction] = Json.format[RunStepDetailsToolCallsFunctionObjectFunction]
}

