package model

import play.api.libs.json._

/**
  * Up to 4 sequences where the API will stop generating further tokens. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-26T05:22:02.282422614Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class CreateChatCompletionRequestStop(
)

object CreateChatCompletionRequestStop {
  implicit lazy val createChatCompletionRequestStopJsonFormat: Format[CreateChatCompletionRequestStop] = Json.format[CreateChatCompletionRequestStop]
}

