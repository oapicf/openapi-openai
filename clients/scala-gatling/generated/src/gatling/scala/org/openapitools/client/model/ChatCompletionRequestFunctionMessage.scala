
package org.openapitools.client.model


case class ChatCompletionRequestFunctionMessage (
    /* The role of the messages author, in this case `function`. */
    _role: String,
    /* The contents of the function message. */
    _content: String,
    /* The name of the function to call. */
    _name: String
)
object ChatCompletionRequestFunctionMessage {
    def toStringBody(var_role: Object, var_content: Object, var_name: Object) =
        s"""
        | {
        | "role":$var_role,"content":$var_content,"name":$var_name
        | }
        """.stripMargin
}
