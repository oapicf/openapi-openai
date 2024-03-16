
package org.openapitools.client.model


case class CreateCompletionResponseUsage (
    _promptTokens: Integer,
    _completionTokens: Integer,
    _totalTokens: Integer
)
object CreateCompletionResponseUsage {
    def toStringBody(var_promptTokens: Object, var_completionTokens: Object, var_totalTokens: Object) =
        s"""
        | {
        | "promptTokens":$var_promptTokens,"completionTokens":$var_completionTokens,"totalTokens":$var_totalTokens
        | }
        """.stripMargin
}
