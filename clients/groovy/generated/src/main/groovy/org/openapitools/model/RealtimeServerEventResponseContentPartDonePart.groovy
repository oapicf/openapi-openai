package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class RealtimeServerEventResponseContentPartDonePart {

    enum TypeEnum {
    
        AUDIO("audio"),
        
        TEXT("text")
    
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

    /* The content type (\"text\", \"audio\"). */
    TypeEnum type
    /* The text content (if type is \"text\"). */
    String text
    /* Base64-encoded audio data (if type is \"audio\"). */
    String audio
    /* The transcript of the audio (if type is \"audio\"). */
    String transcript
}
