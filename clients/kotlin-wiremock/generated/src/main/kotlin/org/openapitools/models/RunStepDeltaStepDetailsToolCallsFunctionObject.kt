@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class RunStepDeltaStepDetailsToolCallsFunctionObject(
    @field:JsonProperty("index")
    val index: kotlin.Int,

    @field:JsonProperty("type")
    val type: kotlin.String,

    @field:JsonProperty("id")
    val id: kotlin.String? = null,

    @field:JsonProperty("function")
    val function: RunStepDeltaStepDetailsToolCallsFunctionObjectFunction? = null,

)
