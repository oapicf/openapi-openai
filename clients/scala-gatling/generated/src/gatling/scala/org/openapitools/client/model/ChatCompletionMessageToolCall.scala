
package org.openapitools.client.model


case class ChatCompletionMessageToolCall (
    /* The ID of the tool call. */
    _id: String,
    /* The type of the tool. Currently, only `function` is supported. */
    _type: String,
    _function: ChatCompletionMessageToolCallFunction
)
object ChatCompletionMessageToolCall {
    def toStringBody(var_id: Object, var_type: Object, var_function: Object) =
        s"""
        | {
        | "id":$var_id,"type":$var_type,"function":$var_function
        | }
        """.stripMargin
}
