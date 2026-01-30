
package org.openapitools.client.model


case class CompletionUsagePromptTokensDetails (
    /* Audio input tokens present in the prompt. */
    _audioTokens: Option[Integer],
    /* Cached tokens present in the prompt. */
    _cachedTokens: Option[Integer]
)
object CompletionUsagePromptTokensDetails {
    def toStringBody(var_audioTokens: Object, var_cachedTokens: Object) =
        s"""
        | {
        | "audioTokens":$var_audioTokens,"cachedTokens":$var_cachedTokens
        | }
        """.stripMargin
}
