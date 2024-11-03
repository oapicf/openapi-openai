package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CreateFineTuningJobRequestIntegrationsInnerType;
import org.openapitools.model.CreateFineTuningJobRequestIntegrationsInnerWandb;

@Canonical
class CreateFineTuningJobRequestIntegrationsInner {
    
    CreateFineTuningJobRequestIntegrationsInnerType type
    
    CreateFineTuningJobRequestIntegrationsInnerWandb wandb
}
