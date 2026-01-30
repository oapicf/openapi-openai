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
 * The aggregated moderations usage details of the specific time bucket.
 * @param &#x60;object&#x60; 
 * @param inputTokens The aggregated number of input tokens used.
 * @param numModelRequests The count of requests made to the model.
 * @param projectId When `group_by=project_id`, this field provides the project ID of the grouped usage result.
 * @param userId When `group_by=user_id`, this field provides the user ID of the grouped usage result.
 * @param apiKeyId When `group_by=api_key_id`, this field provides the API key ID of the grouped usage result.
 * @param model When `group_by=model`, this field provides the model name of the grouped usage result.
 */
data class UsageModerationsResult(

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("object", required = true) val `object`: UsageModerationsResult.`Object`,

    @Schema(example = "null", required = true, description = "The aggregated number of input tokens used.")
    @get:JsonProperty("input_tokens", required = true) val inputTokens: kotlin.Int,

    @Schema(example = "null", required = true, description = "The count of requests made to the model.")
    @get:JsonProperty("num_model_requests", required = true) val numModelRequests: kotlin.Int,

    @Schema(example = "null", description = "When `group_by=project_id`, this field provides the project ID of the grouped usage result.")
    @get:JsonProperty("project_id") val projectId: kotlin.String? = null,

    @Schema(example = "null", description = "When `group_by=user_id`, this field provides the user ID of the grouped usage result.")
    @get:JsonProperty("user_id") val userId: kotlin.String? = null,

    @Schema(example = "null", description = "When `group_by=api_key_id`, this field provides the API key ID of the grouped usage result.")
    @get:JsonProperty("api_key_id") val apiKeyId: kotlin.String? = null,

    @Schema(example = "null", description = "When `group_by=model`, this field provides the model name of the grouped usage result.")
    @get:JsonProperty("model") val model: kotlin.String? = null
) {

    /**
    * 
    * Values: organizationPeriodUsagePeriodModerationsPeriodResult
    */
    enum class `Object`(@get:JsonValue val value: kotlin.String) {

        organizationPeriodUsagePeriodModerationsPeriodResult("organization.usage.moderations.result");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): `Object` {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'UsageModerationsResult'")
            }
        }
    }

}

