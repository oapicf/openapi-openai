package org.openapitools.server.api.model

import org.openapitools.server.api.model.FineTuneSupervisedMethodHyperparameters
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class FineTuneSupervisedMethod(
    val hyperparameters: FineTuneSupervisedMethodHyperparameters? = null
)
