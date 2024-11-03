
package org.openapitools.client.model


case class RunToolCallObject (
    /* The ID of the tool call. This ID must be referenced when you submit the tool outputs in using the [Submit tool outputs to run](/docs/api-reference/runs/submitToolOutputs) endpoint. */
    _id: String,
    /* The type of tool call the output is required for. For now, this is always `function`. */
    _type: String,
    _function: RunToolCallObjectFunction
)
object RunToolCallObject {
    def toStringBody(var_id: Object, var_type: Object, var_function: Object) =
        s"""
        | {
        | "id":$var_id,"type":$var_type,"function":$var_function
        | }
        """.stripMargin
}
