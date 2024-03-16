
package org.openapitools.client.model


case class ChatCompletionRequestMessage (
    /* The role of the messages author. One of `system`, `user`, `assistant`, or `function`. */
    _role: String,
    /* The contents of the message. `content` is required for all messages except assistant messages with function calls. */
    _content: Option[String],
    /* The name of the author of this message. `name` is required if role is `function`, and it should be the name of the function whose response is in the `content`. May contain a-z, A-Z, 0-9, and underscores, with a maximum length of 64 characters. */
    _name: Option[String],
    _functionCall: Option[ChatCompletionRequestMessageFunctionCall]
)
object ChatCompletionRequestMessage {
    def toStringBody(var_role: Object, var_content: Object, var_name: Object, var_functionCall: Object) =
        s"""
        | {
        | "role":$var_role,"content":$var_content,"name":$var_name,"functionCall":$var_functionCall
        | }
        """.stripMargin
}
