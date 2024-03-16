
package org.openapitools.client.model


case class CreateCompletionResponseChoicesInner (
    _text: String,
    _index: Integer,
    _logprobs: CreateCompletionResponseChoicesInnerLogprobs,
    _finishReason: String
)
object CreateCompletionResponseChoicesInner {
    def toStringBody(var_text: Object, var_index: Object, var_logprobs: Object, var_finishReason: Object) =
        s"""
        | {
        | "text":$var_text,"index":$var_index,"logprobs":$var_logprobs,"finishReason":$var_finishReason
        | }
        """.stripMargin
}
