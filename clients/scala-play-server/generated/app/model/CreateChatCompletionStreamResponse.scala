package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CreateChatCompletionStreamResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-16T01:17:28.392125286Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class CreateChatCompletionStreamResponse(
  id: String,
  `object`: String,
  created: Int,
  model: String,
  choices: List[CreateChatCompletionStreamResponseChoicesInner]
)

object CreateChatCompletionStreamResponse {
  implicit lazy val createChatCompletionStreamResponseJsonFormat: Format[CreateChatCompletionStreamResponse] = Json.format[CreateChatCompletionStreamResponse]
}

