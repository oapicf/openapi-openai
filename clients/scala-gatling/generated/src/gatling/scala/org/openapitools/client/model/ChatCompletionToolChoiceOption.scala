
package org.openapitools.client.model


case class ChatCompletionToolChoiceOption (
    /* The type of the tool. Currently, only `function` is supported. */
    _type: String,
    _function: AssistantsNamedToolChoiceFunction
)
object ChatCompletionToolChoiceOption {
    def toStringBody(var_type: Object, var_function: Object) =
        s"""
        | {
        | "type":$var_type,"function":$var_function
        | }
        """.stripMargin
}
