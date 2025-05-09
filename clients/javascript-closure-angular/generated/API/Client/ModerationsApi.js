/**
 * @fileoverview AUTOMATICALLY GENERATED service for API.Client.ModerationsApi.
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

goog.provide('API.Client.ModerationsApi');

goog.require('API.Client.CreateModerationRequest');
goog.require('API.Client.CreateModerationResponse');

/**
 * @constructor
 * @param {!angular.$http} $http
 * @param {!Object} $httpParamSerializer
 * @param {!angular.$injector} $injector
 * @struct
 */
API.Client.ModerationsApi = function($http, $httpParamSerializer, $injector) {
  /** @private {!string} */
  this.basePath_ = $injector.has('ModerationsApiBasePath') ?
                   /** @type {!string} */ ($injector.get('ModerationsApiBasePath')) :
                   'https://api.openai.com/v1';

  /** @private {!Object<string, string>} */
  this.defaultHeaders_ = $injector.has('ModerationsApiDefaultHeaders') ?
                   /** @type {!Object<string, string>} */ (
                       $injector.get('ModerationsApiDefaultHeaders')) :
                   {};

  /** @private {!angular.$http} */
  this.http_ = $http;

  /** @package {!Object} */
  this.httpParamSerializer = $injector.get('$httpParamSerializer');
}
API.Client.ModerationsApi.$inject = ['$http', '$httpParamSerializer', '$injector'];

/**
 * Classifies if text is potentially harmful.
 * 
 * @param {!CreateModerationRequest} createModerationRequest 
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!API.Client.CreateModerationResponse>}
 */
API.Client.ModerationsApi.prototype.createModeration = function(createModerationRequest, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/moderations';

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  // verify required parameter 'createModerationRequest' is set
  if (!createModerationRequest) {
    throw new Error('Missing required parameter createModerationRequest when calling createModeration');
  }
  /** @type {!Object} */
  var httpRequestParams = {
    method: 'POST',
    url: path,
    json: true,
    data: createModerationRequest,
        params: queryParameters,
    headers: headerParams
  };

  if (opt_extraHttpRequestParams) {
    httpRequestParams = angular.extend(httpRequestParams, opt_extraHttpRequestParams);
  }

  return (/** @type {?} */ (this.http_))(httpRequestParams);
}
