
package org.openapitools.client.model


case class RunStepDetailsMessageCreationObjectMessageCreation (
    /* The ID of the message that was created by this run step. */
    _messageId: String
)
object RunStepDetailsMessageCreationObjectMessageCreation {
    def toStringBody(var_messageId: Object) =
        s"""
        | {
        | "messageId":$var_messageId
        | }
        """.stripMargin
}
