package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for RunStepDeltaStepDetailsToolCallsCodeOutputImageObject.
  * @param index The index of the output in the outputs array.
  * @param `type` Always `image`.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-03T11:15:39.331426426Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class RunStepDeltaStepDetailsToolCallsCodeOutputImageObject(
  index: Int,
  `type`: RunStepDeltaStepDetailsToolCallsCodeOutputImageObject.Type.Value,
  image: Option[RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage]
)

object RunStepDeltaStepDetailsToolCallsCodeOutputImageObject {
  implicit lazy val runStepDeltaStepDetailsToolCallsCodeOutputImageObjectJsonFormat: Format[RunStepDeltaStepDetailsToolCallsCodeOutputImageObject] = Json.format[RunStepDeltaStepDetailsToolCallsCodeOutputImageObject]

  // noinspection TypeAnnotation
  object Type extends Enumeration {
    val Image = Value("image")

    type Type = Value
    implicit lazy val TypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

