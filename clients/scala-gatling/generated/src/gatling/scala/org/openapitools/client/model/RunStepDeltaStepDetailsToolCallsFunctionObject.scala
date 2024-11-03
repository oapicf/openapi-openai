
package org.openapitools.client.model


case class RunStepDeltaStepDetailsToolCallsFunctionObject (
    /* The index of the tool call in the tool calls array. */
    _index: Integer,
    /* The ID of the tool call object. */
    _id: Option[String],
    /* The type of tool call. This is always going to be `function` for this type of tool call. */
    _type: String,
    _function: Option[RunStepDeltaStepDetailsToolCallsFunctionObjectFunction]
)
object RunStepDeltaStepDetailsToolCallsFunctionObject {
    def toStringBody(var_index: Object, var_id: Object, var_type: Object, var_function: Object) =
        s"""
        | {
        | "index":$var_index,"id":$var_id,"type":$var_type,"function":$var_function
        | }
        """.stripMargin
}
