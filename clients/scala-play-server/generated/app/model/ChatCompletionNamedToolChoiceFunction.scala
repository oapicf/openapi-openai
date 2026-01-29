package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ChatCompletionNamedToolChoice_function.
  * @param name The name of the function to call.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T10:48:27.489746113Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class ChatCompletionNamedToolChoiceFunction(
  name: String
)

object ChatCompletionNamedToolChoiceFunction {
  implicit lazy val chatCompletionNamedToolChoiceFunctionJsonFormat: Format[ChatCompletionNamedToolChoiceFunction] = Json.format[ChatCompletionNamedToolChoiceFunction]
}

