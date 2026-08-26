package org.openapitools.server.api.model

import org.openapitools.server.api.model.CreateFineTuningJobRequestHyperparametersBatchSize
import org.openapitools.server.api.model.CreateFineTuningJobRequestHyperparametersLearningRateMultiplier
import org.openapitools.server.api.model.CreateFineTuningJobRequestHyperparametersNEpochs
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CreateFineTuningJobRequestHyperparameters(
    val batchSize: CreateFineTuningJobRequestHyperparametersBatchSize? = null,
    val learningRateMultiplier: CreateFineTuningJobRequestHyperparametersLearningRateMultiplier? = null,
    val nEpochs: CreateFineTuningJobRequestHyperparametersNEpochs? = null
)
