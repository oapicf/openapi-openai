
package org.openapitools.client.model


case class RunObjectRequiredAction (
    /* For now, this is always `submit_tool_outputs`. */
    _type: String,
    _submitToolOutputs: RunObjectRequiredActionSubmitToolOutputs
)
object RunObjectRequiredAction {
    def toStringBody(var_type: Object, var_submitToolOutputs: Object) =
        s"""
        | {
        | "type":$var_type,"submitToolOutputs":$var_submitToolOutputs
        | }
        """.stripMargin
}
