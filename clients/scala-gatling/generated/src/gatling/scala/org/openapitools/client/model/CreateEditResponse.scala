
package org.openapitools.client.model


case class CreateEditResponse (
    _object: String,
    _created: Integer,
    _choices: List[CreateEditResponseChoicesInner],
    _usage: CreateCompletionResponseUsage
)
object CreateEditResponse {
    def toStringBody(var_object: Object, var_created: Object, var_choices: Object, var_usage: Object) =
        s"""
        | {
        | "object":$var_object,"created":$var_created,"choices":$var_choices,"usage":$var_usage
        | }
        """.stripMargin
}
