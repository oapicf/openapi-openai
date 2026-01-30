package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class CompletionUsagePromptTokensDetails {
    /* Audio input tokens present in the prompt. */
    Integer audioTokens
    /* Cached tokens present in the prompt. */
    Integer cachedTokens
}
