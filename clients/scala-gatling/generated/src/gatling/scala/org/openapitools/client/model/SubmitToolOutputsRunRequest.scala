
package org.openapitools.client.model


case class SubmitToolOutputsRunRequest (
    /* A list of tools for which the outputs are being submitted. */
    _toolOutputs: List[SubmitToolOutputsRunRequestToolOutputsInner],
    /* If `true`, returns a stream of events that happen during the Run as server-sent events, terminating when the Run enters a terminal state with a `data: [DONE]` message.  */
    _stream: Option[Boolean]
)
object SubmitToolOutputsRunRequest {
    def toStringBody(var_toolOutputs: Object, var_stream: Object) =
        s"""
        | {
        | "toolOutputs":$var_toolOutputs,"stream":$var_stream
        | }
        """.stripMargin
}
