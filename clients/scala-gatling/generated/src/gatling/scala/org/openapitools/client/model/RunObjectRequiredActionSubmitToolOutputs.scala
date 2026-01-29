
package org.openapitools.client.model


case class RunObjectRequiredActionSubmitToolOutputs (
    /* A list of the relevant tool calls. */
    _toolCalls: List[RunToolCallObject]
)
object RunObjectRequiredActionSubmitToolOutputs {
    def toStringBody(var_toolCalls: Object) =
        s"""
        | {
        | "toolCalls":$var_toolCalls
        | }
        """.stripMargin
}
