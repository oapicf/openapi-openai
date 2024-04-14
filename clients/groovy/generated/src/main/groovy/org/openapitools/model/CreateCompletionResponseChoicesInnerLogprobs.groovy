package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;

@Canonical
class CreateCompletionResponseChoicesInnerLogprobs {
    
    List<Integer> textOffset
    
    List<BigDecimal> tokenLogprobs
    
    List<String> tokens
    
    List<Map<String, BigDecimal>> topLogprobs
}
