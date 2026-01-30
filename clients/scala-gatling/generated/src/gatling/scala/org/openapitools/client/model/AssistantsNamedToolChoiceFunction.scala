
package org.openapitools.client.model


case class AssistantsNamedToolChoiceFunction (
    /* The name of the function to call. */
    _name: String
)
object AssistantsNamedToolChoiceFunction {
    def toStringBody(var_name: Object) =
        s"""
        | {
        | "name":$var_name
        | }
        """.stripMargin
}
