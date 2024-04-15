/**
 * OpenAI API
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.client.model


  /**
   * The role of the author of a message
   */

object ChatCompletionRole extends Enumeration {
    type ChatCompletionRole = ChatCompletionRole.Value
    val System = Value("system")
    val User = Value("user")
    val Assistant = Value("assistant")
    val Tool = Value("tool")
    val Function = Value("function")
}