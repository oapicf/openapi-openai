
package org.openapitools.client.model


case class RunStepDetailsToolCallsCodeObjectCodeInterpreter (
    /* The input to the Code Interpreter tool call. */
    _input: String,
    /* The outputs from the Code Interpreter tool call. Code Interpreter can output one or more items, including text (`logs`) or images (`image`). Each of these are represented by a different object type. */
    _outputs: List[RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner]
)
object RunStepDetailsToolCallsCodeObjectCodeInterpreter {
    def toStringBody(var_input: Object, var_outputs: Object) =
        s"""
        | {
        | "input":$var_input,"outputs":$var_outputs
        | }
        """.stripMargin
}
