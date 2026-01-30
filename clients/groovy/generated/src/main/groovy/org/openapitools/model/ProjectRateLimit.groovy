package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class ProjectRateLimit {

    enum ObjectEnum {
    
        PROJECT_RATE_LIMIT("project.rate_limit")
    
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

    /* The object type, which is always `project.rate_limit` */
    ObjectEnum _object
    /* The identifier, which can be referenced in API endpoints. */
    String id
    /* The model this rate limit applies to. */
    String model
    /* The maximum requests per minute. */
    Integer maxRequestsPer1Minute
    /* The maximum tokens per minute. */
    Integer maxTokensPer1Minute
    /* The maximum images per minute. Only present for relevant models. */
    Integer maxImagesPer1Minute
    /* The maximum audio megabytes per minute. Only present for relevant models. */
    Integer maxAudioMegabytesPer1Minute
    /* The maximum requests per day. Only present for relevant models. */
    Integer maxRequestsPer1Day
    /* The maximum batch input tokens per day. Only present for relevant models. */
    Integer batch1DayMaxInputTokens
}
