package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CreateFineTuningJobRequestHyperparametersBatchSize;
import org.openapitools.model.CreateFineTuningJobRequestHyperparametersLearningRateMultiplier;
import org.openapitools.model.CreateFineTuningJobRequestHyperparametersNEpochs;

@Canonical
class CreateFineTuningJobRequestHyperparameters {
    
    CreateFineTuningJobRequestHyperparametersBatchSize batchSize = auto
    
    CreateFineTuningJobRequestHyperparametersLearningRateMultiplier learningRateMultiplier = auto
    
    CreateFineTuningJobRequestHyperparametersNEpochs nEpochs = auto
}
