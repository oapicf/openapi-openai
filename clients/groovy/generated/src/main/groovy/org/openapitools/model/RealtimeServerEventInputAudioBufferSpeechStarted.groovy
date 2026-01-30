package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class RealtimeServerEventInputAudioBufferSpeechStarted {
    /* The unique ID of the server event. */
    String eventId

    enum TypeEnum {
    
        INPUT_AUDIO_BUFFER_SPEECH_STARTED("input_audio_buffer.speech_started")
    
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

    /* The event type, must be `input_audio_buffer.speech_started`. */
    TypeEnum type
    /* Milliseconds from the start of all audio written to the buffer during the  session when speech was first detected. This will correspond to the  beginning of audio sent to the model, and thus includes the  `prefix_padding_ms` configured in the Session.  */
    Integer audioStartMs
    /* The ID of the user message item that will be created when speech stops.  */
    String itemId
}
