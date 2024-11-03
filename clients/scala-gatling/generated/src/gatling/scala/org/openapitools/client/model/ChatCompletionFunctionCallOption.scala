
package org.openapitools.client.model


case class ChatCompletionFunctionCallOption (
    /* The name of the function to call. */
    _name: String
)
object ChatCompletionFunctionCallOption {
    def toStringBody(var_name: Object) =
        s"""
        | {
        | "name":$var_name
        | }
        """.stripMargin
}
