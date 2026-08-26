package org.openapitools.server.api.model

import org.openapitools.server.api.model.FineTunePreferenceRequestInputInput
import org.openapitools.server.api.model.FineTunePreferenceRequestInputPreferredCompletionInner
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class FineTunePreferenceRequestInput(
    val input: FineTunePreferenceRequestInputInput? = null,
    /** The preferred completion message for the output. */
    val preferredCompletion: kotlin.collections.List<FineTunePreferenceRequestInputPreferredCompletionInner>? = null,
    /** The non-preferred completion message for the output. */
    val nonPreferredCompletion: kotlin.collections.List<FineTunePreferenceRequestInputPreferredCompletionInner>? = null
)
