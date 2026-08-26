@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class FineTuningIntegration(
    @field:JsonProperty("type")
    val type: kotlin.String,

    @field:JsonProperty("wandb")
    val wandb: CreateFineTuningJobRequestIntegrationsInnerWandb,

)
