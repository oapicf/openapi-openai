
package org.openapitools.client.model


case class CreateChatCompletionRequestFunctionCallOneOf (
    /* The name of the function to call. */
    _name: String
)
object CreateChatCompletionRequestFunctionCallOneOf {
    def toStringBody(var_name: Object) =
        s"""
        | {
        | "name":$var_name
        | }
        """.stripMargin
}
