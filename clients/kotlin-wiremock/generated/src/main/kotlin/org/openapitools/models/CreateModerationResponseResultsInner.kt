@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CreateModerationResponseResultsInner(
    @field:JsonProperty("flagged")
    val flagged: kotlin.Boolean,

    @field:JsonProperty("categories")
    val categories: CreateModerationResponseResultsInnerCategories,

    @field:JsonProperty("category_scores")
    val categoryScores: CreateModerationResponseResultsInnerCategoryScores,

    @field:JsonProperty("category_applied_input_types")
    val categoryAppliedInputTypes: CreateModerationResponseResultsInnerCategoryAppliedInputTypes,

)
