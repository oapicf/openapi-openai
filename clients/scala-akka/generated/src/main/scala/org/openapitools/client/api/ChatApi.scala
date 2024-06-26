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
package org.openapitools.client.api

import org.openapitools.client.model.CreateChatCompletionRequest
import org.openapitools.client.model.CreateChatCompletionResponse
import org.openapitools.client.core._
import org.openapitools.client.core.CollectionFormats._
import org.openapitools.client.core.ApiKeyLocations._

object ChatApi {

  def apply(baseUrl: String = "https://api.openai.com/v1") = new ChatApi(baseUrl)
}

class ChatApi(baseUrl: String) {

  /**
   * Expected answers:
   *   code 200 : CreateChatCompletionResponse (OK)
   * 
   * Available security schemes:
   *   ApiKeyAuth (http)
   * 
   * @param createChatCompletionRequest 
   */
  def createChatCompletion(createChatCompletionRequest: CreateChatCompletionRequest)(implicit bearerToken: BearerToken): ApiRequest[CreateChatCompletionResponse] =
    ApiRequest[CreateChatCompletionResponse](ApiMethods.POST, baseUrl, "/chat/completions", "application/json")
      .withCredentials(bearerToken).withBody(createChatCompletionRequest)
      .withSuccessResponse[CreateChatCompletionResponse](200)
      



}

