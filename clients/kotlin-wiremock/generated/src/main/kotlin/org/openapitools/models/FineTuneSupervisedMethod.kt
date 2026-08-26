@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class FineTuneSupervisedMethod(
    @field:JsonProperty("hyperparameters")
    val hyperparameters: FineTuneSupervisedMethodHyperparameters? = null,

)
