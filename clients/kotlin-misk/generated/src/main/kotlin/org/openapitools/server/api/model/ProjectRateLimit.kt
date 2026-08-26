package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ProjectRateLimit(
    /** The object type, which is always &#x60;project.rate_limit&#x60; */
    val `object`: kotlin.String,
    /** The identifier, which can be referenced in API endpoints. */
    val id: kotlin.String,
    /** The model this rate limit applies to. */
    val model: kotlin.String,
    /** The maximum requests per minute. */
    val maxRequestsPer1Minute: kotlin.Int,
    /** The maximum tokens per minute. */
    val maxTokensPer1Minute: kotlin.Int,
    /** The maximum images per minute. Only present for relevant models. */
    val maxImagesPer1Minute: kotlin.Int? = null,
    /** The maximum audio megabytes per minute. Only present for relevant models. */
    val maxAudioMegabytesPer1Minute: kotlin.Int? = null,
    /** The maximum requests per day. Only present for relevant models. */
    val maxRequestsPer1Day: kotlin.Int? = null,
    /** The maximum batch input tokens per day. Only present for relevant models. */
    val batch1DayMaxInputTokens: kotlin.Int? = null
)
