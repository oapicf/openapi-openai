@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class AssistantsApiToolChoiceOption(
    @field:JsonProperty("type")
    val type: kotlin.String,

    @field:JsonProperty("function")
    val function: AssistantsNamedToolChoiceFunction? = null,

)
