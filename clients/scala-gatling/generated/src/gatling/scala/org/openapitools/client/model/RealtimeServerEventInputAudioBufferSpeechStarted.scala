
package org.openapitools.client.model


case class RealtimeServerEventInputAudioBufferSpeechStarted (
    /* The unique ID of the server event. */
    _eventId: String,
    /* The event type, must be `input_audio_buffer.speech_started`. */
    _type: String,
    /* Milliseconds from the start of all audio written to the buffer during the  session when speech was first detected. This will correspond to the  beginning of audio sent to the model, and thus includes the  `prefix_padding_ms` configured in the Session.  */
    _audioStartMs: Integer,
    /* The ID of the user message item that will be created when speech stops.  */
    _itemId: String
)
object RealtimeServerEventInputAudioBufferSpeechStarted {
    def toStringBody(var_eventId: Object, var_type: Object, var_audioStartMs: Object, var_itemId: Object) =
        s"""
        | {
        | "eventId":$var_eventId,"type":$var_type,"audioStartMs":$var_audioStartMs,"itemId":$var_itemId
        | }
        """.stripMargin
}
