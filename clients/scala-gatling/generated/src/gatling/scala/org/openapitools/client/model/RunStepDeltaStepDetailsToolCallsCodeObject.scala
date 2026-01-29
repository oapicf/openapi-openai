
package org.openapitools.client.model


case class RunStepDeltaStepDetailsToolCallsCodeObject (
    /* The index of the tool call in the tool calls array. */
    _index: Integer,
    /* The ID of the tool call. */
    _id: Option[String],
    /* The type of tool call. This is always going to be `code_interpreter` for this type of tool call. */
    _type: String,
    _codeInterpreter: Option[RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter]
)
object RunStepDeltaStepDetailsToolCallsCodeObject {
    def toStringBody(var_index: Object, var_id: Object, var_type: Object, var_codeInterpreter: Object) =
        s"""
        | {
        | "index":$var_index,"id":$var_id,"type":$var_type,"codeInterpreter":$var_codeInterpreter
        | }
        """.stripMargin
}
