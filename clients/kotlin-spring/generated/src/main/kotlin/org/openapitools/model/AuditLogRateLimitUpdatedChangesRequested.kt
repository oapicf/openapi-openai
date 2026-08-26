package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.Nulls
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
 * The payload used to update the rate limits.
 * @param maxRequestsPer1Minute The maximum requests per minute.
 * @param maxTokensPer1Minute The maximum tokens per minute.
 * @param maxImagesPer1Minute The maximum images per minute. Only relevant for certain models.
 * @param maxAudioMegabytesPer1Minute The maximum audio megabytes per minute. Only relevant for certain models.
 * @param maxRequestsPer1Day The maximum requests per day. Only relevant for certain models.
 * @param batch1DayMaxInputTokens The maximum batch input tokens per day. Only relevant for certain models.
 */
data class AuditLogRateLimitUpdatedChangesRequested(

    @Schema(description = "The maximum requests per minute.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("max_requests_per_1_minute")
    @get:JsonProperty("max_requests_per_1_minute") val maxRequestsPer1Minute: kotlin.Int? = null,

    @Schema(description = "The maximum tokens per minute.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("max_tokens_per_1_minute")
    @get:JsonProperty("max_tokens_per_1_minute") val maxTokensPer1Minute: kotlin.Int? = null,

    @Schema(description = "The maximum images per minute. Only relevant for certain models.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("max_images_per_1_minute")
    @get:JsonProperty("max_images_per_1_minute") val maxImagesPer1Minute: kotlin.Int? = null,

    @Schema(description = "The maximum audio megabytes per minute. Only relevant for certain models.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("max_audio_megabytes_per_1_minute")
    @get:JsonProperty("max_audio_megabytes_per_1_minute") val maxAudioMegabytesPer1Minute: kotlin.Int? = null,

    @Schema(description = "The maximum requests per day. Only relevant for certain models.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("max_requests_per_1_day")
    @get:JsonProperty("max_requests_per_1_day") val maxRequestsPer1Day: kotlin.Int? = null,

    @Schema(description = "The maximum batch input tokens per day. Only relevant for certain models.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("batch_1_day_max_input_tokens")
    @get:JsonProperty("batch_1_day_max_input_tokens") val batch1DayMaxInputTokens: kotlin.Int? = null
) {

}

