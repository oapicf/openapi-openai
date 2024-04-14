
package org.openapitools.client.model


case class RunStepCompletionUsage (
    /* Number of completion tokens used over the course of the run step. */
    _completionTokens: Integer,
    /* Number of prompt tokens used over the course of the run step. */
    _promptTokens: Integer,
    /* Total number of tokens used (prompt + completion). */
    _totalTokens: Integer
)
object RunStepCompletionUsage {
    def toStringBody(var_completionTokens: Object, var_promptTokens: Object, var_totalTokens: Object) =
        s"""
        | {
        | "completionTokens":$var_completionTokens,"promptTokens":$var_promptTokens,"totalTokens":$var_totalTokens
        | }
        """.stripMargin
}
