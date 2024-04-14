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
 * An object describing the expected output of the model. If `json_object` only `function` type `tools` are allowed to be passed to the Run. If `text` the model can return text or any value needed. 
 *
 * @param type Must be one of `text` or `json_object`.
 */


data class AssistantsApiResponseFormat (

    /* Must be one of `text` or `json_object`. */
    @Json(name = "type")
    val type: AssistantsApiResponseFormat.Type? = Type.text

) {

    /**
     * Must be one of `text` or `json_object`.
     *
     * Values: text,json_object
     */
    @JsonClass(generateAdapter = false)
    enum class Type(val value: kotlin.String) {
        @Json(name = "text") text("text"),
        @Json(name = "json_object") json_object("json_object");
    }
}

