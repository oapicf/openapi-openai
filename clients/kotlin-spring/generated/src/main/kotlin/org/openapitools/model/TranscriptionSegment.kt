package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid
import io.swagger.v3.oas.annotations.media.Schema

/**
 * 
 * @param id Unique identifier of the segment.
 * @param seek Seek offset of the segment.
 * @param start Start time of the segment in seconds.
 * @param end End time of the segment in seconds.
 * @param text Text content of the segment.
 * @param tokens Array of token IDs for the text content.
 * @param temperature Temperature parameter used for generating the segment.
 * @param avgLogprob Average logprob of the segment. If the value is lower than -1, consider the logprobs failed.
 * @param compressionRatio Compression ratio of the segment. If the value is greater than 2.4, consider the compression failed.
 * @param noSpeechProb Probability of no speech in the segment. If the value is higher than 1.0 and the `avg_logprob` is below -1, consider this segment silent.
 */
data class TranscriptionSegment(

    @Schema(example = "null", required = true, description = "Unique identifier of the segment.")
    @get:JsonProperty("id", required = true) val id: kotlin.Int,

    @Schema(example = "null", required = true, description = "Seek offset of the segment.")
    @get:JsonProperty("seek", required = true) val seek: kotlin.Int,

    @Schema(example = "null", required = true, description = "Start time of the segment in seconds.")
    @get:JsonProperty("start", required = true) val start: kotlin.Float,

    @Schema(example = "null", required = true, description = "End time of the segment in seconds.")
    @get:JsonProperty("end", required = true) val end: kotlin.Float,

    @Schema(example = "null", required = true, description = "Text content of the segment.")
    @get:JsonProperty("text", required = true) val text: kotlin.String,

    @Schema(example = "null", required = true, description = "Array of token IDs for the text content.")
    @get:JsonProperty("tokens", required = true) val tokens: kotlin.collections.List<kotlin.Int>,

    @Schema(example = "null", required = true, description = "Temperature parameter used for generating the segment.")
    @get:JsonProperty("temperature", required = true) val temperature: kotlin.Float,

    @Schema(example = "null", required = true, description = "Average logprob of the segment. If the value is lower than -1, consider the logprobs failed.")
    @get:JsonProperty("avg_logprob", required = true) val avgLogprob: kotlin.Float,

    @Schema(example = "null", required = true, description = "Compression ratio of the segment. If the value is greater than 2.4, consider the compression failed.")
    @get:JsonProperty("compression_ratio", required = true) val compressionRatio: kotlin.Float,

    @Schema(example = "null", required = true, description = "Probability of no speech in the segment. If the value is higher than 1.0 and the `avg_logprob` is below -1, consider this segment silent.")
    @get:JsonProperty("no_speech_prob", required = true) val noSpeechProb: kotlin.Float
) {

}

