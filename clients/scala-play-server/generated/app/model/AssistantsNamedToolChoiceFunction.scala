package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AssistantsNamedToolChoice_function.
  * @param name The name of the function to call.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class AssistantsNamedToolChoiceFunction(
  name: String
)

object AssistantsNamedToolChoiceFunction {
  implicit lazy val assistantsNamedToolChoiceFunctionJsonFormat: Format[AssistantsNamedToolChoiceFunction] = Json.format[AssistantsNamedToolChoiceFunction]
}

