
package org.openapitools.client.model


case class RunStepDetailsToolCallsObject (
    /* Always `tool_calls`. */
    _type: String,
    /* An array of tool calls the run step was involved in. These can be associated with one of three types of tools: `code_interpreter`, `retrieval`, or `function`.  */
    _toolCalls: List[RunStepDetailsToolCallsObjectToolCallsInner]
)
object RunStepDetailsToolCallsObject {
    def toStringBody(var_type: Object, var_toolCalls: Object) =
        s"""
        | {
        | "type":$var_type,"toolCalls":$var_toolCalls
        | }
        """.stripMargin
}
