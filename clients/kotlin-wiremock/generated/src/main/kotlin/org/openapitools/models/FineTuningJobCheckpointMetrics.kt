@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class FineTuningJobCheckpointMetrics(
    @field:JsonProperty("step")
    val step: java.math.BigDecimal? = null,

    @field:JsonProperty("train_loss")
    val trainLoss: java.math.BigDecimal? = null,

    @field:JsonProperty("train_mean_token_accuracy")
    val trainMeanTokenAccuracy: java.math.BigDecimal? = null,

    @field:JsonProperty("valid_loss")
    val validLoss: java.math.BigDecimal? = null,

    @field:JsonProperty("valid_mean_token_accuracy")
    val validMeanTokenAccuracy: java.math.BigDecimal? = null,

    @field:JsonProperty("full_valid_loss")
    val fullValidLoss: java.math.BigDecimal? = null,

    @field:JsonProperty("full_valid_mean_token_accuracy")
    val fullValidMeanTokenAccuracy: java.math.BigDecimal? = null,

)
