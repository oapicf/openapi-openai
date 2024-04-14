
package org.openapitools.client.model


case class ChatCompletionNamedToolChoice (
    /* The type of the tool. Currently, only `function` is supported. */
    _type: String,
    _function: ChatCompletionNamedToolChoiceFunction
)
object ChatCompletionNamedToolChoice {
    def toStringBody(var_type: Object, var_function: Object) =
        s"""
        | {
        | "type":$var_type,"function":$var_function
        | }
        """.stripMargin
}
