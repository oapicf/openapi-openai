package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.CreateChatCompletionStreamResponseChoicesInner
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
 * @param id 
 * @param &#x60;object&#x60; 
 * @param created 
 * @param model 
 * @param choices 
 */
data class CreateChatCompletionStreamResponse(

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("id", required = true) val id: kotlin.String,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("object", required = true) val `object`: kotlin.String,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("created", required = true) val created: kotlin.Int,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("model", required = true) val model: kotlin.String,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("choices", required = true) val choices: kotlin.collections.List<CreateChatCompletionStreamResponseChoicesInner>
) {

}

