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

import org.openapitools.client.model.CreateEmbeddingRequest
import org.openapitools.client.model.CreateEmbeddingResponse
import org.openapitools.client.core._
import org.openapitools.client.core.CollectionFormats._
import org.openapitools.client.core.ApiKeyLocations._

object EmbeddingsApi {

  def apply(baseUrl: String = "https://api.openai.com/v1") = new EmbeddingsApi(baseUrl)
}

class EmbeddingsApi(baseUrl: String) {

  /**
   * Expected answers:
   *   code 200 : CreateEmbeddingResponse (OK)
   * 
   * Available security schemes:
   *   ApiKeyAuth (http)
   * 
   * @param createEmbeddingRequest 
   */
  def createEmbedding(createEmbeddingRequest: CreateEmbeddingRequest)(implicit bearerToken: BearerToken): ApiRequest[CreateEmbeddingResponse] =
    ApiRequest[CreateEmbeddingResponse](ApiMethods.POST, baseUrl, "/embeddings", "application/json")
      .withCredentials(bearerToken).withBody(createEmbeddingRequest)
      .withSuccessResponse[CreateEmbeddingResponse](200)
      



}
