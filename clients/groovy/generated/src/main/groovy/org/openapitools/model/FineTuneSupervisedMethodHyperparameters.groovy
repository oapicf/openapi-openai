package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.FineTuneDPOMethodHyperparametersBatchSize;
import org.openapitools.model.FineTuneDPOMethodHyperparametersLearningRateMultiplier;
import org.openapitools.model.FineTuneDPOMethodHyperparametersNEpochs;

@Canonical
class FineTuneSupervisedMethodHyperparameters {
    
    FineTuneDPOMethodHyperparametersBatchSize batchSize = auto
    
    FineTuneDPOMethodHyperparametersLearningRateMultiplier learningRateMultiplier = auto
    
    FineTuneDPOMethodHyperparametersNEpochs nEpochs = auto
}
