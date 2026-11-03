package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AssistantsNamedToolChoice_function.
  * @param name The name of the function to call.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:38:29.809972473Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class AssistantsNamedToolChoiceFunction(
  name: String
)

object AssistantsNamedToolChoiceFunction {
  implicit lazy val assistantsNamedToolChoiceFunctionJsonFormat: Format[AssistantsNamedToolChoiceFunction] = Json.format[AssistantsNamedToolChoiceFunction]
}

