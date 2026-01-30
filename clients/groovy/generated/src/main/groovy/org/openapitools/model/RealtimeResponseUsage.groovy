package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.RealtimeResponseUsageInputTokenDetails;
import org.openapitools.model.RealtimeResponseUsageOutputTokenDetails;

@Canonical
class RealtimeResponseUsage {
    /* The total number of tokens in the Response including input and output  text and audio tokens.  */
    Integer totalTokens
    /* The number of input tokens used in the Response, including text and  audio tokens.  */
    Integer inputTokens
    /* The number of output tokens sent in the Response, including text and  audio tokens.  */
    Integer outputTokens
    
    RealtimeResponseUsageInputTokenDetails inputTokenDetails
    
    RealtimeResponseUsageOutputTokenDetails outputTokenDetails
}
