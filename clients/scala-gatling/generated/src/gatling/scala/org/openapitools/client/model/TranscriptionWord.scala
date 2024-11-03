
package org.openapitools.client.model


case class TranscriptionWord (
    /* The text content of the word. */
    _word: String,
    /* Start time of the word in seconds. */
    _start: Float,
    /* End time of the word in seconds. */
    _end: Float
)
object TranscriptionWord {
    def toStringBody(var_word: Object, var_start: Object, var_end: Object) =
        s"""
        | {
        | "word":$var_word,"start":$var_start,"end":$var_end
        | }
        """.stripMargin
}
