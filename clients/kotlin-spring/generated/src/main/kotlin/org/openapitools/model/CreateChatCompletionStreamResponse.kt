package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.CreateChatCompletionStreamResponseChoicesInner
import org.openapitools.model.CreateChatCompletionStreamResponseUsage
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
 * Represents a streamed chunk of a chat completion response returned by model, based on the provided input.
 * @param id A unique identifier for the chat completion. Each chunk has the same ID.
 * @param choices A list of chat completion choices. Can contain more than one elements if `n` is greater than 1. Can also be empty for the last chunk if you set `stream_options: {\"include_usage\": true}`. 
 * @param created The Unix timestamp (in seconds) of when the chat completion was created. Each chunk has the same timestamp.
 * @param model The model to generate the completion.
 * @param &#x60;object&#x60; The object type, which is always `chat.completion.chunk`.
 * @param serviceTier The service tier used for processing the request. This field is only included if the `service_tier` parameter is specified in the request.
 * @param systemFingerprint This fingerprint represents the backend configuration that the model runs with. Can be used in conjunction with the `seed` request parameter to understand when backend changes have been made that might impact determinism. 
 * @param usage 
 */
data class CreateChatCompletionStreamResponse(

    @Schema(example = "null", required = true, description = "A unique identifier for the chat completion. Each chunk has the same ID.")
    @get:JsonProperty("id", required = true) val id: kotlin.String,

    @field:Valid
    @Schema(example = "null", required = true, description = "A list of chat completion choices. Can contain more than one elements if `n` is greater than 1. Can also be empty for the last chunk if you set `stream_options: {\"include_usage\": true}`. ")
    @get:JsonProperty("choices", required = true) val choices: kotlin.collections.List<CreateChatCompletionStreamResponseChoicesInner>,

    @Schema(example = "null", required = true, description = "The Unix timestamp (in seconds) of when the chat completion was created. Each chunk has the same timestamp.")
    @get:JsonProperty("created", required = true) val created: kotlin.Int,

    @Schema(example = "null", required = true, description = "The model to generate the completion.")
    @get:JsonProperty("model", required = true) val model: kotlin.String,

    @Schema(example = "null", required = true, description = "The object type, which is always `chat.completion.chunk`.")
    @get:JsonProperty("object", required = true) val `object`: CreateChatCompletionStreamResponse.`Object`,

    @Schema(example = "scale", description = "The service tier used for processing the request. This field is only included if the `service_tier` parameter is specified in the request.")
    @get:JsonProperty("service_tier") val serviceTier: CreateChatCompletionStreamResponse.ServiceTier? = null,

    @Schema(example = "null", description = "This fingerprint represents the backend configuration that the model runs with. Can be used in conjunction with the `seed` request parameter to understand when backend changes have been made that might impact determinism. ")
    @get:JsonProperty("system_fingerprint") val systemFingerprint: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("usage") val usage: CreateChatCompletionStreamResponseUsage? = null
) {

    /**
    * The object type, which is always `chat.completion.chunk`.
    * Values: chatPeriodCompletionPeriodChunk
    */
    enum class `Object`(@get:JsonValue val value: kotlin.String) {

        chatPeriodCompletionPeriodChunk("chat.completion.chunk");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): `Object` {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'CreateChatCompletionStreamResponse'")
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
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'CreateChatCompletionStreamResponse'")
            }
        }
    }

}

