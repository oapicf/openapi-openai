package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for RunStepDetailsToolCallsCodeOutputImageObject_image.
  * @param fileId The [file](/docs/api-reference/files) ID of the image.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-04-14T13:53:34.453725706Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class RunStepDetailsToolCallsCodeOutputImageObjectImage(
  fileId: String
)

object RunStepDetailsToolCallsCodeOutputImageObjectImage {
  implicit lazy val runStepDetailsToolCallsCodeOutputImageObjectImageJsonFormat: Format[RunStepDetailsToolCallsCodeOutputImageObjectImage] = Json.format[RunStepDetailsToolCallsCodeOutputImageObjectImage]
}

