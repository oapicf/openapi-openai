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
 * @param type The type of tool being defined: `retrieval`
 */


data class AssistantToolsRetrieval (

    /* The type of tool being defined: `retrieval` */
    @Json(name = "type")
    val type: AssistantToolsRetrieval.Type

) {

    /**
     * The type of tool being defined: `retrieval`
     *
     * Values: retrieval
     */
    @JsonClass(generateAdapter = false)
    enum class Type(val value: kotlin.String) {
        @Json(name = "retrieval") retrieval("retrieval");
    }
}

