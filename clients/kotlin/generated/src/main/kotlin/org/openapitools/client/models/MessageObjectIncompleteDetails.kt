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
 * On an incomplete message, details about why the message is incomplete.
 *
 * @param reason The reason the message is incomplete.
 */


data class MessageObjectIncompleteDetails (

    /* The reason the message is incomplete. */
    @Json(name = "reason")
    val reason: MessageObjectIncompleteDetails.Reason

) {

    /**
     * The reason the message is incomplete.
     *
     * Values: content_filter,max_tokens,run_cancelled,run_expired,run_failed
     */
    @JsonClass(generateAdapter = false)
    enum class Reason(val value: kotlin.String) {
        @Json(name = "content_filter") content_filter("content_filter"),
        @Json(name = "max_tokens") max_tokens("max_tokens"),
        @Json(name = "run_cancelled") run_cancelled("run_cancelled"),
        @Json(name = "run_expired") run_expired("run_expired"),
        @Json(name = "run_failed") run_failed("run_failed");
    }

}

