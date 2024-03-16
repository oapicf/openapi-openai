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
 * 
 *
 * @param hate 
 * @param hateThreatening 
 * @param selfHarm 
 * @param sexual 
 * @param sexualMinors 
 * @param violence 
 * @param violenceGraphic 
 */


data class CreateModerationResponseResultsInnerCategoryScores (

    @Json(name = "hate")
    val hate: java.math.BigDecimal,

    @Json(name = "hate/threatening")
    val hateThreatening: java.math.BigDecimal,

    @Json(name = "self-harm")
    val selfHarm: java.math.BigDecimal,

    @Json(name = "sexual")
    val sexual: java.math.BigDecimal,

    @Json(name = "sexual/minors")
    val sexualMinors: java.math.BigDecimal,

    @Json(name = "violence")
    val violence: java.math.BigDecimal,

    @Json(name = "violence/graphic")
    val violenceGraphic: java.math.BigDecimal

)

