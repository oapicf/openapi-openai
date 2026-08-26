package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.CompletionUsage
import org.openapitools.model.CreateChatCompletionResponseChoicesInner
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
 * Represents a chat completion response returned by model, based on the provided input.
 * @param id A unique identifier for the chat completion.
 * @param choices A list of chat completion choices. Can be more than one if `n` is greater than 1.
 * @param created The Unix timestamp (in seconds) of when the chat completion was created.
 * @param model The model used for the chat completion.
 * @param &#x60;object&#x60; The object type, which is always `chat.completion`.
 * @param serviceTier The service tier used for processing the request. This field is only included if the `service_tier` parameter is specified in the request.
 * @param systemFingerprint This fingerprint represents the backend configuration that the model runs with.  Can be used in conjunction with the `seed` request parameter to understand when backend changes have been made that might impact determinism. 
 * @param usage 
 */
data class CreateChatCompletionResponse(

    @Schema(required = true, description = "A unique identifier for the chat completion.")
    @param:JsonProperty("id")
    @get:JsonProperty("id", required = true) val id: kotlin.String,

    @field:Valid
    @Schema(required = true, description = "A list of chat completion choices. Can be more than one if `n` is greater than 1.")
    @param:JsonProperty("choices")
    @get:JsonProperty("choices", required = true) val choices: kotlin.collections.List<CreateChatCompletionResponseChoicesInner>,

    @Schema(required = true, description = "The Unix timestamp (in seconds) of when the chat completion was created.")
    @param:JsonProperty("created")
    @get:JsonProperty("created", required = true) val created: kotlin.Int,

    @Schema(required = true, description = "The model used for the chat completion.")
    @param:JsonProperty("model")
    @get:JsonProperty("model", required = true) val model: kotlin.String,

    @Schema(required = true, description = "The object type, which is always `chat.completion`.")
    @param:JsonProperty("object")
    @get:JsonProperty("object", required = true) val `object`: CreateChatCompletionResponse.`Object`,

    @Schema(example = "scale", description = "The service tier used for processing the request. This field is only included if the `service_tier` parameter is specified in the request.")
    @param:JsonProperty("service_tier")
    @get:JsonProperty("service_tier") val serviceTier: CreateChatCompletionResponse.ServiceTier? = null,

    @Schema(description = "This fingerprint represents the backend configuration that the model runs with.  Can be used in conjunction with the `seed` request parameter to understand when backend changes have been made that might impact determinism. ")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("system_fingerprint")
    @get:JsonProperty("system_fingerprint") val systemFingerprint: kotlin.String? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("usage")
    @get:JsonProperty("usage") val usage: CompletionUsage? = null
) {

    /**
    * The object type, which is always `chat.completion`.
    * Values: chatPeriodCompletion
    */
    enum class `Object`(@get:JsonValue val value: kotlin.String) {

        chatPeriodCompletion("chat.completion");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): `Object` {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum '&#x60;Object&#x60;'")
            }
        }
    }

    /**
    * The service tier used for processing the request. This field is only included if the `service_tier` parameter is specified in the request.
    * Values: scale,default
    */
    enum class ServiceTier(@get:JsonValue val value: kotlin.String) {

        scale("scale"),
        default("default");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): ServiceTier {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'ServiceTier'")
            }
        }
    }

}

