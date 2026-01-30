package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.RunStepDetailsToolCallsFileSearchRankingOptionsObject
import org.openapitools.model.RunStepDetailsToolCallsFileSearchResultObject
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
 * For now, this is always going to be an empty object.
 * @param rankingOptions 
 * @param results The results of the file search.
 */
data class RunStepDetailsToolCallsFileSearchObjectFileSearch(

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("ranking_options") val rankingOptions: RunStepDetailsToolCallsFileSearchRankingOptionsObject? = null,

    @field:Valid
    @Schema(example = "null", description = "The results of the file search.")
    @get:JsonProperty("results") val results: kotlin.collections.List<RunStepDetailsToolCallsFileSearchResultObject>? = null
) {

}

