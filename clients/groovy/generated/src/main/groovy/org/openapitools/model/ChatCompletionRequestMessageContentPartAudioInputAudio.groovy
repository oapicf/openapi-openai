package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class ChatCompletionRequestMessageContentPartAudioInputAudio {
    /* Base64 encoded audio data. */
    String data

    enum FormatEnum {
    
        WAV("wav"),
        
        MP3("mp3")
    
        private final String value
    
        FormatEnum(String value) {
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

    /* The format of the encoded audio data. Currently supports \"wav\" and \"mp3\".  */
    FormatEnum format
}
