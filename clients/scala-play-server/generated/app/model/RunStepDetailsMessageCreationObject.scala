package model

import play.api.libs.json._

/**
  * Details of the message creation by the run step.
  * @param `type` Always `message_creation`.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-03T11:15:39.331426426Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class RunStepDetailsMessageCreationObject(
  `type`: RunStepDetailsMessageCreationObject.Type.Value,
  messageCreation: RunStepDetailsMessageCreationObjectMessageCreation
)

object RunStepDetailsMessageCreationObject {
  implicit lazy val runStepDetailsMessageCreationObjectJsonFormat: Format[RunStepDetailsMessageCreationObject] = Json.format[RunStepDetailsMessageCreationObject]

  // noinspection TypeAnnotation
  object Type extends Enumeration {
    val MessageCreation = Value("message_creation")

    type Type = Value
    implicit lazy val TypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

