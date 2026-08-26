package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class TranscriptionSegment(
    /** Unique identifier of the segment. */
    val id: kotlin.Int,
    /** Seek offset of the segment. */
    val seek: kotlin.Int,
    /** Start time of the segment in seconds. */
    val start: kotlin.Float,
    /** End time of the segment in seconds. */
    val end: kotlin.Float,
    /** Text content of the segment. */
    val text: kotlin.String,
    /** Array of token IDs for the text content. */
    val tokens: kotlin.collections.List<kotlin.Int>,
    /** Temperature parameter used for generating the segment. */
    val temperature: kotlin.Float,
    /** Average logprob of the segment. If the value is lower than -1, consider the logprobs failed. */
    val avgLogprob: kotlin.Float,
    /** Compression ratio of the segment. If the value is greater than 2.4, consider the compression failed. */
    val compressionRatio: kotlin.Float,
    /** Probability of no speech in the segment. If the value is higher than 1.0 and the &#x60;avg_logprob&#x60; is below -1, consider this segment silent. */
    val noSpeechProb: kotlin.Float
)
