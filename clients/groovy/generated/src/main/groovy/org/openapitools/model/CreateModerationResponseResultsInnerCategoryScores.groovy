package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

@Canonical
class CreateModerationResponseResultsInnerCategoryScores {
    
    BigDecimal hate
    
    BigDecimal hateThreatening
    
    BigDecimal selfHarm
    
    BigDecimal sexual
    
    BigDecimal sexualMinors
    
    BigDecimal violence
    
    BigDecimal violenceGraphic
}
