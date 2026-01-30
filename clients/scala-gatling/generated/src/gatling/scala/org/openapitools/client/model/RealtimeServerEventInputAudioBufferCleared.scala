
package org.openapitools.client.model


case class RealtimeServerEventInputAudioBufferCleared (
    /* The unique ID of the server event. */
    _eventId: String,
    /* The event type, must be `input_audio_buffer.cleared`. */
    _type: String
)
object RealtimeServerEventInputAudioBufferCleared {
    def toStringBody(var_eventId: Object, var_type: Object) =
        s"""
        | {
        | "eventId":$var_eventId,"type":$var_type
        | }
        """.stripMargin
}
