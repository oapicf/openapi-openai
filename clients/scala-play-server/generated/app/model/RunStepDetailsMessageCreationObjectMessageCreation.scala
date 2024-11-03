package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for RunStepDetailsMessageCreationObject_message_creation.
  * @param messageId The ID of the message that was created by this run step.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-03T11:15:39.331426426Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class RunStepDetailsMessageCreationObjectMessageCreation(
  messageId: String
)

object RunStepDetailsMessageCreationObjectMessageCreation {
  implicit lazy val runStepDetailsMessageCreationObjectMessageCreationJsonFormat: Format[RunStepDetailsMessageCreationObjectMessageCreation] = Json.format[RunStepDetailsMessageCreationObjectMessageCreation]
}

