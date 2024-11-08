/**
 * @fileoverview AUTOMATICALLY GENERATED service for API.Client.EmbeddingsApi.
 * Do not edit this file by hand or your changes will be lost next time it is
 * generated.
 *
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 * Version: 2.0.0
* Generator version: 7.9.0
 * Generated by: org.openapitools.codegen.languages.JavascriptClosureAngularClientCodegen
 */
/**
 * @license MIT
 * https://github.com/openai/openai-openapi/blob/master/LICENSE
 */

goog.provide('API.Client.EmbeddingsApi');

goog.require('API.Client.CreateEmbeddingRequest');
goog.require('API.Client.CreateEmbeddingResponse');

/**
 * @constructor
 * @param {!angular.$http} $http
 * @param {!Object} $httpParamSerializer
 * @param {!angular.$injector} $injector
 * @struct
 */
API.Client.EmbeddingsApi = function($http, $httpParamSerializer, $injector) {
  /** @private {!string} */
  this.basePath_ = $injector.has('EmbeddingsApiBasePath') ?
                   /** @type {!string} */ ($injector.get('EmbeddingsApiBasePath')) :
                   'https://api.openai.com/v1';

  /** @private {!Object<string, string>} */
  this.defaultHeaders_ = $injector.has('EmbeddingsApiDefaultHeaders') ?
                   /** @type {!Object<string, string>} */ (
                       $injector.get('EmbeddingsApiDefaultHeaders')) :
                   {};

  /** @private {!angular.$http} */
  this.http_ = $http;

  /** @package {!Object} */
  this.httpParamSerializer = $injector.get('$httpParamSerializer');
}
API.Client.EmbeddingsApi.$inject = ['$http', '$httpParamSerializer', '$injector'];

/**
 * Creates an embedding vector representing the input text.
 * 
 * @param {!CreateEmbeddingRequest} createEmbeddingRequest 
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!API.Client.CreateEmbeddingResponse>}
 */
API.Client.EmbeddingsApi.prototype.createEmbedding = function(createEmbeddingRequest, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/embeddings';

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  // verify required parameter 'createEmbeddingRequest' is set
  if (!createEmbeddingRequest) {
    throw new Error('Missing required parameter createEmbeddingRequest when calling createEmbedding');
  }
  /** @type {!Object} */
  var httpRequestParams = {
    method: 'POST',
    url: path,
    json: true,
    data: createEmbeddingRequest,
        params: queryParameters,
    headers: headerParams
  };

  if (opt_extraHttpRequestParams) {
    httpRequestParams = angular.extend(httpRequestParams, opt_extraHttpRequestParams);
  }

  return (/** @type {?} */ (this.http_))(httpRequestParams);
}
