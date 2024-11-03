
package org.openapitools.client.model


case class CreateChatCompletionRequestFunctionCall (
    /* The name of the function to call. */
    _name: String
)
object CreateChatCompletionRequestFunctionCall {
    def toStringBody(var_name: Object) =
        s"""
        | {
        | "name":$var_name
        | }
        """.stripMargin
}
