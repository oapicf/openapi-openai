package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CreateEmbeddingRequestInput;
import org.openapitools.model.CreateEmbeddingRequestModel;

@Canonical
class CreateEmbeddingRequest {
    
    CreateEmbeddingRequestModel model
    
    CreateEmbeddingRequestInput input
    /* A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  */
    String user
}
