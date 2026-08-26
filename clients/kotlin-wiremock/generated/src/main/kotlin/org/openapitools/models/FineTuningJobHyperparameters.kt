@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class FineTuningJobHyperparameters(
    @field:JsonProperty("batch_size")
    val batchSize: CreateFineTuningJobRequestHyperparametersBatchSize? = null,

    @field:JsonProperty("learning_rate_multiplier")
    val learningRateMultiplier: CreateFineTuningJobRequestHyperparametersLearningRateMultiplier? = null,

    @field:JsonProperty("n_epochs")
    val nEpochs: CreateFineTuningJobRequestHyperparametersNEpochs? = null,

)
