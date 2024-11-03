
package org.openapitools.client.model


case class ChatCompletionStreamResponseDelta (
    /* The contents of the chunk message. */
    _content: Option[String],
    _functionCall: Option[ChatCompletionStreamResponseDeltaFunctionCall],
    _toolCalls: Option[List[ChatCompletionMessageToolCallChunk]],
    /* The role of the author of this message. */
    _role: Option[String]
)
object ChatCompletionStreamResponseDelta {
    def toStringBody(var_content: Object, var_functionCall: Object, var_toolCalls: Object, var_role: Object) =
        s"""
        | {
        | "content":$var_content,"functionCall":$var_functionCall,"toolCalls":$var_toolCalls,"role":$var_role
        | }
        """.stripMargin
}
