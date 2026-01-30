package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.RealtimeServerEventConversationItemInputAudioTranscriptionFailedError;

@Canonical
class RealtimeServerEventConversationItemInputAudioTranscriptionFailed {
    /* The unique ID of the server event. */
    String eventId

    enum TypeEnum {
    
        CONVERSATION_ITEM_INPUT_AUDIO_TRANSCRIPTION_FAILED("conversation.item.input_audio_transcription.failed")
    
        private final String value
    
        TypeEnum(String value) {
            this.value = value
        }
    
        String getValue() {
            value
        }
    
        @Override
        String toString() {
            String.valueOf(value)
        }
    }

    /* The event type, must be `conversation.item.input_audio_transcription.failed`.  */
    TypeEnum type
    /* The ID of the user message item. */
    String itemId
    /* The index of the content part containing the audio. */
    Integer contentIndex
    
    RealtimeServerEventConversationItemInputAudioTranscriptionFailedError error
}
