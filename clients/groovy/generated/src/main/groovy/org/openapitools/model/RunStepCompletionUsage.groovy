package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class RunStepCompletionUsage {
    /* Number of completion tokens used over the course of the run step. */
    Integer completionTokens
    /* Number of prompt tokens used over the course of the run step. */
    Integer promptTokens
    /* Total number of tokens used (prompt + completion). */
    Integer totalTokens
}
