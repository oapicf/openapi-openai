
package org.openapitools.client.model


case class RunStepDetailsMessageCreationObject (
    /* Always `message_creation`. */
    _type: String,
    _messageCreation: RunStepDetailsMessageCreationObjectMessageCreation
)
object RunStepDetailsMessageCreationObject {
    def toStringBody(var_type: Object, var_messageCreation: Object) =
        s"""
        | {
        | "type":$var_type,"messageCreation":$var_messageCreation
        | }
        """.stripMargin
}
