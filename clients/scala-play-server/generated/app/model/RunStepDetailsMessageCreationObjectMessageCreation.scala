package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for RunStepDetailsMessageCreationObject_message_creation.
  * @param messageId The ID of the message that was created by this run step.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-26T05:22:02.282422614Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class RunStepDetailsMessageCreationObjectMessageCreation(
  messageId: String
)

object RunStepDetailsMessageCreationObjectMessageCreation {
  implicit lazy val runStepDetailsMessageCreationObjectMessageCreationJsonFormat: Format[RunStepDetailsMessageCreationObjectMessageCreation] = Json.format[RunStepDetailsMessageCreationObjectMessageCreation]
}

