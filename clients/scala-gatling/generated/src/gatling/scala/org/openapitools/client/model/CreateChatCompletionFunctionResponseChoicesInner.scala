
package org.openapitools.client.model


case class CreateChatCompletionFunctionResponseChoicesInner (
    /* The reason the model stopped generating tokens. This will be `stop` if the model hit a natural stop point or a provided stop sequence, `length` if the maximum number of tokens specified in the request was reached, `content_filter` if content was omitted due to a flag from our content filters, or `function_call` if the model called a function.  */
    _finishReason: String,
    /* The index of the choice in the list of choices. */
    _index: Integer,
    _message: ChatCompletionResponseMessage
)
object CreateChatCompletionFunctionResponseChoicesInner {
    def toStringBody(var_finishReason: Object, var_index: Object, var_message: Object) =
        s"""
        | {
        | "finishReason":$var_finishReason,"index":$var_index,"message":$var_message
        | }
        """.stripMargin
}
