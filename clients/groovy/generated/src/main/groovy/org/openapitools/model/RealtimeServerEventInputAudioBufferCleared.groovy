package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class RealtimeServerEventInputAudioBufferCleared {
    /* The unique ID of the server event. */
    String eventId

    enum TypeEnum {
    
        INPUT_AUDIO_BUFFER_CLEARED("input_audio_buffer.cleared")
    
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

    /* The event type, must be `input_audio_buffer.cleared`. */
    TypeEnum type
}
