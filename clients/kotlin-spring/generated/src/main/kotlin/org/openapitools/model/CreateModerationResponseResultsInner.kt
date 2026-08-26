package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.CreateModerationResponseResultsInnerCategories
import org.openapitools.model.CreateModerationResponseResultsInnerCategoryAppliedInputTypes
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
 * @param flagged Whether any of the below categories are flagged.
 * @param categories 
 * @param categoryScores 
 * @param categoryAppliedInputTypes 
 */
data class CreateModerationResponseResultsInner(

    @Schema(required = true, description = "Whether any of the below categories are flagged.")
    @param:JsonProperty("flagged")
    @get:JsonProperty("flagged", required = true) val flagged: kotlin.Boolean,

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("categories")
    @get:JsonProperty("categories", required = true) val categories: CreateModerationResponseResultsInnerCategories,

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("category_scores")
    @get:JsonProperty("category_scores", required = true) val categoryScores: CreateModerationResponseResultsInnerCategoryScores,

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("category_applied_input_types")
    @get:JsonProperty("category_applied_input_types", required = true) val categoryAppliedInputTypes: CreateModerationResponseResultsInnerCategoryAppliedInputTypes
) {

}

