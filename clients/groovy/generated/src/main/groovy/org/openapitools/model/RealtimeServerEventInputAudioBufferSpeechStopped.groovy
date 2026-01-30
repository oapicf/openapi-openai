package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class RealtimeServerEventInputAudioBufferSpeechStopped {
    /* The unique ID of the server event. */
    String eventId

    enum TypeEnum {
    
        INPUT_AUDIO_BUFFER_SPEECH_STOPPED("input_audio_buffer.speech_stopped")
    
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

    /* The event type, must be `input_audio_buffer.speech_stopped`. */
    TypeEnum type
    /* Milliseconds since the session started when speech stopped. This will  correspond to the end of audio sent to the model, and thus includes the  `min_silence_duration_ms` configured in the Session.  */
    Integer audioEndMs
    /* The ID of the user message item that will be created. */
    String itemId
}
