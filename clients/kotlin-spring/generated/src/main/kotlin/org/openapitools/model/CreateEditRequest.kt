package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.CreateEditRequestModel
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
 * @param model 
 * @param instruction The instruction that tells the model how to edit the prompt.
 * @param input The input text to use as a starting point for the edit.
 * @param n How many edits to generate for the input and instruction.
 * @param temperature What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.  We generally recommend altering this or `top_p` but not both. 
 * @param topP An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or `temperature` but not both. 
 */
data class CreateEditRequest(

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("model", required = true) val model: CreateEditRequestModel,

    @Schema(example = "Fix the spelling mistakes.", required = true, description = "The instruction that tells the model how to edit the prompt.")
    @get:JsonProperty("instruction", required = true) val instruction: kotlin.String,

    @Schema(example = "What day of the wek is it?", description = "The input text to use as a starting point for the edit.")
    @get:JsonProperty("input") val input: kotlin.String? = "",

    @get:Min(1)
    @get:Max(20)
    @Schema(example = "1", description = "How many edits to generate for the input and instruction.")
    @get:JsonProperty("n") val n: kotlin.Int? = 1,

    @get:DecimalMin("0")
    @get:DecimalMax("2")
    @Schema(example = "1", description = "What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.  We generally recommend altering this or `top_p` but not both. ")
    @get:JsonProperty("temperature") val temperature: java.math.BigDecimal? = java.math.BigDecimal("1"),

    @get:DecimalMin("0")
    @get:DecimalMax("1")
    @Schema(example = "1", description = "An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or `temperature` but not both. ")
    @get:JsonProperty("top_p") val topP: java.math.BigDecimal? = java.math.BigDecimal("1")
) {

}

