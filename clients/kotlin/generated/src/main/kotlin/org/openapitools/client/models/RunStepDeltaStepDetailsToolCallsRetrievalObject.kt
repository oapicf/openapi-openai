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
 * @param index The index of the tool call in the tool calls array.
 * @param type The type of tool call. This is always going to be `retrieval` for this type of tool call.
 * @param id The ID of the tool call object.
 * @param retrieval For now, this is always going to be an empty object.
 */


data class RunStepDeltaStepDetailsToolCallsRetrievalObject (

    /* The index of the tool call in the tool calls array. */
    @Json(name = "index")
    val index: kotlin.Int,

    /* The type of tool call. This is always going to be `retrieval` for this type of tool call. */
    @Json(name = "type")
    val type: RunStepDeltaStepDetailsToolCallsRetrievalObject.Type,

    /* The ID of the tool call object. */
    @Json(name = "id")
    val id: kotlin.String? = null,

    /* For now, this is always going to be an empty object. */
    @Json(name = "retrieval")
    val retrieval: kotlin.Any? = null

) {

    /**
     * The type of tool call. This is always going to be `retrieval` for this type of tool call.
     *
     * Values: retrieval
     */
    @JsonClass(generateAdapter = false)
    enum class Type(val value: kotlin.String) {
        @Json(name = "retrieval") retrieval("retrieval");
    }

}

