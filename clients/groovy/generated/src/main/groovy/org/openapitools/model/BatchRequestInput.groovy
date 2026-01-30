package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class BatchRequestInput {
    /* A developer-provided per-request id that will be used to match outputs to inputs. Must be unique for each request in a batch. */
    String customId

    enum MethodEnum {
    
        POST("POST")
    
        private final String value
    
        MethodEnum(String value) {
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

    /* The HTTP method to be used for the request. Currently only `POST` is supported. */
    MethodEnum method
    /* The OpenAI API relative URL to be used for the request. Currently `/v1/chat/completions`, `/v1/embeddings`, and `/v1/completions` are supported. */
    String url
}
