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
 * @param messageId The ID of the message that was created by this run step.
 */


data class RunStepDetailsMessageCreationObjectMessageCreation (

    /* The ID of the message that was created by this run step. */
    @Json(name = "message_id")
    val messageId: kotlin.String

)
