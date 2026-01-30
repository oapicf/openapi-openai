package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CompletionUsageCompletionTokensDetails;
import org.openapitools.model.CompletionUsagePromptTokensDetails;

@Canonical
class CompletionUsage {
    /* Number of tokens in the generated completion. */
    Integer completionTokens
    /* Number of tokens in the prompt. */
    Integer promptTokens
    /* Total number of tokens used in the request (prompt + completion). */
    Integer totalTokens
    
    CompletionUsageCompletionTokensDetails completionTokensDetails
    
    CompletionUsagePromptTokensDetails promptTokensDetails
}
