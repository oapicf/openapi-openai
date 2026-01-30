
package org.openapitools.client.model


case class ChatCompletionRequestToolMessage (
    /* The role of the messages author, in this case `tool`. */
    _role: String,
    _content: ChatCompletionRequestToolMessageContent,
    /* Tool call that this message is responding to. */
    _toolCallId: String
)
object ChatCompletionRequestToolMessage {
    def toStringBody(var_role: Object, var_content: Object, var_toolCallId: Object) =
        s"""
        | {
        | "role":$var_role,"content":$var_content,"toolCallId":$var_toolCallId
        | }
        """.stripMargin
}
