package model

import play.api.libs.json._

/**
  * Details of the message creation by the run step.
  * @param `type` Always `message_creation`.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:38:29.809972473Z[Etc/UTC]", comments = "Generator version: 7.26.0")
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

