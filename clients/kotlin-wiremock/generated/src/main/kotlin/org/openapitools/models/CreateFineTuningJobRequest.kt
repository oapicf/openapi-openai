@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CreateFineTuningJobRequest(
    @field:JsonProperty("model")
    val model: CreateFineTuningJobRequestModel,

    @field:JsonProperty("training_file")
    val trainingFile: kotlin.String,

    @field:JsonProperty("hyperparameters")
    val hyperparameters: CreateFineTuningJobRequestHyperparameters? = null,

    @field:JsonProperty("suffix")
    val suffix: kotlin.String? = null,

    @field:JsonProperty("validation_file")
    val validationFile: kotlin.String? = null,

    @field:JsonProperty("integrations")
    val integrations: kotlin.collections.List<CreateFineTuningJobRequestIntegrationsInner>? = null,

    @field:JsonProperty("seed")
    val seed: kotlin.Int? = null,

    @field:JsonProperty("method")
    val method: FineTuneMethod? = null,

)
