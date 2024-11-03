package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
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
 * @param finishReason The reason the model stopped generating tokens. This will be `stop` if the model hit a natural stop point or a provided stop sequence, `length` if the maximum number of tokens specified in the request was reached, or `content_filter` if content was omitted due to a flag from our content filters. 
 * @param index 
 * @param logprobs 
 * @param text 
 */
data class CreateCompletionResponseChoicesInner(

    @Schema(example = "null", required = true, description = "The reason the model stopped generating tokens. This will be `stop` if the model hit a natural stop point or a provided stop sequence, `length` if the maximum number of tokens specified in the request was reached, or `content_filter` if content was omitted due to a flag from our content filters. ")
    @get:JsonProperty("finish_reason", required = true) val finishReason: CreateCompletionResponseChoicesInner.FinishReason,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("index", required = true) val index: kotlin.Int,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("logprobs", required = true) val logprobs: CreateCompletionResponseChoicesInnerLogprobs?,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("text", required = true) val text: kotlin.String
    ) {

    /**
    * The reason the model stopped generating tokens. This will be `stop` if the model hit a natural stop point or a provided stop sequence, `length` if the maximum number of tokens specified in the request was reached, or `content_filter` if content was omitted due to a flag from our content filters. 
    * Values: stop,length,content_filter
    */
    enum class FinishReason(@get:JsonValue val value: kotlin.String) {

        stop("stop"),
        length("length"),
        content_filter("content_filter");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): FinishReason {
                return values().first{it -> it.value == value}
            }
        }
    }

}

