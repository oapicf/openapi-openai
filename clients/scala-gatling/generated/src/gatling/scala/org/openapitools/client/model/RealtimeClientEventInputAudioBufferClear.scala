
package org.openapitools.client.model


case class RealtimeClientEventInputAudioBufferClear (
    /* Optional client-generated ID used to identify this event. */
    _eventId: Option[String],
    /* The event type, must be `input_audio_buffer.clear`. */
    _type: String
)
object RealtimeClientEventInputAudioBufferClear {
    def toStringBody(var_eventId: Object, var_type: Object) =
        s"""
        | {
        | "eventId":$var_eventId,"type":$var_type
        | }
        """.stripMargin
}
