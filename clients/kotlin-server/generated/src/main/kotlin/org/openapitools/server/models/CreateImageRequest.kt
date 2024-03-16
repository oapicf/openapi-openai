/**
* OpenAI API
* APIs for sampling from and fine-tuning language models
*
* The version of the OpenAPI document: 2.0.0
* Contact: blah+oapicf@cliffano.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.server.models


/**
 * 
 * @param prompt A text description of the desired image(s). The maximum length is 1000 characters.
 * @param n The number of images to generate. Must be between 1 and 10.
 * @param propertySize The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`.
 * @param responseFormat The format in which the generated images are returned. Must be one of `url` or `b64_json`.
 * @param user A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 
 */
data class CreateImageRequest(
    /* A text description of the desired image(s). The maximum length is 1000 characters. */
    val prompt: kotlin.String,
    /* The number of images to generate. Must be between 1 and 10. */
    val n: kotlin.Int? = 1,
    /* The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`. */
    val propertySize: CreateImageRequest.PropertySize? = PropertySize._1024x1024,
    /* The format in which the generated images are returned. Must be one of `url` or `b64_json`. */
    val responseFormat: CreateImageRequest.ResponseFormat? = ResponseFormat.url,
    /* A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  */
    val user: kotlin.String? = null
) 
{
    /**
    * The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`.
    * Values: _256x256,_512x512,_1024x1024
    */
    enum class PropertySize(val value: kotlin.String){
        _256x256("256x256"),
        _512x512("512x512"),
        _1024x1024("1024x1024");
    }
    /**
    * The format in which the generated images are returned. Must be one of `url` or `b64_json`.
    * Values: url,b64_json
    */
    enum class ResponseFormat(val value: kotlin.String){
        url("url"),
        b64_json("b64_json");
    }
}

