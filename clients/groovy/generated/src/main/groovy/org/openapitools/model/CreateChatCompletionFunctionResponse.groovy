package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.CompletionUsage;
import org.openapitools.model.CreateChatCompletionFunctionResponseChoicesInner;

@Canonical
class CreateChatCompletionFunctionResponse {
    /* A unique identifier for the chat completion. */
    String id
    /* A list of chat completion choices. Can be more than one if `n` is greater than 1. */
    List<CreateChatCompletionFunctionResponseChoicesInner> choices = new ArrayList<>()
    /* The Unix timestamp (in seconds) of when the chat completion was created. */
    Integer created
    /* The model used for the chat completion. */
    String model
    /* This fingerprint represents the backend configuration that the model runs with.  Can be used in conjunction with the `seed` request parameter to understand when backend changes have been made that might impact determinism.  */
    String systemFingerprint

    enum ObjectEnum {
    
        CHAT_COMPLETION("chat.completion")
    
        private final String value
    
        ObjectEnum(String value) {
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

    /* The object type, which is always `chat.completion`. */
    ObjectEnum _object
    
    CompletionUsage usage
}
