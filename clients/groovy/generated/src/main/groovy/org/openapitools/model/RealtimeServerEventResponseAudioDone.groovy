package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class RealtimeServerEventResponseAudioDone {
    /* The unique ID of the server event. */
    String eventId

    enum TypeEnum {
    
        RESPONSE_AUDIO_DONE("response.audio.done")
    
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

    /* The event type, must be `response.audio.done`. */
    TypeEnum type
    /* The ID of the response. */
    String responseId
    /* The ID of the item. */
    String itemId
    /* The index of the output item in the response. */
    Integer outputIndex
    /* The index of the content part in the item's content array. */
    Integer contentIndex
}
