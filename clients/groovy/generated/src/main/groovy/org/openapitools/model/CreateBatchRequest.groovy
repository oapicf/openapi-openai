package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import org.openapitools.jackson.nullable.JsonNullable;

@Canonical
class CreateBatchRequest {
    /* The ID of an uploaded file that contains requests for the new batch.  See [upload file](/docs/api-reference/files/create) for how to upload a file.  Your input file must be formatted as a [JSONL file](/docs/api-reference/batch/request-input), and must be uploaded with the purpose `batch`. The file can contain up to 50,000 requests, and can be up to 200 MB in size.  */
    String inputFileId

    enum EndpointEnum {
    
        _V1_CHAT_COMPLETIONS("/v1/chat/completions"),
        
        _V1_EMBEDDINGS("/v1/embeddings"),
        
        _V1_COMPLETIONS("/v1/completions")
    
        private final String value
    
        EndpointEnum(String value) {
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

    /* The endpoint to be used for all requests in the batch. Currently `/v1/chat/completions`, `/v1/embeddings`, and `/v1/completions` are supported. Note that `/v1/embeddings` batches are also restricted to a maximum of 50,000 embedding inputs across all requests in the batch. */
    EndpointEnum endpoint

    enum CompletionWindowEnum {
    
        _24H("24h")
    
        private final String value
    
        CompletionWindowEnum(String value) {
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

    /* The time frame within which the batch should be processed. Currently only `24h` is supported. */
    CompletionWindowEnum completionWindow
    /* Optional custom metadata for the batch. */
    Map<String, String> metadata
}
