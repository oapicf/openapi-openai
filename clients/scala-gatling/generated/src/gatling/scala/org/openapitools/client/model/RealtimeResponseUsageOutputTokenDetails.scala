
package org.openapitools.client.model


case class RealtimeResponseUsageOutputTokenDetails (
    /* The number of text tokens used in the Response. */
    _textTokens: Option[Integer],
    /* The number of audio tokens used in the Response. */
    _audioTokens: Option[Integer]
)
object RealtimeResponseUsageOutputTokenDetails {
    def toStringBody(var_textTokens: Object, var_audioTokens: Object) =
        s"""
        | {
        | "textTokens":$var_textTokens,"audioTokens":$var_audioTokens
        | }
        """.stripMargin
}
