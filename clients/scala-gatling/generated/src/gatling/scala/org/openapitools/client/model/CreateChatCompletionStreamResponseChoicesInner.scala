
package org.openapitools.client.model


case class CreateChatCompletionStreamResponseChoicesInner (
    _delta: ChatCompletionStreamResponseDelta,
    _logprobs: Option[CreateChatCompletionResponseChoicesInnerLogprobs],
    /* The reason the model stopped generating tokens. This will be `stop` if the model hit a natural stop point or a provided stop sequence, `length` if the maximum number of tokens specified in the request was reached, `content_filter` if content was omitted due to a flag from our content filters, `tool_calls` if the model called a tool, or `function_call` (deprecated) if the model called a function.  */
    _finishReason: String,
    /* The index of the choice in the list of choices. */
    _index: Integer
)
object CreateChatCompletionStreamResponseChoicesInner {
    def toStringBody(var_delta: Object, var_logprobs: Object, var_finishReason: Object, var_index: Object) =
        s"""
        | {
        | "delta":$var_delta,"logprobs":$var_logprobs,"finishReason":$var_finishReason,"index":$var_index
        | }
        """.stripMargin
}
