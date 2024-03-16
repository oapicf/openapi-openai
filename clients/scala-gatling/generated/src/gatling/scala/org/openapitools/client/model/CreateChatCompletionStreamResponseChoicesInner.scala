
package org.openapitools.client.model


case class CreateChatCompletionStreamResponseChoicesInner (
    _index: Option[Integer],
    _delta: Option[ChatCompletionStreamResponseDelta],
    _finishReason: Option[String]
)
object CreateChatCompletionStreamResponseChoicesInner {
    def toStringBody(var_index: Object, var_delta: Object, var_finishReason: Object) =
        s"""
        | {
        | "index":$var_index,"delta":$var_delta,"finishReason":$var_finishReason
        | }
        """.stripMargin
}
