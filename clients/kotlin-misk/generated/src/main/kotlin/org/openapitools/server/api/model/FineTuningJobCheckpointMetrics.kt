package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class FineTuningJobCheckpointMetrics(
    val step: java.math.BigDecimal? = null,
    val trainLoss: java.math.BigDecimal? = null,
    val trainMeanTokenAccuracy: java.math.BigDecimal? = null,
    val validLoss: java.math.BigDecimal? = null,
    val validMeanTokenAccuracy: java.math.BigDecimal? = null,
    val fullValidLoss: java.math.BigDecimal? = null,
    val fullValidMeanTokenAccuracy: java.math.BigDecimal? = null
)
