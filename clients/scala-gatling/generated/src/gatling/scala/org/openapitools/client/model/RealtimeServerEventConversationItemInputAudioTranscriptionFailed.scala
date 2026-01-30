
package org.openapitools.client.model


case class RealtimeServerEventConversationItemInputAudioTranscriptionFailed (
    /* The unique ID of the server event. */
    _eventId: String,
    /* The event type, must be `conversation.item.input_audio_transcription.failed`.  */
    _type: String,
    /* The ID of the user message item. */
    _itemId: String,
    /* The index of the content part containing the audio. */
    _contentIndex: Integer,
    _error: RealtimeServerEventConversationItemInputAudioTranscriptionFailedError
)
object RealtimeServerEventConversationItemInputAudioTranscriptionFailed {
    def toStringBody(var_eventId: Object, var_type: Object, var_itemId: Object, var_contentIndex: Object, var_error: Object) =
        s"""
        | {
        | "eventId":$var_eventId,"type":$var_type,"itemId":$var_itemId,"contentIndex":$var_contentIndex,"error":$var_error
        | }
        """.stripMargin
}
