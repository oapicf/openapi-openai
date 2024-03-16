package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.CreateCompletionResponseChoicesInnerLogprobs
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
 * @param text 
 * @param index 
 * @param logprobs 
 * @param finishReason 
 */
data class CreateCompletionResponseChoicesInner(

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("text", required = true) val text: kotlin.String,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("index", required = true) val index: kotlin.Int,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("logprobs", required = true) val logprobs: CreateCompletionResponseChoicesInnerLogprobs?,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("finish_reason", required = true) val finishReason: CreateCompletionResponseChoicesInner.FinishReason
) {

    /**
    * 
    * Values: stop,length
    */
    enum class FinishReason(val value: kotlin.String) {

        @JsonProperty("stop") stop("stop"),
        @JsonProperty("length") length("length")
    }

}

