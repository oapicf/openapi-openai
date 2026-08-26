package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.FineTunePreferenceRequestInputInput
import org.openapitools.model.FineTunePreferenceRequestInputPreferredCompletionInner
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
 * The per-line training example of a fine-tuning input file for chat models using the dpo method.
 * @param input 
 * @param preferredCompletion The preferred completion message for the output.
 * @param nonPreferredCompletion The non-preferred completion message for the output.
 */
data class FineTunePreferenceRequestInput(

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("input")
    @get:JsonProperty("input") val input: FineTunePreferenceRequestInputInput? = null,

    @field:Valid
    @get:Size(max=1)
    @Schema(description = "The preferred completion message for the output.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("preferred_completion")
    @get:JsonProperty("preferred_completion") val preferredCompletion: kotlin.collections.List<FineTunePreferenceRequestInputPreferredCompletionInner>? = null,

    @field:Valid
    @get:Size(max=1)
    @Schema(description = "The non-preferred completion message for the output.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("non_preferred_completion")
    @get:JsonProperty("non_preferred_completion") val nonPreferredCompletion: kotlin.collections.List<FineTunePreferenceRequestInputPreferredCompletionInner>? = null
) {

}

