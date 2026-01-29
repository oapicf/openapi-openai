package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.ChatCompletionTokenLogprobTopLogprobsInner;

@Canonical
class ChatCompletionTokenLogprob {
    /* The token. */
    String token
    /* The log probability of this token, if it is within the top 20 most likely tokens. Otherwise, the value `-9999.0` is used to signify that the token is very unlikely. */
    BigDecimal logprob
    /* A list of integers representing the UTF-8 bytes representation of the token. Useful in instances where characters are represented by multiple tokens and their byte representations must be combined to generate the correct text representation. Can be `null` if there is no bytes representation for the token. */
    List<Integer> bytes
    /* List of the most likely tokens and their log probability, at this token position. In rare cases, there may be fewer than the number of requested `top_logprobs` returned. */
    List<ChatCompletionTokenLogprobTopLogprobsInner> topLogprobs = new ArrayList<>()
}
