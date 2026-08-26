package org.openapitools.server.api.model

import org.openapitools.server.api.model.CreateFineTuningJobRequestIntegrationsInnerWandb
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class FineTuningIntegration(
    /** The type of the integration being enabled for the fine-tuning job */
    val type: kotlin.String,
    val wandb: CreateFineTuningJobRequestIntegrationsInnerWandb
)
