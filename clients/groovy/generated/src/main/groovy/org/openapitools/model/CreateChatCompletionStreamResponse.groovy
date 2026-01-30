package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CreateChatCompletionStreamResponseChoicesInner;
import org.openapitools.model.CreateChatCompletionStreamResponseUsage;

@Canonical
class CreateChatCompletionStreamResponse {
    /* A unique identifier for the chat completion. Each chunk has the same ID. */
    String id
    /* A list of chat completion choices. Can contain more than one elements if `n` is greater than 1. Can also be empty for the last chunk if you set `stream_options: {\"include_usage\": true}`.  */
    List<CreateChatCompletionStreamResponseChoicesInner> choices = new ArrayList<>()
    /* The Unix timestamp (in seconds) of when the chat completion was created. Each chunk has the same timestamp. */
    Integer created
    /* The model to generate the completion. */
    String model

    enum ServiceTierEnum {
    
        SCALE("scale"),
        
        DEFAULT("default")
    
        private final String value
    
        ServiceTierEnum(String value) {
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

    /* The service tier used for processing the request. This field is only included if the `service_tier` parameter is specified in the request. */
    ServiceTierEnum serviceTier
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
    
    CreateChatCompletionStreamResponseUsage usage
}
