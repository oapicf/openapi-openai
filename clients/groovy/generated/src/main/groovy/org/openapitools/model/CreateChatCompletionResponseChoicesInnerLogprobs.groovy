package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.ChatCompletionTokenLogprob;

@Canonical
class CreateChatCompletionResponseChoicesInnerLogprobs {
    /* A list of message content tokens with log probability information. */
    List<ChatCompletionTokenLogprob> content
}
