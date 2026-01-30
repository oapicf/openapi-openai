
package org.openapitools.client.model


case class AssistantsApiToolChoiceOption (
    /* The type of the tool. If type is `function`, the function name must be set */
    _type: String,
    _function: Option[AssistantsNamedToolChoiceFunction]
)
object AssistantsApiToolChoiceOption {
    def toStringBody(var_type: Object, var_function: Object) =
        s"""
        | {
        | "type":$var_type,"function":$var_function
        | }
        """.stripMargin
}
