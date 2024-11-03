
package org.openapitools.client.model


case class RunStepDetailsToolCallsCodeObject (
    /* The ID of the tool call. */
    _id: String,
    /* The type of tool call. This is always going to be `code_interpreter` for this type of tool call. */
    _type: String,
    _codeInterpreter: RunStepDetailsToolCallsCodeObjectCodeInterpreter
)
object RunStepDetailsToolCallsCodeObject {
    def toStringBody(var_id: Object, var_type: Object, var_codeInterpreter: Object) =
        s"""
        | {
        | "id":$var_id,"type":$var_type,"codeInterpreter":$var_codeInterpreter
        | }
        """.stripMargin
}
