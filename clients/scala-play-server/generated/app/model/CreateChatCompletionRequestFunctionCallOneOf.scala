package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CreateChatCompletionRequest_function_call_oneOf.
  * @param name The name of the function to call.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-16T01:17:28.392125286Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class CreateChatCompletionRequestFunctionCallOneOf(
  name: String
)

object CreateChatCompletionRequestFunctionCallOneOf {
  implicit lazy val createChatCompletionRequestFunctionCallOneOfJsonFormat: Format[CreateChatCompletionRequestFunctionCallOneOf] = Json.format[CreateChatCompletionRequestFunctionCallOneOf]
}

