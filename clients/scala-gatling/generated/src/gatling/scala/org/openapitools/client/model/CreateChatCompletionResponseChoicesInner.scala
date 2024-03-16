
package org.openapitools.client.model


case class CreateChatCompletionResponseChoicesInner (
    _index: Option[Integer],
    _message: Option[ChatCompletionResponseMessage],
    _finishReason: Option[String]
)
object CreateChatCompletionResponseChoicesInner {
    def toStringBody(var_index: Object, var_message: Object, var_finishReason: Object) =
        s"""
        | {
        | "index":$var_index,"message":$var_message,"finishReason":$var_finishReason
        | }
        """.stripMargin
}
