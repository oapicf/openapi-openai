
package org.openapitools.client.model


case class CreateTranscriptionResponseVerboseJson (
    /* The language of the input audio. */
    _language: String,
    /* The duration of the input audio. */
    _duration: String,
    /* The transcribed text. */
    _text: String,
    /* Extracted words and their corresponding timestamps. */
    _words: Option[List[TranscriptionWord]],
    /* Segments of the transcribed text and their corresponding details. */
    _segments: Option[List[TranscriptionSegment]]
)
object CreateTranscriptionResponseVerboseJson {
    def toStringBody(var_language: Object, var_duration: Object, var_text: Object, var_words: Object, var_segments: Object) =
        s"""
        | {
        | "language":$var_language,"duration":$var_duration,"text":$var_text,"words":$var_words,"segments":$var_segments
        | }
        """.stripMargin
}
