
package org.openapitools.client.model


case class RunCompletionUsage (
    /* Number of completion tokens used over the course of the run. */
    _completionTokens: Integer,
    /* Number of prompt tokens used over the course of the run. */
    _promptTokens: Integer,
    /* Total number of tokens used (prompt + completion). */
    _totalTokens: Integer
)
object RunCompletionUsage {
    def toStringBody(var_completionTokens: Object, var_promptTokens: Object, var_totalTokens: Object) =
        s"""
        | {
        | "completionTokens":$var_completionTokens,"promptTokens":$var_promptTokens,"totalTokens":$var_totalTokens
        | }
        """.stripMargin
}
