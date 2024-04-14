
package org.openapitools.client.model


case class RunStepDeltaStepDetailsMessageCreationObject (
    /* Always `message_creation`. */
    _type: String,
    _messageCreation: Option[RunStepDeltaStepDetailsMessageCreationObjectMessageCreation]
)
object RunStepDeltaStepDetailsMessageCreationObject {
    def toStringBody(var_type: Object, var_messageCreation: Object) =
        s"""
        | {
        | "type":$var_type,"messageCreation":$var_messageCreation
        | }
        """.stripMargin
}
