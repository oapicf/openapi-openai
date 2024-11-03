package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ChatCompletionNamedToolChoice_function.
  * @param name The name of the function to call.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-03T11:15:39.331426426Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class ChatCompletionNamedToolChoiceFunction(
  name: String
)

object ChatCompletionNamedToolChoiceFunction {
  implicit lazy val chatCompletionNamedToolChoiceFunctionJsonFormat: Format[ChatCompletionNamedToolChoiceFunction] = Json.format[ChatCompletionNamedToolChoiceFunction]
}

