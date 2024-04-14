package model

import play.api.libs.json._

/**
  * Up to 4 sequences where the API will stop generating further tokens. The returned text will not contain the stop sequence. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-04-14T13:53:34.453725706Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class CreateCompletionRequestStop(
)

object CreateCompletionRequestStop {
  implicit lazy val createCompletionRequestStopJsonFormat: Format[CreateCompletionRequestStop] = Json.format[CreateCompletionRequestStop]
}

