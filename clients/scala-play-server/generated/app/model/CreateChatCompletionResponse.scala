package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CreateChatCompletionResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-16T01:17:28.392125286Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class CreateChatCompletionResponse(
  id: String,
  `object`: String,
  created: Int,
  model: String,
  choices: List[CreateChatCompletionResponseChoicesInner],
  usage: Option[CreateCompletionResponseUsage]
)

object CreateChatCompletionResponse {
  implicit lazy val createChatCompletionResponseJsonFormat: Format[CreateChatCompletionResponse] = Json.format[CreateChatCompletionResponse]
}

