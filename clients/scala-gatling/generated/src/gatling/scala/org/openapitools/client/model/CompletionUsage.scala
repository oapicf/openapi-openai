
package org.openapitools.client.model


case class CompletionUsage (
    /* Number of tokens in the generated completion. */
    _completionTokens: Integer,
    /* Number of tokens in the prompt. */
    _promptTokens: Integer,
    /* Total number of tokens used in the request (prompt + completion). */
    _totalTokens: Integer,
    _completionTokensDetails: Option[CompletionUsageCompletionTokensDetails],
    _promptTokensDetails: Option[CompletionUsagePromptTokensDetails]
)
object CompletionUsage {
    def toStringBody(var_completionTokens: Object, var_promptTokens: Object, var_totalTokens: Object, var_completionTokensDetails: Object, var_promptTokensDetails: Object) =
        s"""
        | {
        | "completionTokens":$var_completionTokens,"promptTokens":$var_promptTokens,"totalTokens":$var_totalTokens,"completionTokensDetails":$var_completionTokensDetails,"promptTokensDetails":$var_promptTokensDetails
        | }
        """.stripMargin
}
