/**
 * @fileoverview AUTOMATICALLY GENERATED service for API.Client.ImagesApi.
 * Do not edit this file by hand or your changes will be lost next time it is
 * generated.
 *
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 * Version: 2.0.0
* Generator version: 7.4.0
 * Generated by: org.openapitools.codegen.languages.JavascriptClosureAngularClientCodegen
 */
/**
 * @license MIT
 * https://github.com/openai/openai-openapi/blob/master/LICENSE
 */

goog.provide('API.Client.ImagesApi');

goog.require('API.Client.CreateImageEditRequest_model');
goog.require('API.Client.CreateImageRequest');
goog.require('API.Client.ImagesResponse');

/**
 * @constructor
 * @param {!angular.$http} $http
 * @param {!Object} $httpParamSerializer
 * @param {!angular.$injector} $injector
 * @struct
 */
API.Client.ImagesApi = function($http, $httpParamSerializer, $injector) {
  /** @private {!string} */
  this.basePath_ = $injector.has('ImagesApiBasePath') ?
                   /** @type {!string} */ ($injector.get('ImagesApiBasePath')) :
                   'https://api.openai.com/v1';

  /** @private {!Object<string, string>} */
  this.defaultHeaders_ = $injector.has('ImagesApiDefaultHeaders') ?
                   /** @type {!Object<string, string>} */ (
                       $injector.get('ImagesApiDefaultHeaders')) :
                   {};

  /** @private {!angular.$http} */
  this.http_ = $http;

  /** @package {!Object} */
  this.httpParamSerializer = $injector.get('$httpParamSerializer');
}
API.Client.ImagesApi.$inject = ['$http', '$httpParamSerializer', '$injector'];

/**
 * Creates an image given a prompt.
 * 
 * @param {!CreateImageRequest} createImageRequest 
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!API.Client.ImagesResponse>}
 */
API.Client.ImagesApi.prototype.createImage = function(createImageRequest, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/images/generations';

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  // verify required parameter 'createImageRequest' is set
  if (!createImageRequest) {
    throw new Error('Missing required parameter createImageRequest when calling createImage');
  }
  /** @type {!Object} */
  var httpRequestParams = {
    method: 'POST',
    url: path,
    json: true,
    data: createImageRequest,
        params: queryParameters,
    headers: headerParams
  };

  if (opt_extraHttpRequestParams) {
    httpRequestParams = angular.extend(httpRequestParams, opt_extraHttpRequestParams);
  }

  return (/** @type {?} */ (this.http_))(httpRequestParams);
}

/**
 * Creates an edited or extended image given an original image and a prompt.
 * 
 * @param {!Object} image The image to edit. Must be a valid PNG file, less than 4MB, and square. If mask is not provided, image must have transparency, which will be used as the mask.
 * @param {!string} prompt A text description of the desired image(s). The maximum length is 1000 characters.
 * @param {!Object=} opt_mask An additional image whose fully transparent areas (e.g. where alpha is zero) indicate where &#x60;image&#x60; should be edited. Must be a valid PNG file, less than 4MB, and have the same dimensions as &#x60;image&#x60;.
 * @param {!API.Client.CreateImageEditRequest_model=} opt_model 
 * @param {!number=} opt_n The number of images to generate. Must be between 1 and 10.
 * @param {!string=} opt_size The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60;.
 * @param {!string=} opt_responseFormat The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;. URLs are only valid for 60 minutes after the image has been generated.
 * @param {!string=} opt_user A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!API.Client.ImagesResponse>}
 */
API.Client.ImagesApi.prototype.createImageEdit = function(image, prompt, opt_mask, opt_model, opt_n, opt_size, opt_responseFormat, opt_user, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/images/edits';

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  /** @type {!Object} */
  var formParams = {};

  // verify required parameter 'image' is set
  if (!image) {
    throw new Error('Missing required parameter image when calling createImageEdit');
  }
  // verify required parameter 'prompt' is set
  if (!prompt) {
    throw new Error('Missing required parameter prompt when calling createImageEdit');
  }
  headerParams['Content-Type'] = 'application/x-www-form-urlencoded';

  formParams['image'] = image;

  formParams['prompt'] = prompt;

  formParams['mask'] = opt_mask;

  formParams['model'] = opt_model;

  formParams['n'] = opt_n;

  formParams['size'] = opt_size;

  formParams['response_format'] = opt_responseFormat;

  formParams['user'] = opt_user;

  /** @type {!Object} */
  var httpRequestParams = {
    method: 'POST',
    url: path,
    json: false,
        data: this.httpParamSerializer(formParams),
    params: queryParameters,
    headers: headerParams
  };

  if (opt_extraHttpRequestParams) {
    httpRequestParams = angular.extend(httpRequestParams, opt_extraHttpRequestParams);
  }

  return (/** @type {?} */ (this.http_))(httpRequestParams);
}

/**
 * Creates a variation of a given image.
 * 
 * @param {!Object} image The image to use as the basis for the variation(s). Must be a valid PNG file, less than 4MB, and square.
 * @param {!API.Client.CreateImageEditRequest_model=} opt_model 
 * @param {!number=} opt_n The number of images to generate. Must be between 1 and 10. For &#x60;dall-e-3&#x60;, only &#x60;n&#x3D;1&#x60; is supported.
 * @param {!string=} opt_responseFormat The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;. URLs are only valid for 60 minutes after the image has been generated.
 * @param {!string=} opt_size The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60;.
 * @param {!string=} opt_user A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!API.Client.ImagesResponse>}
 */
API.Client.ImagesApi.prototype.createImageVariation = function(image, opt_model, opt_n, opt_responseFormat, opt_size, opt_user, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/images/variations';

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  /** @type {!Object} */
  var formParams = {};

  // verify required parameter 'image' is set
  if (!image) {
    throw new Error('Missing required parameter image when calling createImageVariation');
  }
  headerParams['Content-Type'] = 'application/x-www-form-urlencoded';

  formParams['image'] = image;

  formParams['model'] = opt_model;

  formParams['n'] = opt_n;

  formParams['response_format'] = opt_responseFormat;

  formParams['size'] = opt_size;

  formParams['user'] = opt_user;

  /** @type {!Object} */
  var httpRequestParams = {
    method: 'POST',
    url: path,
    json: false,
        data: this.httpParamSerializer(formParams),
    params: queryParameters,
    headers: headerParams
  };

  if (opt_extraHttpRequestParams) {
    httpRequestParams = angular.extend(httpRequestParams, opt_extraHttpRequestParams);
  }

  return (/** @type {?} */ (this.http_))(httpRequestParams);
}