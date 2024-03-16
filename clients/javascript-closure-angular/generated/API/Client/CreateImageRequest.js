goog.provide('API.Client.CreateImageRequest');

/**
 * @record
 */
API.Client.CreateImageRequest = function() {}

/**
 * A text description of the desired image(s). The maximum length is 1000 characters.
 * @type {!string}
 * @export
 */
API.Client.CreateImageRequest.prototype.prompt;

/**
 * The number of images to generate. Must be between 1 and 10.
 * @type {!number}
 * @export
 */
API.Client.CreateImageRequest.prototype.n;

/**
 * The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`.
 * @type {!string}
 * @export
 */
API.Client.CreateImageRequest.prototype.size;

/**
 * The format in which the generated images are returned. Must be one of `url` or `b64_json`.
 * @type {!string}
 * @export
 */
API.Client.CreateImageRequest.prototype.responseFormat;

/**
 * A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 
 * @type {!string}
 * @export
 */
API.Client.CreateImageRequest.prototype.user;

/** @enum {string} */
API.Client.CreateImageRequest.SizeEnum = { 
  256x256: '256x256',
  512x512: '512x512',
  1024x1024: '1024x1024',
}
/** @enum {string} */
API.Client.CreateImageRequest.ResponseFormatEnum = { 
  url: 'url',
  b64_json: 'b64_json',
}
