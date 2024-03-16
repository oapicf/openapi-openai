package model

import play.api.libs.json._

/**
  * Controls how the model responds to function calls. \"none\" means the model does not call a function, and responds to the end-user. \"auto\" means the model can pick between an end-user or calling a function.  Specifying a particular function via `{\"name\":\\ \"my_function\"}` forces the model to call that function. \"none\" is the default when no functions are present. \"auto\" is the default if functions are present.
  * @param name The name of the function to call.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-16T01:17:28.392125286Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class CreateChatCompletionRequestFunctionCall(
  name: String
)

object CreateChatCompletionRequestFunctionCall {
  implicit lazy val createChatCompletionRequestFunctionCallJsonFormat: Format[CreateChatCompletionRequestFunctionCall] = Json.format[CreateChatCompletionRequestFunctionCall]
}

