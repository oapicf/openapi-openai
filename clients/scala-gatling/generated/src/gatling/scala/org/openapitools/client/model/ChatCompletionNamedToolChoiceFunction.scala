
package org.openapitools.client.model


case class ChatCompletionNamedToolChoiceFunction (
    /* The name of the function to call. */
    _name: String
)
object ChatCompletionNamedToolChoiceFunction {
    def toStringBody(var_name: Object) =
        s"""
        | {
        | "name":$var_name
        | }
        """.stripMargin
}
