package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.CostsResult
import org.openapitools.model.CostsResultAmount
import org.openapitools.model.UsageAudioSpeechesResult
import org.openapitools.model.UsageAudioTranscriptionsResult
import org.openapitools.model.UsageCodeInterpreterSessionsResult
import org.openapitools.model.UsageCompletionsResult
import org.openapitools.model.UsageEmbeddingsResult
import org.openapitools.model.UsageImagesResult
import org.openapitools.model.UsageModerationsResult
import org.openapitools.model.UsageVectorStoresResult
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
 * @param &#x60;object&#x60; 
 * @param inputTokens The aggregated number of input tokens used.
 * @param outputTokens The aggregated number of text output tokens used. For customers subscribe to scale tier, this includes scale tier tokens.
 * @param numModelRequests The count of requests made to the model.
 * @param images The number of images processed.
 * @param characters The number of characters processed.
 * @param seconds The number of seconds processed.
 * @param usageBytes The vector stores usage in bytes.
 * @param sessions The number of code interpreter sessions.
 * @param inputCachedTokens The aggregated number of text input tokens that has been cached from previous requests. For customers subscribe to scale tier, this includes scale tier tokens.
 * @param inputAudioTokens The aggregated number of audio input tokens used, including cached tokens.
 * @param outputAudioTokens The aggregated number of audio output tokens used.
 * @param projectId When `group_by=project_id`, this field provides the project ID of the grouped costs result.
 * @param userId When `group_by=user_id`, this field provides the user ID of the grouped usage result.
 * @param apiKeyId When `group_by=api_key_id`, this field provides the API key ID of the grouped usage result.
 * @param model When `group_by=model`, this field provides the model name of the grouped usage result.
 * @param batch When `group_by=batch`, this field tells whether the grouped usage result is batch or not.
 * @param source When `group_by=source`, this field provides the source of the grouped usage result, possible values are `image.generation`, `image.edit`, `image.variation`.
 * @param propertySize When `group_by=size`, this field provides the image size of the grouped usage result.
 * @param amount 
 * @param lineItem When `group_by=line_item`, this field provides the line item of the grouped costs result.
 */
data class UsageTimeBucketResultInner(

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("object", required = true) val `object`: UsageTimeBucketResultInner.`Object`,

    @Schema(example = "null", required = true, description = "The aggregated number of input tokens used.")
    @get:JsonProperty("input_tokens", required = true) val inputTokens: kotlin.Int,

    @Schema(example = "null", required = true, description = "The aggregated number of text output tokens used. For customers subscribe to scale tier, this includes scale tier tokens.")
    @get:JsonProperty("output_tokens", required = true) val outputTokens: kotlin.Int,

    @Schema(example = "null", required = true, description = "The count of requests made to the model.")
    @get:JsonProperty("num_model_requests", required = true) val numModelRequests: kotlin.Int,

    @Schema(example = "null", required = true, description = "The number of images processed.")
    @get:JsonProperty("images", required = true) val images: kotlin.Int,

    @Schema(example = "null", required = true, description = "The number of characters processed.")
    @get:JsonProperty("characters", required = true) val characters: kotlin.Int,

    @Schema(example = "null", required = true, description = "The number of seconds processed.")
    @get:JsonProperty("seconds", required = true) val seconds: kotlin.Int,

    @Schema(example = "null", required = true, description = "The vector stores usage in bytes.")
    @get:JsonProperty("usage_bytes", required = true) val usageBytes: kotlin.Int,

    @Schema(example = "null", required = true, description = "The number of code interpreter sessions.")
    @get:JsonProperty("sessions", required = true) val sessions: kotlin.Int,

    @Schema(example = "null", description = "The aggregated number of text input tokens that has been cached from previous requests. For customers subscribe to scale tier, this includes scale tier tokens.")
    @get:JsonProperty("input_cached_tokens") val inputCachedTokens: kotlin.Int? = null,

    @Schema(example = "null", description = "The aggregated number of audio input tokens used, including cached tokens.")
    @get:JsonProperty("input_audio_tokens") val inputAudioTokens: kotlin.Int? = null,

    @Schema(example = "null", description = "The aggregated number of audio output tokens used.")
    @get:JsonProperty("output_audio_tokens") val outputAudioTokens: kotlin.Int? = null,

    @Schema(example = "null", description = "When `group_by=project_id`, this field provides the project ID of the grouped costs result.")
    @get:JsonProperty("project_id") val projectId: kotlin.String? = null,

    @Schema(example = "null", description = "When `group_by=user_id`, this field provides the user ID of the grouped usage result.")
    @get:JsonProperty("user_id") val userId: kotlin.String? = null,

    @Schema(example = "null", description = "When `group_by=api_key_id`, this field provides the API key ID of the grouped usage result.")
    @get:JsonProperty("api_key_id") val apiKeyId: kotlin.String? = null,

    @Schema(example = "null", description = "When `group_by=model`, this field provides the model name of the grouped usage result.")
    @get:JsonProperty("model") val model: kotlin.String? = null,

    @Schema(example = "null", description = "When `group_by=batch`, this field tells whether the grouped usage result is batch or not.")
    @get:JsonProperty("batch") val batch: kotlin.Boolean? = null,

    @Schema(example = "null", description = "When `group_by=source`, this field provides the source of the grouped usage result, possible values are `image.generation`, `image.edit`, `image.variation`.")
    @get:JsonProperty("source") val source: kotlin.String? = null,

    @Schema(example = "null", description = "When `group_by=size`, this field provides the image size of the grouped usage result.")
    @get:JsonProperty("size") val propertySize: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("amount") val amount: CostsResultAmount? = null,

    @Schema(example = "null", description = "When `group_by=line_item`, this field provides the line item of the grouped costs result.")
    @get:JsonProperty("line_item") val lineItem: kotlin.String? = null
) {

    /**
    * 
    * Values: organizationPeriodCostsPeriodResult
    */
    enum class `Object`(@get:JsonValue val value: kotlin.String) {

        organizationPeriodCostsPeriodResult("organization.costs.result");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): `Object` {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'UsageTimeBucketResultInner'")
            }
        }
    }

}

