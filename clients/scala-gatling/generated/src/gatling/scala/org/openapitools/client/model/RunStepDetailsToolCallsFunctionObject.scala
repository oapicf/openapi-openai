
package org.openapitools.client.model


case class RunStepDetailsToolCallsFunctionObject (
    /* The ID of the tool call object. */
    _id: String,
    /* The type of tool call. This is always going to be `function` for this type of tool call. */
    _type: String,
    _function: RunStepDetailsToolCallsFunctionObjectFunction
)
object RunStepDetailsToolCallsFunctionObject {
    def toStringBody(var_id: Object, var_type: Object, var_function: Object) =
        s"""
        | {
        | "id":$var_id,"type":$var_type,"function":$var_function
        | }
        """.stripMargin
}
