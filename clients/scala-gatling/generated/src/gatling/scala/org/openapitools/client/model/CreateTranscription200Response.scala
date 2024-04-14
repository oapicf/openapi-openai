
package org.openapitools.client.model


case class CreateTranscription200Response (
    /* The transcribed text. */
    _text: String,
    /* The language of the input audio. */
    _language: String,
    /* The duration of the input audio. */
    _duration: String,
    /* Extracted words and their corresponding timestamps. */
    _words: Option[List[TranscriptionWord]],
    /* Segments of the transcribed text and their corresponding details. */
    _segments: Option[List[TranscriptionSegment]]
)
object CreateTranscription200Response {
    def toStringBody(var_text: Object, var_language: Object, var_duration: Object, var_words: Object, var_segments: Object) =
        s"""
        | {
        | "text":$var_text,"language":$var_language,"duration":$var_duration,"words":$var_words,"segments":$var_segments
        | }
        """.stripMargin
}
