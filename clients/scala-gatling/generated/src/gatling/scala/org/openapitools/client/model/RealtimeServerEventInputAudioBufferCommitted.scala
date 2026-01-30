
package org.openapitools.client.model


case class RealtimeServerEventInputAudioBufferCommitted (
    /* The unique ID of the server event. */
    _eventId: String,
    /* The event type, must be `input_audio_buffer.committed`. */
    _type: String,
    /* The ID of the preceding item after which the new item will be inserted.  */
    _previousItemId: String,
    /* The ID of the user message item that will be created. */
    _itemId: String
)
object RealtimeServerEventInputAudioBufferCommitted {
    def toStringBody(var_eventId: Object, var_type: Object, var_previousItemId: Object, var_itemId: Object) =
        s"""
        | {
        | "eventId":$var_eventId,"type":$var_type,"previousItemId":$var_previousItemId,"itemId":$var_itemId
        | }
        """.stripMargin
}
