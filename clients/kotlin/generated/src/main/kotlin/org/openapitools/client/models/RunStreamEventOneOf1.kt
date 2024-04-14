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

import org.openapitools.client.models.RunObject

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Occurs when a [run](/docs/api-reference/runs/object) moves to a `queued` status.
 *
 * @param event 
 * @param `data` 
 */


data class RunStreamEventOneOf1 (

    @Json(name = "event")
    val event: RunStreamEventOneOf1.Event,

    @Json(name = "data")
    val `data`: RunObject

) {

    /**
     * 
     *
     * Values: threadPeriodRunPeriodQueued
     */
    @JsonClass(generateAdapter = false)
    enum class Event(val value: kotlin.String) {
        @Json(name = "thread.run.queued") threadPeriodRunPeriodQueued("thread.run.queued");
    }
}

