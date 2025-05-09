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

import org.openapitools.client.models.RunStepDetailsMessageCreationObjectMessageCreation

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Details of the message creation by the run step.
 *
 * @param type Always `message_creation`.
 * @param messageCreation 
 */


data class RunStepDetailsMessageCreationObject (

    /* Always `message_creation`. */
    @Json(name = "type")
    val type: RunStepDetailsMessageCreationObject.Type,

    @Json(name = "message_creation")
    val messageCreation: RunStepDetailsMessageCreationObjectMessageCreation

) {

    /**
     * Always `message_creation`.
     *
     * Values: message_creation
     */
    @JsonClass(generateAdapter = false)
    enum class Type(val value: kotlin.String) {
        @Json(name = "message_creation") message_creation("message_creation");
    }

}

