
package org.openapitools.client.model


case class CreateChatCompletionStreamResponseUsage (
    /* Number of tokens in the generated completion. */
    _completionTokens: Integer,
    /* Number of tokens in the prompt. */
    _promptTokens: Integer,
    /* Total number of tokens used in the request (prompt + completion). */
    _totalTokens: Integer
)
object CreateChatCompletionStreamResponseUsage {
    def toStringBody(var_completionTokens: Object, var_promptTokens: Object, var_totalTokens: Object) =
        s"""
        | {
        | "completionTokens":$var_completionTokens,"promptTokens":$var_promptTokens,"totalTokens":$var_totalTokens
        | }
        """.stripMargin
}
