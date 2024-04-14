
package org.openapitools.client.model


case class RunStepDeltaStepDetailsMessageCreationObjectMessageCreation (
    /* The ID of the message that was created by this run step. */
    _messageId: Option[String]
)
object RunStepDeltaStepDetailsMessageCreationObjectMessageCreation {
    def toStringBody(var_messageId: Object) =
        s"""
        | {
        | "messageId":$var_messageId
        | }
        """.stripMargin
}
