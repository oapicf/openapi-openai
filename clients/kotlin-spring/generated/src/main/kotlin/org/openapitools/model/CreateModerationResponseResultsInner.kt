package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.CreateModerationResponseResultsInnerCategories
import org.openapitools.model.CreateModerationResponseResultsInnerCategoryScores
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
 * @param flagged 
 * @param categories 
 * @param categoryScores 
 */
data class CreateModerationResponseResultsInner(

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("flagged", required = true) val flagged: kotlin.Boolean,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("categories", required = true) val categories: CreateModerationResponseResultsInnerCategories,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("category_scores", required = true) val categoryScores: CreateModerationResponseResultsInnerCategoryScores
) {

}

