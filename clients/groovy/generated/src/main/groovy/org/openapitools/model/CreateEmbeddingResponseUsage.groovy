package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class CreateEmbeddingResponseUsage {
    /* The number of tokens used by the prompt. */
    Integer promptTokens
    /* The total number of tokens used by the request. */
    Integer totalTokens
}
