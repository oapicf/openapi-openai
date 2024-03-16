package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.ChatCompletionResponseMessage
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
 * @param message 
 * @param finishReason 
 */
data class CreateChatCompletionResponseChoicesInner(

    @Schema(example = "null", description = "")
    @get:JsonProperty("index") val index: kotlin.Int? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("message") val message: ChatCompletionResponseMessage? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("finish_reason") val finishReason: CreateChatCompletionResponseChoicesInner.FinishReason? = null
) {

    /**
    * 
    * Values: stop,length,function_call
    */
    enum class FinishReason(val value: kotlin.String) {

        @JsonProperty("stop") stop("stop"),
        @JsonProperty("length") length("length"),
        @JsonProperty("function_call") function_call("function_call")
    }

}

