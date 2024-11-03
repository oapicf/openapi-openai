package model

import play.api.libs.json._

/**
  * The input text to classify
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-03T11:15:39.331426426Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class CreateModerationRequestInput(
)

object CreateModerationRequestInput {
  implicit lazy val createModerationRequestInputJsonFormat: Format[CreateModerationRequestInput] = Json.format[CreateModerationRequestInput]
}

