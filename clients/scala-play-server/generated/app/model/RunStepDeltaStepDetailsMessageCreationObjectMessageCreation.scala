package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for RunStepDeltaStepDetailsMessageCreationObject_message_creation.
  * @param messageId The ID of the message that was created by this run step.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class RunStepDeltaStepDetailsMessageCreationObjectMessageCreation(
  messageId: Option[String]
)

object RunStepDeltaStepDetailsMessageCreationObjectMessageCreation {
  implicit lazy val runStepDeltaStepDetailsMessageCreationObjectMessageCreationJsonFormat: Format[RunStepDeltaStepDetailsMessageCreationObjectMessageCreation] = Json.format[RunStepDeltaStepDetailsMessageCreationObjectMessageCreation]
}

