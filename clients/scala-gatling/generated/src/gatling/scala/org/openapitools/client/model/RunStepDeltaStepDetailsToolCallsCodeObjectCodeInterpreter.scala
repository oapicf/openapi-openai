
package org.openapitools.client.model


case class RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter (
    /* The input to the Code Interpreter tool call. */
    _input: Option[String],
    /* The outputs from the Code Interpreter tool call. Code Interpreter can output one or more items, including text (`logs`) or images (`image`). Each of these are represented by a different object type. */
    _outputs: Option[List[RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner]]
)
object RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter {
    def toStringBody(var_input: Object, var_outputs: Object) =
        s"""
        | {
        | "input":$var_input,"outputs":$var_outputs
        | }
        """.stripMargin
}
