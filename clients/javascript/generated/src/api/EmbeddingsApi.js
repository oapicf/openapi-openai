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
 *
 */


import ApiClient from "../ApiClient";
import CreateEmbeddingRequest from '../model/CreateEmbeddingRequest';
import CreateEmbeddingResponse from '../model/CreateEmbeddingResponse';

/**
* Embeddings service.
* @module api/EmbeddingsApi
* @version 1.0.1-pre.0
*/
export default class EmbeddingsApi {

    /**
    * Constructs a new EmbeddingsApi. 
    * @alias module:api/EmbeddingsApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }


    /**
     * Callback function to receive the result of the createEmbedding operation.
     * @callback module:api/EmbeddingsApi~createEmbeddingCallback
     * @param {String} error Error message, if any.
     * @param {module:model/CreateEmbeddingResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Creates an embedding vector representing the input text.
     * @param {module:model/CreateEmbeddingRequest} createEmbeddingRequest 
     * @param {module:api/EmbeddingsApi~createEmbeddingCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/CreateEmbeddingResponse}
     */
    createEmbedding(createEmbeddingRequest, callback) {
      let postBody = createEmbeddingRequest;
      // verify the required parameter 'createEmbeddingRequest' is set
      if (createEmbeddingRequest === undefined || createEmbeddingRequest === null) {
        throw new Error("Missing the required parameter 'createEmbeddingRequest' when calling createEmbedding");
      }

      let pathParams = {
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['ApiKeyAuth'];
      let contentTypes = ['application/json'];
      let accepts = ['application/json'];
      let returnType = CreateEmbeddingResponse;
      return this.apiClient.callApi(
        '/embeddings', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }


}
