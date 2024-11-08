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
import CreateCompletionRequest from '../model/CreateCompletionRequest';
import CreateCompletionResponse from '../model/CreateCompletionResponse';

/**
* Completions service.
* @module api/CompletionsApi
* @version 1.1.1-pre.0
*/
export default class CompletionsApi {

    /**
    * Constructs a new CompletionsApi. 
    * @alias module:api/CompletionsApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }


    /**
     * Callback function to receive the result of the createCompletion operation.
     * @callback module:api/CompletionsApi~createCompletionCallback
     * @param {String} error Error message, if any.
     * @param {module:model/CreateCompletionResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Creates a completion for the provided prompt and parameters.
     * @param {module:model/CreateCompletionRequest} createCompletionRequest 
     * @param {module:api/CompletionsApi~createCompletionCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/CreateCompletionResponse}
     */
    createCompletion(createCompletionRequest, callback) {
      let postBody = createCompletionRequest;
      // verify the required parameter 'createCompletionRequest' is set
      if (createCompletionRequest === undefined || createCompletionRequest === null) {
        throw new Error("Missing the required parameter 'createCompletionRequest' when calling createCompletion");
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
      let returnType = CreateCompletionResponse;
      return this.apiClient.callApi(
        '/completions', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }


}
