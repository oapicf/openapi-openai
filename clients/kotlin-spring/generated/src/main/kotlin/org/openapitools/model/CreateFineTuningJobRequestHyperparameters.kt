package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.CreateFineTuningJobRequestHyperparametersBatchSize
import org.openapitools.model.CreateFineTuningJobRequestHyperparametersLearningRateMultiplier
import org.openapitools.model.CreateFineTuningJobRequestHyperparametersNEpochs
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
 * The hyperparameters used for the fine-tuning job. This value is now deprecated in favor of `method`, and should be passed in under the `method` parameter. 
 * @param batchSize 
 * @param learningRateMultiplier 
 * @param nEpochs 
 */
data class CreateFineTuningJobRequestHyperparameters(

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("batch_size")
    @get:JsonProperty("batch_size") val batchSize: CreateFineTuningJobRequestHyperparametersBatchSize? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("learning_rate_multiplier")
    @get:JsonProperty("learning_rate_multiplier") val learningRateMultiplier: CreateFineTuningJobRequestHyperparametersLearningRateMultiplier? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("n_epochs")
    @get:JsonProperty("n_epochs") val nEpochs: CreateFineTuningJobRequestHyperparametersNEpochs? = null
) {

}

