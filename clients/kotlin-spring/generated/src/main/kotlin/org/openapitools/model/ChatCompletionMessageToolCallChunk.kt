package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.ChatCompletionMessageToolCallChunkFunction
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
 * @param index 
 * @param id The ID of the tool call.
 * @param type The type of the tool. Currently, only `function` is supported.
 * @param function 
 */
data class ChatCompletionMessageToolCallChunk(

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("index", required = true) val index: kotlin.Int,

    @Schema(example = "null", description = "The ID of the tool call.")
    @get:JsonProperty("id") val id: kotlin.String? = null,

    @Schema(example = "null", description = "The type of the tool. Currently, only `function` is supported.")
    @get:JsonProperty("type") val type: ChatCompletionMessageToolCallChunk.Type? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("function") val function: ChatCompletionMessageToolCallChunkFunction? = null
) {

    /**
    * The type of the tool. Currently, only `function` is supported.
    * Values: function
    */
    enum class Type(@get:JsonValue val value: kotlin.String) {

        function("function");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Type {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'ChatCompletionMessageToolCallChunk'")
            }
        }
    }

}

