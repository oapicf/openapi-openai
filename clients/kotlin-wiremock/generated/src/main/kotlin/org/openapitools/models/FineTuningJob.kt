@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class FineTuningJob(
    @field:JsonProperty("id")
    val id: kotlin.String,

    @field:JsonProperty("created_at")
    val createdAt: kotlin.Int,

    @field:JsonProperty("error")
    val error: FineTuningJobError,

    @field:JsonProperty("fine_tuned_model")
    val fineTunedModel: kotlin.String,

    @field:JsonProperty("finished_at")
    val finishedAt: kotlin.Int,

    @field:JsonProperty("hyperparameters")
    val hyperparameters: FineTuningJobHyperparameters,

    @field:JsonProperty("model")
    val model: kotlin.String,

    @field:JsonProperty("object")
    val `object`: kotlin.String,

    @field:JsonProperty("organization_id")
    val organizationId: kotlin.String,

    @field:JsonProperty("result_files")
    val resultFiles: kotlin.collections.List<kotlin.String>,

    @field:JsonProperty("status")
    val status: kotlin.String,

    @field:JsonProperty("trained_tokens")
    val trainedTokens: kotlin.Int,

    @field:JsonProperty("training_file")
    val trainingFile: kotlin.String,

    @field:JsonProperty("validation_file")
    val validationFile: kotlin.String,

    @field:JsonProperty("seed")
    val seed: kotlin.Int,

    @field:JsonProperty("integrations")
    val integrations: kotlin.collections.List<FineTuningJobIntegrationsInner>? = null,

    @field:JsonProperty("estimated_finish")
    val estimatedFinish: kotlin.Int? = null,

    @field:JsonProperty("method")
    val method: FineTuneMethod? = null,

)
