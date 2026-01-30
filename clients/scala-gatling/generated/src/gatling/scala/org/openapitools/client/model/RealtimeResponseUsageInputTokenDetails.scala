
package org.openapitools.client.model


case class RealtimeResponseUsageInputTokenDetails (
    /* The number of cached tokens used in the Response. */
    _cachedTokens: Option[Integer],
    /* The number of text tokens used in the Response. */
    _textTokens: Option[Integer],
    /* The number of audio tokens used in the Response. */
    _audioTokens: Option[Integer]
)
object RealtimeResponseUsageInputTokenDetails {
    def toStringBody(var_cachedTokens: Object, var_textTokens: Object, var_audioTokens: Object) =
        s"""
        | {
        | "cachedTokens":$var_cachedTokens,"textTokens":$var_textTokens,"audioTokens":$var_audioTokens
        | }
        """.stripMargin
}
