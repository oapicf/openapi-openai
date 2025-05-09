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

import org.openapitools.client.models.FineTuningJobHyperparametersNEpochs

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The hyperparameters used for the fine-tuning job. See the [fine-tuning guide](/docs/guides/fine-tuning) for more details.
 *
 * @param nEpochs 
 */


data class FineTuningJobHyperparameters (

    @Json(name = "n_epochs")
    val nEpochs: FineTuningJobHyperparametersNEpochs

) {


}

