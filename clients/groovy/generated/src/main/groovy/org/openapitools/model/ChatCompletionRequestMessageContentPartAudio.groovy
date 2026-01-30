package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ChatCompletionRequestMessageContentPartAudioInputAudio;

@Canonical
class ChatCompletionRequestMessageContentPartAudio {

    enum TypeEnum {
    
        INPUT_AUDIO("input_audio")
    
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

    /* The type of the content part. Always `input_audio`. */
    TypeEnum type
    
    ChatCompletionRequestMessageContentPartAudioInputAudio inputAudio
}
