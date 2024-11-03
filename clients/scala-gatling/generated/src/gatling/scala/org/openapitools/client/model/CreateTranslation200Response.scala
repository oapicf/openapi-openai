
package org.openapitools.client.model


case class CreateTranslation200Response (
    /* The translated text. */
    _text: String,
    /* The language of the output translation (always `english`). */
    _language: String,
    /* The duration of the input audio. */
    _duration: String,
    /* Segments of the translated text and their corresponding details. */
    _segments: Option[List[TranscriptionSegment]]
)
object CreateTranslation200Response {
    def toStringBody(var_text: Object, var_language: Object, var_duration: Object, var_segments: Object) =
        s"""
        | {
        | "text":$var_text,"language":$var_language,"duration":$var_duration,"segments":$var_segments
        | }
        """.stripMargin
}
