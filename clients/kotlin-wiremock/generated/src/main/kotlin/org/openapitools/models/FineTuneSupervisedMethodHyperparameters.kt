@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class FineTuneSupervisedMethodHyperparameters(
    @field:JsonProperty("batch_size")
    val batchSize: FineTuneDPOMethodHyperparametersBatchSize? = null,

    @field:JsonProperty("learning_rate_multiplier")
    val learningRateMultiplier: FineTuneDPOMethodHyperparametersLearningRateMultiplier? = null,

    @field:JsonProperty("n_epochs")
    val nEpochs: FineTuneDPOMethodHyperparametersNEpochs? = null,

)
