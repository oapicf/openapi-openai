package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

@Canonical
class FineTuningJobCheckpointMetrics {
    
    BigDecimal step
    
    BigDecimal trainLoss
    
    BigDecimal trainMeanTokenAccuracy
    
    BigDecimal validLoss
    
    BigDecimal validMeanTokenAccuracy
    
    BigDecimal fullValidLoss
    
    BigDecimal fullValidMeanTokenAccuracy
}
