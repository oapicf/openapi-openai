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
import DeleteModelResponse from '../model/DeleteModelResponse';
import ListModelsResponse from '../model/ListModelsResponse';
import Model from '../model/Model';

/**
* Models service.
* @module api/ModelsApi
* @version 1.0.1-pre.0
*/
export default class ModelsApi {

    /**
    * Constructs a new ModelsApi. 
    * @alias module:api/ModelsApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }


    /**
     * Callback function to receive the result of the deleteModel operation.
     * @callback module:api/ModelsApi~deleteModelCallback
     * @param {String} error Error message, if any.
     * @param {module:model/DeleteModelResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Delete a fine-tuned model. You must have the Owner role in your organization to delete a model.
     * @param {String} model The model to delete
     * @param {module:api/ModelsApi~deleteModelCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/DeleteModelResponse}
     */
    deleteModel(model, callback) {
      let postBody = null;
      // verify the required parameter 'model' is set
      if (model === undefined || model === null) {
        throw new Error("Missing the required parameter 'model' when calling deleteModel");
      }

      let pathParams = {
        'model': model
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['ApiKeyAuth'];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = DeleteModelResponse;
      return this.apiClient.callApi(
        '/models/{model}', 'DELETE',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the listModels operation.
     * @callback module:api/ModelsApi~listModelsCallback
     * @param {String} error Error message, if any.
     * @param {module:model/ListModelsResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Lists the currently available models, and provides basic information about each one such as the owner and availability.
     * @param {module:api/ModelsApi~listModelsCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/ListModelsResponse}
     */
    listModels(callback) {
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['ApiKeyAuth'];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = ListModelsResponse;
      return this.apiClient.callApi(
        '/models', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the retrieveModel operation.
     * @callback module:api/ModelsApi~retrieveModelCallback
     * @param {String} error Error message, if any.
     * @param {module:model/Model} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Retrieves a model instance, providing basic information about the model such as the owner and permissioning.
     * @param {String} model The ID of the model to use for this request
     * @param {module:api/ModelsApi~retrieveModelCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/Model}
     */
    retrieveModel(model, callback) {
      let postBody = null;
      // verify the required parameter 'model' is set
      if (model === undefined || model === null) {
        throw new Error("Missing the required parameter 'model' when calling retrieveModel");
      }

      let pathParams = {
        'model': model
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['ApiKeyAuth'];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = Model;
      return this.apiClient.callApi(
        '/models/{model}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }


}