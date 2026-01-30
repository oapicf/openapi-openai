package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
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
 * Represents a project rate limit config.
 * @param &#x60;object&#x60; The object type, which is always `project.rate_limit`
 * @param id The identifier, which can be referenced in API endpoints.
 * @param model The model this rate limit applies to.
 * @param maxRequestsPer1Minute The maximum requests per minute.
 * @param maxTokensPer1Minute The maximum tokens per minute.
 * @param maxImagesPer1Minute The maximum images per minute. Only present for relevant models.
 * @param maxAudioMegabytesPer1Minute The maximum audio megabytes per minute. Only present for relevant models.
 * @param maxRequestsPer1Day The maximum requests per day. Only present for relevant models.
 * @param batch1DayMaxInputTokens The maximum batch input tokens per day. Only present for relevant models.
 */
data class ProjectRateLimit(

    @Schema(example = "null", required = true, description = "The object type, which is always `project.rate_limit`")
    @get:JsonProperty("object", required = true) val `object`: ProjectRateLimit.`Object`,

    @Schema(example = "null", required = true, description = "The identifier, which can be referenced in API endpoints.")
    @get:JsonProperty("id", required = true) val id: kotlin.String,

    @Schema(example = "null", required = true, description = "The model this rate limit applies to.")
    @get:JsonProperty("model", required = true) val model: kotlin.String,

    @Schema(example = "null", required = true, description = "The maximum requests per minute.")
    @get:JsonProperty("max_requests_per_1_minute", required = true) val maxRequestsPer1Minute: kotlin.Int,

    @Schema(example = "null", required = true, description = "The maximum tokens per minute.")
    @get:JsonProperty("max_tokens_per_1_minute", required = true) val maxTokensPer1Minute: kotlin.Int,

    @Schema(example = "null", description = "The maximum images per minute. Only present for relevant models.")
    @get:JsonProperty("max_images_per_1_minute") val maxImagesPer1Minute: kotlin.Int? = null,

    @Schema(example = "null", description = "The maximum audio megabytes per minute. Only present for relevant models.")
    @get:JsonProperty("max_audio_megabytes_per_1_minute") val maxAudioMegabytesPer1Minute: kotlin.Int? = null,

    @Schema(example = "null", description = "The maximum requests per day. Only present for relevant models.")
    @get:JsonProperty("max_requests_per_1_day") val maxRequestsPer1Day: kotlin.Int? = null,

    @Schema(example = "null", description = "The maximum batch input tokens per day. Only present for relevant models.")
    @get:JsonProperty("batch_1_day_max_input_tokens") val batch1DayMaxInputTokens: kotlin.Int? = null
) {

    /**
    * The object type, which is always `project.rate_limit`
    * Values: projectPeriodRate_limit
    */
    enum class `Object`(@get:JsonValue val value: kotlin.String) {

        projectPeriodRate_limit("project.rate_limit");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): `Object` {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'ProjectRateLimit'")
            }
        }
    }

}

