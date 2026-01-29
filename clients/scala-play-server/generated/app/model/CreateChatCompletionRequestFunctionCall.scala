package model

import play.api.libs.json._

/**
  * Deprecated in favor of `tool_choice`.  Controls which (if any) function is called by the model. `none` means the model will not call a function and instead generates a message. `auto` means the model can pick between generating a message or calling a function. Specifying a particular function via `{\"name\": \"my_function\"}` forces the model to call that function.  `none` is the default when no functions are present. `auto` is the default if functions are present. 
  * @param name The name of the function to call.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T10:48:27.489746113Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CreateChatCompletionRequestFunctionCall(
  name: String
)

object CreateChatCompletionRequestFunctionCall {
  implicit lazy val createChatCompletionRequestFunctionCallJsonFormat: Format[CreateChatCompletionRequestFunctionCall] = Json.format[CreateChatCompletionRequestFunctionCall]
}

