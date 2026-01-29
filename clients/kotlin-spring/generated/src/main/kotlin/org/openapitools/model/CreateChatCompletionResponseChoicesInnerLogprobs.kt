package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.ChatCompletionTokenLogprob
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
 * Log probability information for the choice.
 * @param content A list of message content tokens with log probability information.
 */
data class CreateChatCompletionResponseChoicesInnerLogprobs(

    @field:Valid
    @Schema(example = "null", required = true, description = "A list of message content tokens with log probability information.")
    @get:JsonProperty("content", required = true) val content: kotlin.collections.List<ChatCompletionTokenLogprob>?
) {

}

