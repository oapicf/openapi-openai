
package org.openapitools.client.model


case class RealtimeClientEventInputAudioBufferAppend (
    /* Optional client-generated ID used to identify this event. */
    _eventId: Option[String],
    /* The event type, must be `input_audio_buffer.append`. */
    _type: String,
    /* Base64-encoded audio bytes. This must be in the format specified by the  `input_audio_format` field in the session configuration.  */
    _audio: String
)
object RealtimeClientEventInputAudioBufferAppend {
    def toStringBody(var_eventId: Object, var_type: Object, var_audio: Object) =
        s"""
        | {
        | "eventId":$var_eventId,"type":$var_type,"audio":$var_audio
        | }
        """.stripMargin
}
