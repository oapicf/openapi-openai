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
data class CreateEditResponseChoicesInner(

    @Schema(example = "null", description = "")
    @get:JsonProperty("text") val text: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("index") val index: kotlin.Int? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("logprobs") val logprobs: CreateCompletionResponseChoicesInnerLogprobs? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("finish_reason") val finishReason: CreateEditResponseChoicesInner.FinishReason? = null
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

