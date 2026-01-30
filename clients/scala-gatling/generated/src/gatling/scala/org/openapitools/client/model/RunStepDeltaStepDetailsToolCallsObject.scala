
package org.openapitools.client.model


case class RunStepDeltaStepDetailsToolCallsObject (
    /* Always `tool_calls`. */
    _type: String,
    /* An array of tool calls the run step was involved in. These can be associated with one of three types of tools: `code_interpreter`, `file_search`, or `function`.  */
    _toolCalls: Option[List[RunStepDeltaStepDetailsToolCallsObjectToolCallsInner]]
)
object RunStepDeltaStepDetailsToolCallsObject {
    def toStringBody(var_type: Object, var_toolCalls: Object) =
        s"""
        | {
        | "type":$var_type,"toolCalls":$var_toolCalls
        | }
        """.stripMargin
}
