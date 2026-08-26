package model

import play.api.libs.json._

/**
  * Input (or inputs) to classify. Can be a single string, an array of strings, or an array of multi-modal input objects similar to other models. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-26T05:22:02.282422614Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class CreateModerationRequestInput(
)

object CreateModerationRequestInput {
  implicit lazy val createModerationRequestInputJsonFormat: Format[CreateModerationRequestInput] = Json.format[CreateModerationRequestInput]
}

