package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for RunStepDeltaStepDetailsMessageCreationObject_message_creation.
  * @param messageId The ID of the message that was created by this run step.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:38:29.809972473Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class RunStepDeltaStepDetailsMessageCreationObjectMessageCreation(
  messageId: Option[String]
)

object RunStepDeltaStepDetailsMessageCreationObjectMessageCreation {
  implicit lazy val runStepDeltaStepDetailsMessageCreationObjectMessageCreationJsonFormat: Format[RunStepDeltaStepDetailsMessageCreationObjectMessageCreation] = Json.format[RunStepDeltaStepDetailsMessageCreationObjectMessageCreation]
}

