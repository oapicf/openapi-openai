
package org.openapitools.client.model


case class CreateCompletionResponseChoicesInner (
    /* The reason the model stopped generating tokens. This will be `stop` if the model hit a natural stop point or a provided stop sequence, `length` if the maximum number of tokens specified in the request was reached, or `content_filter` if content was omitted due to a flag from our content filters.  */
    _finishReason: String,
    _index: Integer,
    _logprobs: CreateCompletionResponseChoicesInnerLogprobs,
    _text: String
)
object CreateCompletionResponseChoicesInner {
    def toStringBody(var_finishReason: Object, var_index: Object, var_logprobs: Object, var_text: Object) =
        s"""
        | {
        | "finishReason":$var_finishReason,"index":$var_index,"logprobs":$var_logprobs,"text":$var_text
        | }
        """.stripMargin
}
