package model

import play.api.libs.json._

/**
  * Input (or inputs) to classify. Can be a single string, an array of strings, or an array of multi-modal input objects similar to other models. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CreateModerationRequestInput(
)

object CreateModerationRequestInput {
  implicit lazy val createModerationRequestInputJsonFormat: Format[CreateModerationRequestInput] = Json.format[CreateModerationRequestInput]
}

