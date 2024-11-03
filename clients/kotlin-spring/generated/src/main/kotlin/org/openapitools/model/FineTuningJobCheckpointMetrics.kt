package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
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
 * Metrics at the step number during the fine-tuning job.
 * @param step 
 * @param trainLoss 
 * @param trainMeanTokenAccuracy 
 * @param validLoss 
 * @param validMeanTokenAccuracy 
 * @param fullValidLoss 
 * @param fullValidMeanTokenAccuracy 
 */
data class FineTuningJobCheckpointMetrics(

    @Schema(example = "null", description = "")
    @get:JsonProperty("step") val step: java.math.BigDecimal? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("train_loss") val trainLoss: java.math.BigDecimal? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("train_mean_token_accuracy") val trainMeanTokenAccuracy: java.math.BigDecimal? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("valid_loss") val validLoss: java.math.BigDecimal? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("valid_mean_token_accuracy") val validMeanTokenAccuracy: java.math.BigDecimal? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("full_valid_loss") val fullValidLoss: java.math.BigDecimal? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("full_valid_mean_token_accuracy") val fullValidMeanTokenAccuracy: java.math.BigDecimal? = null
    ) {

}

