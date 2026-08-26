package org.openapitools.server.api.model

import org.openapitools.server.api.model.FineTuneDPOMethodHyperparameters
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class FineTuneDPOMethod(
    val hyperparameters: FineTuneDPOMethodHyperparameters? = null
)
