
package org.openapitools.client.model


case class RealtimeServerEventResponseContentPartAddedPart (
    /* The content type (\"text\", \"audio\"). */
    _type: Option[String],
    /* The text content (if type is \"text\"). */
    _text: Option[String],
    /* Base64-encoded audio data (if type is \"audio\"). */
    _audio: Option[String],
    /* The transcript of the audio (if type is \"audio\"). */
    _transcript: Option[String]
)
object RealtimeServerEventResponseContentPartAddedPart {
    def toStringBody(var_type: Object, var_text: Object, var_audio: Object, var_transcript: Object) =
        s"""
        | {
        | "type":$var_type,"text":$var_text,"audio":$var_audio,"transcript":$var_transcript
        | }
        """.stripMargin
}
