
package org.openapitools.client.model


case class RunStepDeltaObjectDeltaStepDetails (
    /* Always `message_creation`. */
    _type: String,
    _messageCreation: Option[RunStepDeltaStepDetailsMessageCreationObjectMessageCreation],
    /* An array of tool calls the run step was involved in. These can be associated with one of three types of tools: `code_interpreter`, `file_search`, or `function`.  */
    _toolCalls: Option[List[RunStepDeltaStepDetailsToolCallsObjectToolCallsInner]]
)
object RunStepDeltaObjectDeltaStepDetails {
    def toStringBody(var_type: Object, var_messageCreation: Object, var_toolCalls: Object) =
        s"""
        | {
        | "type":$var_type,"messageCreation":$var_messageCreation,"toolCalls":$var_toolCalls
        | }
        """.stripMargin
}
