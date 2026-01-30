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
 * The aggregated completions usage details of the specific time bucket.
 * @param &#x60;object&#x60; 
 * @param inputTokens The aggregated number of text input tokens used, including cached tokens. For customers subscribe to scale tier, this includes scale tier tokens.
 * @param outputTokens The aggregated number of text output tokens used. For customers subscribe to scale tier, this includes scale tier tokens.
 * @param numModelRequests The count of requests made to the model.
 * @param inputCachedTokens The aggregated number of text input tokens that has been cached from previous requests. For customers subscribe to scale tier, this includes scale tier tokens.
 * @param inputAudioTokens The aggregated number of audio input tokens used, including cached tokens.
 * @param outputAudioTokens The aggregated number of audio output tokens used.
 * @param projectId When `group_by=project_id`, this field provides the project ID of the grouped usage result.
 * @param userId When `group_by=user_id`, this field provides the user ID of the grouped usage result.
 * @param apiKeyId When `group_by=api_key_id`, this field provides the API key ID of the grouped usage result.
 * @param model When `group_by=model`, this field provides the model name of the grouped usage result.
 * @param batch When `group_by=batch`, this field tells whether the grouped usage result is batch or not.
 */
data class UsageCompletionsResult(

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("object", required = true) val `object`: UsageCompletionsResult.`Object`,

    @Schema(example = "null", required = true, description = "The aggregated number of text input tokens used, including cached tokens. For customers subscribe to scale tier, this includes scale tier tokens.")
    @get:JsonProperty("input_tokens", required = true) val inputTokens: kotlin.Int,

    @Schema(example = "null", required = true, description = "The aggregated number of text output tokens used. For customers subscribe to scale tier, this includes scale tier tokens.")
    @get:JsonProperty("output_tokens", required = true) val outputTokens: kotlin.Int,

    @Schema(example = "null", required = true, description = "The count of requests made to the model.")
    @get:JsonProperty("num_model_requests", required = true) val numModelRequests: kotlin.Int,

    @Schema(example = "null", description = "The aggregated number of text input tokens that has been cached from previous requests. For customers subscribe to scale tier, this includes scale tier tokens.")
    @get:JsonProperty("input_cached_tokens") val inputCachedTokens: kotlin.Int? = null,

    @Schema(example = "null", description = "The aggregated number of audio input tokens used, including cached tokens.")
    @get:JsonProperty("input_audio_tokens") val inputAudioTokens: kotlin.Int? = null,

    @Schema(example = "null", description = "The aggregated number of audio output tokens used.")
    @get:JsonProperty("output_audio_tokens") val outputAudioTokens: kotlin.Int? = null,

    @Schema(example = "null", description = "When `group_by=project_id`, this field provides the project ID of the grouped usage result.")
    @get:JsonProperty("project_id") val projectId: kotlin.String? = null,

    @Schema(example = "null", description = "When `group_by=user_id`, this field provides the user ID of the grouped usage result.")
    @get:JsonProperty("user_id") val userId: kotlin.String? = null,

    @Schema(example = "null", description = "When `group_by=api_key_id`, this field provides the API key ID of the grouped usage result.")
    @get:JsonProperty("api_key_id") val apiKeyId: kotlin.String? = null,

    @Schema(example = "null", description = "When `group_by=model`, this field provides the model name of the grouped usage result.")
    @get:JsonProperty("model") val model: kotlin.String? = null,

    @Schema(example = "null", description = "When `group_by=batch`, this field tells whether the grouped usage result is batch or not.")
    @get:JsonProperty("batch") val batch: kotlin.Boolean? = null
) {

    /**
    * 
    * Values: organizationPeriodUsagePeriodCompletionsPeriodResult
    */
    enum class `Object`(@get:JsonValue val value: kotlin.String) {

        organizationPeriodUsagePeriodCompletionsPeriodResult("organization.usage.completions.result");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): `Object` {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'UsageCompletionsResult'")
            }
        }
    }

}

