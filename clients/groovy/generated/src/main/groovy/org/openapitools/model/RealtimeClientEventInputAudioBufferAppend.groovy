package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class RealtimeClientEventInputAudioBufferAppend {
    /* Optional client-generated ID used to identify this event. */
    String eventId

    enum TypeEnum {
    
        INPUT_AUDIO_BUFFER_APPEND("input_audio_buffer.append")
    
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

    /* The event type, must be `input_audio_buffer.append`. */
    TypeEnum type
    /* Base64-encoded audio bytes. This must be in the format specified by the  `input_audio_format` field in the session configuration.  */
    String audio
}
