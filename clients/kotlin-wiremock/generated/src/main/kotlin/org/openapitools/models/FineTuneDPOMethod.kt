@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class FineTuneDPOMethod(
    @field:JsonProperty("hyperparameters")
    val hyperparameters: FineTuneDPOMethodHyperparameters? = null,

)
