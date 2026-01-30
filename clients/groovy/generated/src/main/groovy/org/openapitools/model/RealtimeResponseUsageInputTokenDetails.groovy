package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class RealtimeResponseUsageInputTokenDetails {
    /* The number of cached tokens used in the Response. */
    Integer cachedTokens
    /* The number of text tokens used in the Response. */
    Integer textTokens
    /* The number of audio tokens used in the Response. */
    Integer audioTokens
}
