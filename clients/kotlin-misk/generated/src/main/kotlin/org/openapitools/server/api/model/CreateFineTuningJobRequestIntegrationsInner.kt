package org.openapitools.server.api.model

import org.openapitools.server.api.model.CreateFineTuningJobRequestIntegrationsInnerWandb
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CreateFineTuningJobRequestIntegrationsInner(
    /** The type of integration to enable. Currently, only \&quot;wandb\&quot; (Weights and Biases) is supported.  */
    val type: kotlin.String,
    val wandb: CreateFineTuningJobRequestIntegrationsInnerWandb
)
