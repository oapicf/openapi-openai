package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.FineTuneDPOMethodHyperparametersBatchSize
import org.openapitools.model.FineTuneDPOMethodHyperparametersLearningRateMultiplier
import org.openapitools.model.FineTuneDPOMethodHyperparametersNEpochs
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid
import io.swagger.v3.oas.annotations.media.Schema

/**
 * The hyperparameters used for the fine-tuning job.
 * @param batchSize 
 * @param learningRateMultiplier 
 * @param nEpochs 
 */
data class FineTuneSupervisedMethodHyperparameters(

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("batch_size") val batchSize: FineTuneDPOMethodHyperparametersBatchSize? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("learning_rate_multiplier") val learningRateMultiplier: FineTuneDPOMethodHyperparametersLearningRateMultiplier? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("n_epochs") val nEpochs: FineTuneDPOMethodHyperparametersNEpochs? = null
) {

}

