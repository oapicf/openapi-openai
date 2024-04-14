package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.CreateChatCompletionStreamResponseChoicesInner;

@Canonical
class CreateChatCompletionStreamResponse {
    /* A unique identifier for the chat completion. Each chunk has the same ID. */
    String id
    /* A list of chat completion choices. Can be more than one if `n` is greater than 1. */
    List<CreateChatCompletionStreamResponseChoicesInner> choices = new ArrayList<>()
    /* The Unix timestamp (in seconds) of when the chat completion was created. Each chunk has the same timestamp. */
    Integer created
    /* The model to generate the completion. */
    String model
    /* This fingerprint represents the backend configuration that the model runs with. Can be used in conjunction with the `seed` request parameter to understand when backend changes have been made that might impact determinism.  */
    String systemFingerprint

    enum ObjectEnum {
    
        CHAT_COMPLETION_CHUNK("chat.completion.chunk")
    
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

    /* The object type, which is always `chat.completion.chunk`. */
    ObjectEnum _object
}
