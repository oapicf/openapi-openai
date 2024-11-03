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

import org.openapitools.client.models.ThreadObject

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param `object` 
 * @param `data` 
 * @param firstId 
 * @param lastId 
 * @param hasMore 
 */


data class ListThreadsResponse (

    @Json(name = "object")
    val `object`: kotlin.String,

    @Json(name = "data")
    val `data`: kotlin.collections.List<ThreadObject>,

    @Json(name = "first_id")
    val firstId: kotlin.String,

    @Json(name = "last_id")
    val lastId: kotlin.String,

    @Json(name = "has_more")
    val hasMore: kotlin.Boolean

) {


}

