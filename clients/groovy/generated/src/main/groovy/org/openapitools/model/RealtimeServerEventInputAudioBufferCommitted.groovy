package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class RealtimeServerEventInputAudioBufferCommitted {
    /* The unique ID of the server event. */
    String eventId

    enum TypeEnum {
    
        INPUT_AUDIO_BUFFER_COMMITTED("input_audio_buffer.committed")
    
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

    /* The event type, must be `input_audio_buffer.committed`. */
    TypeEnum type
    /* The ID of the preceding item after which the new item will be inserted.  */
    String previousItemId
    /* The ID of the user message item that will be created. */
    String itemId
}
