package model

import play.api.libs.json._

/**
  * Up to 4 sequences where the API will stop generating further tokens. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-16T01:17:28.392125286Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class CreateChatCompletionRequestStop(
)

object CreateChatCompletionRequestStop {
  implicit lazy val createChatCompletionRequestStopJsonFormat: Format[CreateChatCompletionRequestStop] = Json.format[CreateChatCompletionRequestStop]
}

