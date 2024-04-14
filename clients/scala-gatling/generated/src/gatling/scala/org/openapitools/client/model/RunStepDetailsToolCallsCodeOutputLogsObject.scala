
package org.openapitools.client.model


case class RunStepDetailsToolCallsCodeOutputLogsObject (
    /* Always `logs`. */
    _type: String,
    /* The text output from the Code Interpreter tool call. */
    _logs: String
)
object RunStepDetailsToolCallsCodeOutputLogsObject {
    def toStringBody(var_type: Object, var_logs: Object) =
        s"""
        | {
        | "type":$var_type,"logs":$var_logs
        | }
        """.stripMargin
}
