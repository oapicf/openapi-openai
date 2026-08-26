package org.openapitools.server.api.model

import org.openapitools.server.api.model.FineTuneDPOMethodHyperparametersBatchSize
import org.openapitools.server.api.model.FineTuneDPOMethodHyperparametersBeta
import org.openapitools.server.api.model.FineTuneDPOMethodHyperparametersLearningRateMultiplier
import org.openapitools.server.api.model.FineTuneDPOMethodHyperparametersNEpochs
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class FineTuneDPOMethodHyperparameters(
    val beta: FineTuneDPOMethodHyperparametersBeta? = null,
    val batchSize: FineTuneDPOMethodHyperparametersBatchSize? = null,
    val learningRateMultiplier: FineTuneDPOMethodHyperparametersLearningRateMultiplier? = null,
    val nEpochs: FineTuneDPOMethodHyperparametersNEpochs? = null
)
