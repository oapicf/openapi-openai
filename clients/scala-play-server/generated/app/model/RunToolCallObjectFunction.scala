package model

import play.api.libs.json._

/**
  * The function definition.
  * @param name The name of the function.
  * @param arguments The arguments that the model expects you to pass to the function.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T10:48:27.489746113Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class RunToolCallObjectFunction(
  name: String,
  arguments: String
)

object RunToolCallObjectFunction {
  implicit lazy val runToolCallObjectFunctionJsonFormat: Format[RunToolCallObjectFunction] = Json.format[RunToolCallObjectFunction]
}

