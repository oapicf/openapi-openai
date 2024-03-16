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

import org.openapitools.client.models.CreateModerationResponseResultsInner

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param id 
 * @param model 
 * @param results 
 */


data class CreateModerationResponse (

    @Json(name = "id")
    val id: kotlin.String,

    @Json(name = "model")
    val model: kotlin.String,

    @Json(name = "results")
    val results: kotlin.collections.List<CreateModerationResponseResultsInner>

)

