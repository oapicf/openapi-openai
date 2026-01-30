package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for RunStepDetailsToolCallsCodeOutputImageObject_image.
  * @param fileId The [file](/docs/api-reference/files) ID of the image.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class RunStepDetailsToolCallsCodeOutputImageObjectImage(
  fileId: String
)

object RunStepDetailsToolCallsCodeOutputImageObjectImage {
  implicit lazy val runStepDetailsToolCallsCodeOutputImageObjectImageJsonFormat: Format[RunStepDetailsToolCallsCodeOutputImageObjectImage] = Json.format[RunStepDetailsToolCallsCodeOutputImageObjectImage]
}

