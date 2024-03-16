
package org.openapitools.client.model


case class CreateEditResponseChoicesInner (
    _text: Option[String],
    _index: Option[Integer],
    _logprobs: Option[CreateCompletionResponseChoicesInnerLogprobs],
    _finishReason: Option[String]
)
object CreateEditResponseChoicesInner {
    def toStringBody(var_text: Object, var_index: Object, var_logprobs: Object, var_finishReason: Object) =
        s"""
        | {
        | "text":$var_text,"index":$var_index,"logprobs":$var_logprobs,"finishReason":$var_finishReason
        | }
        """.stripMargin
}
