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

import org.openapitools.client.models.Error

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Occurs when an [error](/docs/guides/error-codes/api-errors) occurs. This can happen due to an internal server error or a timeout.
 *
 * @param event 
 * @param `data` 
 */


data class ErrorEvent (

    @Json(name = "event")
    val event: ErrorEvent.Event,

    @Json(name = "data")
    val `data`: Error

) {

    /**
     * 
     *
     * Values: error
     */
    @JsonClass(generateAdapter = false)
    enum class Event(val value: kotlin.String) {
        @Json(name = "error") error("error");
    }
}

