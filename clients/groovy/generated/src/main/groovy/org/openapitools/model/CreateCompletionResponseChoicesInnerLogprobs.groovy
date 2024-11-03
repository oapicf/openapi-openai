package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;

@Canonical
class CreateCompletionResponseChoicesInnerLogprobs {
    
    List<Integer> textOffset = new ArrayList<>()
    
    List<BigDecimal> tokenLogprobs = new ArrayList<>()
    
    List<String> tokens = new ArrayList<>()
    
    List<Map<String, BigDecimal>> topLogprobs = new ArrayList<>()
}
