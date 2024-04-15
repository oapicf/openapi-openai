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
 * Occurs when a [run step](/docs/api-reference/runs/step-object) expires.
 *
 * @param event 
 * @param `data` 
 */


data class RunStepStreamEventOneOf6 (

    @Json(name = "event")
    val event: RunStepStreamEventOneOf6.Event,

    @Json(name = "data")
    val `data`: RunStepObject

) {

    /**
     * 
     *
     * Values: threadPeriodRunPeriodStepPeriodExpired
     */
    @JsonClass(generateAdapter = false)
    enum class Event(val value: kotlin.String) {
        @Json(name = "thread.run.step.expired") threadPeriodRunPeriodStepPeriodExpired("thread.run.step.expired");
    }
}
