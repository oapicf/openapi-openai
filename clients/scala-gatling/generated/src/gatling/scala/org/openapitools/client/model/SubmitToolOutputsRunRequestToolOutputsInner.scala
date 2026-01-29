
package org.openapitools.client.model


case class SubmitToolOutputsRunRequestToolOutputsInner (
    /* The ID of the tool call in the `required_action` object within the run object the output is being submitted for. */
    _toolCallId: Option[String],
    /* The output of the tool call to be submitted to continue the run. */
    _output: Option[String]
)
object SubmitToolOutputsRunRequestToolOutputsInner {
    def toStringBody(var_toolCallId: Object, var_output: Object) =
        s"""
        | {
        | "toolCallId":$var_toolCallId,"output":$var_output
        | }
        """.stripMargin
}
