package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class FineTuneCompletionRequestInput {
    /* The input prompt for this training example. */
    String prompt
    /* The desired completion for this training example. */
    String completion
}
