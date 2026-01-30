
package org.openapitools.client.model


case class RealtimeServerEventInputAudioBufferSpeechStopped (
    /* The unique ID of the server event. */
    _eventId: String,
    /* The event type, must be `input_audio_buffer.speech_stopped`. */
    _type: String,
    /* Milliseconds since the session started when speech stopped. This will  correspond to the end of audio sent to the model, and thus includes the  `min_silence_duration_ms` configured in the Session.  */
    _audioEndMs: Integer,
    /* The ID of the user message item that will be created. */
    _itemId: String
)
object RealtimeServerEventInputAudioBufferSpeechStopped {
    def toStringBody(var_eventId: Object, var_type: Object, var_audioEndMs: Object, var_itemId: Object) =
        s"""
        | {
        | "eventId":$var_eventId,"type":$var_type,"audioEndMs":$var_audioEndMs,"itemId":$var_itemId
        | }
        """.stripMargin
}
