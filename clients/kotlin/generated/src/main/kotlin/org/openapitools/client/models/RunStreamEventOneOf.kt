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
 * Occurs when a new [run](/docs/api-reference/runs/object) is created.
 *
 * @param event 
 * @param `data` 
 */


data class RunStreamEventOneOf (

    @Json(name = "event")
    val event: RunStreamEventOneOf.Event,

    @Json(name = "data")
    val `data`: RunObject

) {

    /**
     * 
     *
     * Values: threadPeriodRunPeriodCreated
     */
    @JsonClass(generateAdapter = false)
    enum class Event(val value: kotlin.String) {
        @Json(name = "thread.run.created") threadPeriodRunPeriodCreated("thread.run.created");
    }

}

