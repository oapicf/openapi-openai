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
 * @param prompt A text description of the desired image(s). The maximum length is 1000 characters.
 * @param n The number of images to generate. Must be between 1 and 10.
 * @param propertySize The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`.
 * @param responseFormat The format in which the generated images are returned. Must be one of `url` or `b64_json`.
 * @param user A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 
 */


data class CreateImageRequest (

    /* A text description of the desired image(s). The maximum length is 1000 characters. */
    @Json(name = "prompt")
    val prompt: kotlin.String,

    /* The number of images to generate. Must be between 1 and 10. */
    @Json(name = "n")
    val n: kotlin.Int? = 1,

    /* The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`. */
    @Json(name = "size")
    val propertySize: CreateImageRequest.PropertySize? = PropertySize._1024x1024,

    /* The format in which the generated images are returned. Must be one of `url` or `b64_json`. */
    @Json(name = "response_format")
    val responseFormat: CreateImageRequest.ResponseFormat? = ResponseFormat.url,

    /* A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  */
    @Json(name = "user")
    val user: kotlin.String? = null

) {

    /**
     * The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`.
     *
     * Values: _256x256,_512x512,_1024x1024
     */
    @JsonClass(generateAdapter = false)
    enum class PropertySize(val value: kotlin.String) {
        @Json(name = "256x256") _256x256("256x256"),
        @Json(name = "512x512") _512x512("512x512"),
        @Json(name = "1024x1024") _1024x1024("1024x1024");
    }
    /**
     * The format in which the generated images are returned. Must be one of `url` or `b64_json`.
     *
     * Values: url,b64_json
     */
    @JsonClass(generateAdapter = false)
    enum class ResponseFormat(val value: kotlin.String) {
        @Json(name = "url") url("url"),
        @Json(name = "b64_json") b64_json("b64_json");
    }
}

