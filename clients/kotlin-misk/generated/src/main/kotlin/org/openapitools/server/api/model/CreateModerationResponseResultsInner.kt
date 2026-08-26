package org.openapitools.server.api.model

import org.openapitools.server.api.model.CreateModerationResponseResultsInnerCategories
import org.openapitools.server.api.model.CreateModerationResponseResultsInnerCategoryAppliedInputTypes
import org.openapitools.server.api.model.CreateModerationResponseResultsInnerCategoryScores
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CreateModerationResponseResultsInner(
    /** Whether any of the below categories are flagged. */
    val flagged: kotlin.Boolean,
    val categories: CreateModerationResponseResultsInnerCategories,
    val categoryScores: CreateModerationResponseResultsInnerCategoryScores,
    val categoryAppliedInputTypes: CreateModerationResponseResultsInnerCategoryAppliedInputTypes
)
