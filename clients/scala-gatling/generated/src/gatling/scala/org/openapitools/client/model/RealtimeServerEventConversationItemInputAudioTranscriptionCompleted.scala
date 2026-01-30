
package org.openapitools.client.model


case class RealtimeServerEventConversationItemInputAudioTranscriptionCompleted (
    /* The unique ID of the server event. */
    _eventId: String,
    /* The event type, must be `conversation.item.input_audio_transcription.completed`.  */
    _type: String,
    /* The ID of the user message item containing the audio. */
    _itemId: String,
    /* The index of the content part containing the audio. */
    _contentIndex: Integer,
    /* The transcribed text. */
    _transcript: String
)
object RealtimeServerEventConversationItemInputAudioTranscriptionCompleted {
    def toStringBody(var_eventId: Object, var_type: Object, var_itemId: Object, var_contentIndex: Object, var_transcript: Object) =
        s"""
        | {
        | "eventId":$var_eventId,"type":$var_type,"itemId":$var_itemId,"contentIndex":$var_contentIndex,"transcript":$var_transcript
        | }
        """.stripMargin
}
