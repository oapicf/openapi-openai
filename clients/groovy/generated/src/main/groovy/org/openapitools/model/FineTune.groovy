package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.FineTuneEvent;
import org.openapitools.model.OpenAIFile;

@Canonical
class FineTune {
    
    String id
    
    String _object
    
    Integer createdAt
    
    Integer updatedAt
    
    String model
    
    String fineTunedModel
    
    String organizationId
    
    String status
    
    Object hyperparams
    
    List<OpenAIFile> trainingFiles = new ArrayList<>()
    
    List<OpenAIFile> validationFiles = new ArrayList<>()
    
    List<OpenAIFile> resultFiles = new ArrayList<>()
    
    List<FineTuneEvent> events
}
