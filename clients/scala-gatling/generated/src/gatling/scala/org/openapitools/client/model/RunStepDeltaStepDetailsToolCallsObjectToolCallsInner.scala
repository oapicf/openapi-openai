
package org.openapitools.client.model


case class RunStepDeltaStepDetailsToolCallsObjectToolCallsInner (
    /* The index of the tool call in the tool calls array. */
    _index: Integer,
    /* The ID of the tool call object. */
    _id: Option[String],
    /* The type of tool call. This is always going to be `code_interpreter` for this type of tool call. */
    _type: String,
    _codeInterpreter: Option[RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter],
    /* For now, this is always going to be an empty object. */
    _retrieval: Option[Any],
    _function: Option[RunStepDeltaStepDetailsToolCallsFunctionObjectFunction]
)
object RunStepDeltaStepDetailsToolCallsObjectToolCallsInner {
    def toStringBody(var_index: Object, var_id: Object, var_type: Object, var_codeInterpreter: Object, var_retrieval: Object, var_function: Object) =
        s"""
        | {
        | "index":$var_index,"id":$var_id,"type":$var_type,"codeInterpreter":$var_codeInterpreter,"retrieval":$var_retrieval,"function":$var_function
        | }
        """.stripMargin
}
