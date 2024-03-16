/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package org.openapitools.client.models

import org.openapitools.client.models.CreateModerationResponseResultsInnerCategories
import org.openapitools.client.models.CreateModerationResponseResultsInnerCategoryScores

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param flagged 
 * @param categories 
 * @param categoryScores 
 */


data class CreateModerationResponseResultsInner (

    @Json(name = "flagged")
    val flagged: kotlin.Boolean,

    @Json(name = "categories")
    val categories: CreateModerationResponseResultsInnerCategories,

    @Json(name = "category_scores")
    val categoryScores: CreateModerationResponseResultsInnerCategoryScores

)

