
package org.openapitools.client.model


case class RunStepDetailsToolCallsObjectToolCallsInner (
    /* The ID of the tool call object. */
    _id: String,
    /* The type of tool call. This is always going to be `code_interpreter` for this type of tool call. */
    _type: String,
    _codeInterpreter: RunStepDetailsToolCallsCodeObjectCodeInterpreter,
    /* For now, this is always going to be an empty object. */
    _retrieval: Any,
    _function: RunStepDetailsToolCallsFunctionObjectFunction
)
object RunStepDetailsToolCallsObjectToolCallsInner {
    def toStringBody(var_id: Object, var_type: Object, var_codeInterpreter: Object, var_retrieval: Object, var_function: Object) =
        s"""
        | {
        | "id":$var_id,"type":$var_type,"codeInterpreter":$var_codeInterpreter,"retrieval":$var_retrieval,"function":$var_function
        | }
        """.stripMargin
}
