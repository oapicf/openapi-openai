
package org.openapitools.client.model


case class CreateTranslationResponseVerboseJson (
    /* The language of the output translation (always `english`). */
    _language: String,
    /* The duration of the input audio. */
    _duration: String,
    /* The translated text. */
    _text: String,
    /* Segments of the translated text and their corresponding details. */
    _segments: Option[List[TranscriptionSegment]]
)
object CreateTranslationResponseVerboseJson {
    def toStringBody(var_language: Object, var_duration: Object, var_text: Object, var_segments: Object) =
        s"""
        | {
        | "language":$var_language,"duration":$var_duration,"text":$var_text,"segments":$var_segments
        | }
        """.stripMargin
}
