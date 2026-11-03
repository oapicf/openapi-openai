package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for RunStepDetailsToolCallsCodeOutputImageObject_image.
  * @param fileId The [file](/docs/api-reference/files) ID of the image.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:38:29.809972473Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class RunStepDetailsToolCallsCodeOutputImageObjectImage(
  fileId: String
)

object RunStepDetailsToolCallsCodeOutputImageObjectImage {
  implicit lazy val runStepDetailsToolCallsCodeOutputImageObjectImageJsonFormat: Format[RunStepDetailsToolCallsCodeOutputImageObjectImage] = Json.format[RunStepDetailsToolCallsCodeOutputImageObjectImage]
}

