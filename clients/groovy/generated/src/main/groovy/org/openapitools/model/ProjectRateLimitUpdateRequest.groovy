package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class ProjectRateLimitUpdateRequest {
    /* The maximum requests per minute. */
    Integer maxRequestsPer1Minute
    /* The maximum tokens per minute. */
    Integer maxTokensPer1Minute
    /* The maximum images per minute. Only relevant for certain models. */
    Integer maxImagesPer1Minute
    /* The maximum audio megabytes per minute. Only relevant for certain models. */
    Integer maxAudioMegabytesPer1Minute
    /* The maximum requests per day. Only relevant for certain models. */
    Integer maxRequestsPer1Day
    /* The maximum batch input tokens per day. Only relevant for certain models. */
    Integer batch1DayMaxInputTokens
}
