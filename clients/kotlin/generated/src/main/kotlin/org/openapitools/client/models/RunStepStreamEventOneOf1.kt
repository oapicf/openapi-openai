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

import org.openapitools.client.models.RunStepObject

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Occurs when a [run step](/docs/api-reference/runs/step-object) moves to an `in_progress` state.
 *
 * @param event 
 * @param `data` 
 */


data class RunStepStreamEventOneOf1 (

    @Json(name = "event")
    val event: RunStepStreamEventOneOf1.Event,

    @Json(name = "data")
    val `data`: RunStepObject

) {

    /**
     * 
     *
     * Values: threadPeriodRunPeriodStepPeriodIn_progress
     */
    @JsonClass(generateAdapter = false)
    enum class Event(val value: kotlin.String) {
        @Json(name = "thread.run.step.in_progress") threadPeriodRunPeriodStepPeriodIn_progress("thread.run.step.in_progress");
    }

}

