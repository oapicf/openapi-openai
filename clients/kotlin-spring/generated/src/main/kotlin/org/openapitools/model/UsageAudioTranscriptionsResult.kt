package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.annotation.JsonInclude
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
 * The aggregated audio transcriptions usage details of the specific time bucket.
 * @param &#x60;object&#x60; 
 * @param seconds The number of seconds processed.
 * @param numModelRequests The count of requests made to the model.
 * @param projectId When `group_by=project_id`, this field provides the project ID of the grouped usage result.
 * @param userId When `group_by=user_id`, this field provides the user ID of the grouped usage result.
 * @param apiKeyId When `group_by=api_key_id`, this field provides the API key ID of the grouped usage result.
 * @param model When `group_by=model`, this field provides the model name of the grouped usage result.
 */
data class UsageAudioTranscriptionsResult(

    @Schema(required = true, description = "")
    @param:JsonProperty("object")
    @get:JsonProperty("object", required = true) val `object`: UsageAudioTranscriptionsResult.`Object`,

    @Schema(required = true, description = "The number of seconds processed.")
    @param:JsonProperty("seconds")
    @get:JsonProperty("seconds", required = true) val seconds: kotlin.Int,

    @Schema(required = true, description = "The count of requests made to the model.")
    @param:JsonProperty("num_model_requests")
    @get:JsonProperty("num_model_requests", required = true) val numModelRequests: kotlin.Int,

    @Schema(description = "When `group_by=project_id`, this field provides the project ID of the grouped usage result.")
    @param:JsonProperty("project_id")
    @get:JsonProperty("project_id") val projectId: kotlin.String? = null,

    @Schema(description = "When `group_by=user_id`, this field provides the user ID of the grouped usage result.")
    @param:JsonProperty("user_id")
    @get:JsonProperty("user_id") val userId: kotlin.String? = null,

    @Schema(description = "When `group_by=api_key_id`, this field provides the API key ID of the grouped usage result.")
    @param:JsonProperty("api_key_id")
    @get:JsonProperty("api_key_id") val apiKeyId: kotlin.String? = null,

    @Schema(description = "When `group_by=model`, this field provides the model name of the grouped usage result.")
    @param:JsonProperty("model")
    @get:JsonProperty("model") val model: kotlin.String? = null
) : UsageTimeBucketResultInner {

    /**
    * 
    * Values: organizationPeriodUsagePeriodAudio_transcriptionsPeriodResult
    */
    enum class `Object`(@get:JsonValue val value: kotlin.String) {

        organizationPeriodUsagePeriodAudio_transcriptionsPeriodResult("organization.usage.audio_transcriptions.result");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): `Object` {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum '&#x60;Object&#x60;'")
            }
        }
    }

}

