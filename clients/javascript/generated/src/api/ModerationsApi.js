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
import CreateModerationRequest from '../model/CreateModerationRequest';
import CreateModerationResponse from '../model/CreateModerationResponse';

/**
* Moderations service.
* @module api/ModerationsApi
* @version 1.0.1-pre.0
*/
export default class ModerationsApi {

    /**
    * Constructs a new ModerationsApi. 
    * @alias module:api/ModerationsApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }


    /**
     * Callback function to receive the result of the createModeration operation.
     * @callback module:api/ModerationsApi~createModerationCallback
     * @param {String} error Error message, if any.
     * @param {module:model/CreateModerationResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Classifies if text is potentially harmful.
     * @param {module:model/CreateModerationRequest} createModerationRequest 
     * @param {module:api/ModerationsApi~createModerationCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/CreateModerationResponse}
     */
    createModeration(createModerationRequest, callback) {
      let postBody = createModerationRequest;
      // verify the required parameter 'createModerationRequest' is set
      if (createModerationRequest === undefined || createModerationRequest === null) {
        throw new Error("Missing the required parameter 'createModerationRequest' when calling createModeration");
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
      let returnType = CreateModerationResponse;
      return this.apiClient.callApi(
        '/moderations', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }


}
