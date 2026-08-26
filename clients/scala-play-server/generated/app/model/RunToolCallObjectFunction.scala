package model

import play.api.libs.json._

/**
  * The function definition.
  * @param name The name of the function.
  * @param arguments The arguments that the model expects you to pass to the function.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-26T05:22:02.282422614Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class RunToolCallObjectFunction(
  name: String,
  arguments: String
)

object RunToolCallObjectFunction {
  implicit lazy val runToolCallObjectFunctionJsonFormat: Format[RunToolCallObjectFunction] = Json.format[RunToolCallObjectFunction]
}

