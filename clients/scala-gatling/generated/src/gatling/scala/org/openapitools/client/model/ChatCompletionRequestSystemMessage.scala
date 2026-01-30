
package org.openapitools.client.model


case class ChatCompletionRequestSystemMessage (
    _content: ChatCompletionRequestSystemMessageContent,
    /* The role of the messages author, in this case `system`. */
    _role: String,
    /* An optional name for the participant. Provides the model information to differentiate between participants of the same role. */
    _name: Option[String]
)
object ChatCompletionRequestSystemMessage {
    def toStringBody(var_content: Object, var_role: Object, var_name: Object) =
        s"""
        | {
        | "content":$var_content,"role":$var_role,"name":$var_name
        | }
        """.stripMargin
}
