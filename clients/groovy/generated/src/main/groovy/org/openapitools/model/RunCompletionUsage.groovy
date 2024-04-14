package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class RunCompletionUsage {
    /* Number of completion tokens used over the course of the run. */
    Integer completionTokens
    /* Number of prompt tokens used over the course of the run. */
    Integer promptTokens
    /* Total number of tokens used (prompt + completion). */
    Integer totalTokens
}
