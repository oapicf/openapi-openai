package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.CompletionUsage
import org.openapitools.model.CreateChatCompletionFunctionResponseChoicesInner
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
 * @param systemFingerprint This fingerprint represents the backend configuration that the model runs with.  Can be used in conjunction with the `seed` request parameter to understand when backend changes have been made that might impact determinism. 
 * @param usage 
 */
data class CreateChatCompletionFunctionResponse(

    @Schema(example = "null", required = true, description = "A unique identifier for the chat completion.")
    @get:JsonProperty("id", required = true) val id: kotlin.String,

    @field:Valid
    @Schema(example = "null", required = true, description = "A list of chat completion choices. Can be more than one if `n` is greater than 1.")
    @get:JsonProperty("choices", required = true) val choices: kotlin.collections.List<CreateChatCompletionFunctionResponseChoicesInner>,

    @Schema(example = "null", required = true, description = "The Unix timestamp (in seconds) of when the chat completion was created.")
    @get:JsonProperty("created", required = true) val created: kotlin.Int,

    @Schema(example = "null", required = true, description = "The model used for the chat completion.")
    @get:JsonProperty("model", required = true) val model: kotlin.String,

    @Schema(example = "null", required = true, description = "The object type, which is always `chat.completion`.")
    @get:JsonProperty("object", required = true) val `object`: CreateChatCompletionFunctionResponse.`Object`,

    @Schema(example = "null", description = "This fingerprint represents the backend configuration that the model runs with.  Can be used in conjunction with the `seed` request parameter to understand when backend changes have been made that might impact determinism. ")
    @get:JsonProperty("system_fingerprint") val systemFingerprint: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("usage") val usage: CompletionUsage? = null
) {

    /**
    * The object type, which is always `chat.completion`.
    * Values: chatPeriodCompletion
    */
    enum class `Object`(val value: kotlin.String) {

        @JsonProperty("chat.completion") chatPeriodCompletion("chat.completion")
    }

}

