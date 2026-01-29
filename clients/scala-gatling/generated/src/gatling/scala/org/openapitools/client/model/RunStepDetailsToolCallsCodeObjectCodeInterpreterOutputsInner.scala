
package org.openapitools.client.model


case class RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner (
    /* Always `logs`. */
    _type: String,
    /* The text output from the Code Interpreter tool call. */
    _logs: String,
    _image: RunStepDetailsToolCallsCodeOutputImageObjectImage
)
object RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner {
    def toStringBody(var_type: Object, var_logs: Object, var_image: Object) =
        s"""
        | {
        | "type":$var_type,"logs":$var_logs,"image":$var_image
        | }
        """.stripMargin
}
