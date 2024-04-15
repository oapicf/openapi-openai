package model

import play.api.libs.json._

/**
  * The function that the model called.
  * @param name The name of the function to call.
  * @param arguments The arguments to call the function with, as generated by the model in JSON format. Note that the model does not always generate valid JSON, and may hallucinate parameters not defined by your function schema. Validate the arguments in your code before calling your function.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-04-14T13:53:34.453725706Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class ChatCompletionMessageToolCallFunction(
  name: String,
  arguments: String
)

object ChatCompletionMessageToolCallFunction {
  implicit lazy val chatCompletionMessageToolCallFunctionJsonFormat: Format[ChatCompletionMessageToolCallFunction] = Json.format[ChatCompletionMessageToolCallFunction]
}
