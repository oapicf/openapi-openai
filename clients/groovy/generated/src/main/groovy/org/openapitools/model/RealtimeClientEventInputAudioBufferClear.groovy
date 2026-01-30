package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class RealtimeClientEventInputAudioBufferClear {
    /* Optional client-generated ID used to identify this event. */
    String eventId

    enum TypeEnum {
    
        INPUT_AUDIO_BUFFER_CLEAR("input_audio_buffer.clear")
    
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

    /* The event type, must be `input_audio_buffer.clear`. */
    TypeEnum type
}
