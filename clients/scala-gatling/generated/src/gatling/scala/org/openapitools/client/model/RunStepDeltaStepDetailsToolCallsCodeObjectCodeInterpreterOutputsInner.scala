
package org.openapitools.client.model


case class RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner (
    /* The index of the output in the outputs array. */
    _index: Integer,
    /* Always `logs`. */
    _type: String,
    /* The text output from the Code Interpreter tool call. */
    _logs: Option[String],
    _image: Option[RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage]
)
object RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner {
    def toStringBody(var_index: Object, var_type: Object, var_logs: Object, var_image: Object) =
        s"""
        | {
        | "index":$var_index,"type":$var_type,"logs":$var_logs,"image":$var_image
        | }
        """.stripMargin
}
