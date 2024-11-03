package model

import play.api.libs.json._

/**
  * Up to 4 sequences where the API will stop generating further tokens. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-03T11:15:39.331426426Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class CreateChatCompletionRequestStop(
)

object CreateChatCompletionRequestStop {
  implicit lazy val createChatCompletionRequestStopJsonFormat: Format[CreateChatCompletionRequestStop] = Json.format[CreateChatCompletionRequestStop]
}

