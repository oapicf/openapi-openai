
package org.openapitools.client.model


case class ChatCompletionResponseMessage (
    /* The role of the author of this message. */
    _role: String,
    /* The contents of the message. */
    _content: Option[String],
    _functionCall: Option[ChatCompletionRequestMessageFunctionCall]
)
object ChatCompletionResponseMessage {
    def toStringBody(var_role: Object, var_content: Object, var_functionCall: Object) =
        s"""
        | {
        | "role":$var_role,"content":$var_content,"functionCall":$var_functionCall
        | }
        """.stripMargin
}
