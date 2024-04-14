package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CreateEmbeddingRequestInput;
import org.openapitools.model.CreateEmbeddingRequestModel;

@Canonical
class CreateEmbeddingRequest {
    
    CreateEmbeddingRequestInput input
    
    CreateEmbeddingRequestModel model

    enum EncodingFormatEnum {
    
        FLOAT("float"),
        
        BASE64("base64")
    
        private final String value
    
        EncodingFormatEnum(String value) {
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

    /* The format to return the embeddings in. Can be either `float` or [`base64`](https://pypi.org/project/pybase64/). */
    EncodingFormatEnum encodingFormat = EncodingFormatEnum.FLOAT
    /* The number of dimensions the resulting output embeddings should have. Only supported in `text-embedding-3` and later models.  */
    Integer dimensions
    /* A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  */
    String user
}
