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
 * The definition of the function that was called.
 *
 * @param name The name of the function.
 * @param arguments The arguments passed to the function.
 * @param output The output of the function. This will be `null` if the outputs have not been [submitted](/docs/api-reference/runs/submitToolOutputs) yet.
 */


data class RunStepDetailsToolCallsFunctionObjectFunction (

    /* The name of the function. */
    @Json(name = "name")
    val name: kotlin.String,

    /* The arguments passed to the function. */
    @Json(name = "arguments")
    val arguments: kotlin.String,

    /* The output of the function. This will be `null` if the outputs have not been [submitted](/docs/api-reference/runs/submitToolOutputs) yet. */
    @Json(name = "output")
    val output: kotlin.String?

)

