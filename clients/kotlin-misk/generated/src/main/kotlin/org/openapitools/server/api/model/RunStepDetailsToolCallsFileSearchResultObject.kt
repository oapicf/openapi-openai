package org.openapitools.server.api.model

import org.openapitools.server.api.model.RunStepDetailsToolCallsFileSearchResultObjectContentInner
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class RunStepDetailsToolCallsFileSearchResultObject(
    /** The ID of the file that result was found in. */
    val fileId: kotlin.String,
    /** The name of the file that result was found in. */
    val fileName: kotlin.String,
    /** The score of the result. All values must be a floating point number between 0 and 1. */
    val score: java.math.BigDecimal,
    /** The content of the result that was found. The content is only included if requested via the include query parameter. */
    val content: kotlin.collections.List<RunStepDetailsToolCallsFileSearchResultObjectContentInner>? = null
)
