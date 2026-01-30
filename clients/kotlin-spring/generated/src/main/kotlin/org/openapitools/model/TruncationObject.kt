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
 * Controls for how a thread will be truncated prior to the run. Use this to control the intial context window of the run.
 * @param type The truncation strategy to use for the thread. The default is `auto`. If set to `last_messages`, the thread will be truncated to the n most recent messages in the thread. When set to `auto`, messages in the middle of the thread will be dropped to fit the context length of the model, `max_prompt_tokens`.
 * @param lastMessages The number of most recent messages from the thread when constructing the context for the run.
 */
data class TruncationObject(

    @Schema(example = "null", required = true, description = "The truncation strategy to use for the thread. The default is `auto`. If set to `last_messages`, the thread will be truncated to the n most recent messages in the thread. When set to `auto`, messages in the middle of the thread will be dropped to fit the context length of the model, `max_prompt_tokens`.")
    @get:JsonProperty("type", required = true) val type: TruncationObject.Type,

    @get:Min(value=1)
    @Schema(example = "null", description = "The number of most recent messages from the thread when constructing the context for the run.")
    @get:JsonProperty("last_messages") val lastMessages: kotlin.Int? = null
) {

    /**
    * The truncation strategy to use for the thread. The default is `auto`. If set to `last_messages`, the thread will be truncated to the n most recent messages in the thread. When set to `auto`, messages in the middle of the thread will be dropped to fit the context length of the model, `max_prompt_tokens`.
    * Values: auto,last_messages
    */
    enum class Type(@get:JsonValue val value: kotlin.String) {

        auto("auto"),
        last_messages("last_messages");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Type {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'TruncationObject'")
            }
        }
    }

}

