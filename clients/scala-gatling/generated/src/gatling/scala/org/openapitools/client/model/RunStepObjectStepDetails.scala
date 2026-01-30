
package org.openapitools.client.model


case class RunStepObjectStepDetails (
    /* Always `message_creation`. */
    _type: String,
    _messageCreation: RunStepDetailsMessageCreationObjectMessageCreation,
    /* An array of tool calls the run step was involved in. These can be associated with one of three types of tools: `code_interpreter`, `file_search`, or `function`.  */
    _toolCalls: List[RunStepDetailsToolCallsObjectToolCallsInner]
)
object RunStepObjectStepDetails {
    def toStringBody(var_type: Object, var_messageCreation: Object, var_toolCalls: Object) =
        s"""
        | {
        | "type":$var_type,"messageCreation":$var_messageCreation,"toolCalls":$var_toolCalls
        | }
        """.stripMargin
}
