package model

import play.api.libs.json._

/**
  * Specifying a particular function via `{\"name\": \"my_function\"}` forces the model to call that function. 
  * @param name The name of the function to call.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:38:29.809972473Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class ChatCompletionFunctionCallOption(
  name: String
)

object ChatCompletionFunctionCallOption {
  implicit lazy val chatCompletionFunctionCallOptionJsonFormat: Format[ChatCompletionFunctionCallOption] = Json.format[ChatCompletionFunctionCallOption]
}

