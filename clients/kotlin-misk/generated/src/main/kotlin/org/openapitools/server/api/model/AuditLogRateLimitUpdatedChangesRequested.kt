package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AuditLogRateLimitUpdatedChangesRequested(
    /** The maximum requests per minute. */
    val maxRequestsPer1Minute: kotlin.Int? = null,
    /** The maximum tokens per minute. */
    val maxTokensPer1Minute: kotlin.Int? = null,
    /** The maximum images per minute. Only relevant for certain models. */
    val maxImagesPer1Minute: kotlin.Int? = null,
    /** The maximum audio megabytes per minute. Only relevant for certain models. */
    val maxAudioMegabytesPer1Minute: kotlin.Int? = null,
    /** The maximum requests per day. Only relevant for certain models. */
    val maxRequestsPer1Day: kotlin.Int? = null,
    /** The maximum batch input tokens per day. Only relevant for certain models. */
    val batch1DayMaxInputTokens: kotlin.Int? = null
)
