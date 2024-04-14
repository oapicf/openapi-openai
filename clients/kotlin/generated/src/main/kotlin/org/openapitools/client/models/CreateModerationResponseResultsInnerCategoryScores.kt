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


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * A list of the categories along with their scores as predicted by model.
 *
 * @param hate The score for the category 'hate'.
 * @param hateThreatening The score for the category 'hate/threatening'.
 * @param harassment The score for the category 'harassment'.
 * @param harassmentThreatening The score for the category 'harassment/threatening'.
 * @param selfHarm The score for the category 'self-harm'.
 * @param selfHarmIntent The score for the category 'self-harm/intent'.
 * @param selfHarmInstructions The score for the category 'self-harm/instructions'.
 * @param sexual The score for the category 'sexual'.
 * @param sexualMinors The score for the category 'sexual/minors'.
 * @param violence The score for the category 'violence'.
 * @param violenceGraphic The score for the category 'violence/graphic'.
 */


data class CreateModerationResponseResultsInnerCategoryScores (

    /* The score for the category 'hate'. */
    @Json(name = "hate")
    val hate: java.math.BigDecimal,

    /* The score for the category 'hate/threatening'. */
    @Json(name = "hate/threatening")
    val hateThreatening: java.math.BigDecimal,

    /* The score for the category 'harassment'. */
    @Json(name = "harassment")
    val harassment: java.math.BigDecimal,

    /* The score for the category 'harassment/threatening'. */
    @Json(name = "harassment/threatening")
    val harassmentThreatening: java.math.BigDecimal,

    /* The score for the category 'self-harm'. */
    @Json(name = "self-harm")
    val selfHarm: java.math.BigDecimal,

    /* The score for the category 'self-harm/intent'. */
    @Json(name = "self-harm/intent")
    val selfHarmIntent: java.math.BigDecimal,

    /* The score for the category 'self-harm/instructions'. */
    @Json(name = "self-harm/instructions")
    val selfHarmInstructions: java.math.BigDecimal,

    /* The score for the category 'sexual'. */
    @Json(name = "sexual")
    val sexual: java.math.BigDecimal,

    /* The score for the category 'sexual/minors'. */
    @Json(name = "sexual/minors")
    val sexualMinors: java.math.BigDecimal,

    /* The score for the category 'violence'. */
    @Json(name = "violence")
    val violence: java.math.BigDecimal,

    /* The score for the category 'violence/graphic'. */
    @Json(name = "violence/graphic")
    val violenceGraphic: java.math.BigDecimal

)

