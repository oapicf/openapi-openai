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

import org.openapitools.client.model.DeleteModelResponse
import org.openapitools.client.model.ListModelsResponse
import org.openapitools.client.model.Model
import org.openapitools.client.core.JsonSupport._
import sttp.client3._
import sttp.model.Method

object ModelsApi {
  def apply(baseUrl: String = "https://api.openai.com/v1") = new ModelsApi(baseUrl)
}

class ModelsApi(baseUrl: String) {

  /**
   * Expected answers:
   *   code 200 : DeleteModelResponse (OK)
   * 
   * Available security schemes:
   *   ApiKeyAuth (http)
   * 
   * @param model The model to delete
   */
  def deleteModel(bearerToken: String)(model: String
): Request[Either[ResponseException[String, Exception], DeleteModelResponse], Any] =
    basicRequest
      .method(Method.DELETE, uri"$baseUrl/models/${model}")
      .contentType("application/json")
      .auth.bearer(bearerToken)
      .response(asJson[DeleteModelResponse])

  /**
   * Expected answers:
   *   code 200 : ListModelsResponse (OK)
   * 
   * Available security schemes:
   *   ApiKeyAuth (http)
   */
  def listModels(bearerToken: String)(
): Request[Either[ResponseException[String, Exception], ListModelsResponse], Any] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/models")
      .contentType("application/json")
      .auth.bearer(bearerToken)
      .response(asJson[ListModelsResponse])

  /**
   * Expected answers:
   *   code 200 : Model (OK)
   * 
   * Available security schemes:
   *   ApiKeyAuth (http)
   * 
   * @param model The ID of the model to use for this request
   */
  def retrieveModel(bearerToken: String)(model: String
): Request[Either[ResponseException[String, Exception], Model], Any] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/models/${model}")
      .contentType("application/json")
      .auth.bearer(bearerToken)
      .response(asJson[Model])

}
