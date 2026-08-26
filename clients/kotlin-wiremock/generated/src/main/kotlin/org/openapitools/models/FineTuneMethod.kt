@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class FineTuneMethod(
    @field:JsonProperty("type")
    val type: kotlin.String? = null,

    @field:JsonProperty("supervised")
    val supervised: FineTuneSupervisedMethod? = null,

    @field:JsonProperty("dpo")
    val dpo: FineTuneDPOMethod? = null,

)
