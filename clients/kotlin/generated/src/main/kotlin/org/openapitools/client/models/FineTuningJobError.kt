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
 * For fine-tuning jobs that have `failed`, this will contain more information on the cause of the failure.
 *
 * @param code A machine-readable error code.
 * @param message A human-readable error message.
 * @param `param` The parameter that was invalid, usually `training_file` or `validation_file`. This field will be null if the failure was not parameter-specific.
 */


data class FineTuningJobError (

    /* A machine-readable error code. */
    @Json(name = "code")
    val code: kotlin.String,

    /* A human-readable error message. */
    @Json(name = "message")
    val message: kotlin.String,

    /* The parameter that was invalid, usually `training_file` or `validation_file`. This field will be null if the failure was not parameter-specific. */
    @Json(name = "param")
    val `param`: kotlin.String?

)
