
package org.openapitools.client.model


case class ChatCompletionResponseMessage (
    /* The contents of the message. */
    _content: String,
    /* The tool calls generated by the model, such as function calls. */
    _toolCalls: Option[List[ChatCompletionMessageToolCall]],
    /* The role of the author of this message. */
    _role: String,
    _functionCall: Option[ChatCompletionRequestAssistantMessageFunctionCall]
)
object ChatCompletionResponseMessage {
    def toStringBody(var_content: Object, var_toolCalls: Object, var_role: Object, var_functionCall: Object) =
        s"""
        | {
        | "content":$var_content,"toolCalls":$var_toolCalls,"role":$var_role,"functionCall":$var_functionCall
        | }
        """.stripMargin
}
