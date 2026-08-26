@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class FineTunePreferenceRequestInput(
    @field:JsonProperty("input")
    val input: FineTunePreferenceRequestInputInput? = null,

    @field:JsonProperty("preferred_completion")
    val preferredCompletion: kotlin.collections.List<FineTunePreferenceRequestInputPreferredCompletionInner>? = null,

    @field:JsonProperty("non_preferred_completion")
    val nonPreferredCompletion: kotlin.collections.List<FineTunePreferenceRequestInputPreferredCompletionInner>? = null,

)
