package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for RunStepDeltaStepDetailsToolCallsCodeOutputImageObject_image.
  * @param fileId The [file](/docs/api-reference/files) ID of the image.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T10:48:27.489746113Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage(
  fileId: Option[String]
)

object RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage {
  implicit lazy val runStepDeltaStepDetailsToolCallsCodeOutputImageObjectImageJsonFormat: Format[RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage] = Json.format[RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage]
}

