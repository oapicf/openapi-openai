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

import org.openapitools.client.models.MessageObject

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Occurs when a [message](/docs/api-reference/messages/object) is completed.
 *
 * @param event 
 * @param `data` 
 */


data class MessageStreamEventOneOf3 (

    @Json(name = "event")
    val event: MessageStreamEventOneOf3.Event,

    @Json(name = "data")
    val `data`: MessageObject

) {

    /**
     * 
     *
     * Values: threadPeriodMessagePeriodCompleted
     */
    @JsonClass(generateAdapter = false)
    enum class Event(val value: kotlin.String) {
        @Json(name = "thread.message.completed") threadPeriodMessagePeriodCompleted("thread.message.completed");
    }

}

