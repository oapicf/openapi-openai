package model

import play.api.libs.json._

/**
  * The input text to classify
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-04-14T13:53:34.453725706Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class CreateModerationRequestInput(
)

object CreateModerationRequestInput {
  implicit lazy val createModerationRequestInputJsonFormat: Format[CreateModerationRequestInput] = Json.format[CreateModerationRequestInput]
}

