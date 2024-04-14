package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ChatCompletionFunctionCallOption;

@Canonical
class CreateChatCompletionRequestFunctionCall {
    /* The name of the function to call. */
    String name
}
