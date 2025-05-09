/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package org.openapitools.client.models


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Metrics at the step number during the fine-tuning job.
 *
 * @param step 
 * @param trainLoss 
 * @param trainMeanTokenAccuracy 
 * @param validLoss 
 * @param validMeanTokenAccuracy 
 * @param fullValidLoss 
 * @param fullValidMeanTokenAccuracy 
 */


data class FineTuningJobCheckpointMetrics (

    @Json(name = "step")
    val step: java.math.BigDecimal? = null,

    @Json(name = "train_loss")
    val trainLoss: java.math.BigDecimal? = null,

    @Json(name = "train_mean_token_accuracy")
    val trainMeanTokenAccuracy: java.math.BigDecimal? = null,

    @Json(name = "valid_loss")
    val validLoss: java.math.BigDecimal? = null,

    @Json(name = "valid_mean_token_accuracy")
    val validMeanTokenAccuracy: java.math.BigDecimal? = null,

    @Json(name = "full_valid_loss")
    val fullValidLoss: java.math.BigDecimal? = null,

    @Json(name = "full_valid_mean_token_accuracy")
    val fullValidMeanTokenAccuracy: java.math.BigDecimal? = null

) {


}

