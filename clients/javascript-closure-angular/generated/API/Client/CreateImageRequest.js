goog.provide('API.Client.CreateImageRequest');

/**
 * @record
 */
API.Client.CreateImageRequest = function() {}

/**
 * A text description of the desired image(s). The maximum length is 1000 characters for `dall-e-2` and 4000 characters for `dall-e-3`.
 * @type {!string}
 * @export
 */
API.Client.CreateImageRequest.prototype.prompt;

/**
 * @type {!API.Client.CreateImageRequest_model}
 * @export
 */
API.Client.CreateImageRequest.prototype.model;

/**
 * The number of images to generate. Must be between 1 and 10. For `dall-e-3`, only `n=1` is supported.
 * @type {!number}
 * @export
 */
API.Client.CreateImageRequest.prototype.n;

/**
 * The quality of the image that will be generated. `hd` creates images with finer details and greater consistency across the image. This param is only supported for `dall-e-3`.
 * @type {!string}
 * @export
 */
API.Client.CreateImageRequest.prototype.quality;

/**
 * The format in which the generated images are returned. Must be one of `url` or `b64_json`. URLs are only valid for 60 minutes after the image has been generated.
 * @type {!string}
 * @export
 */
API.Client.CreateImageRequest.prototype.responseFormat;

/**
 * The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024` for `dall-e-2`. Must be one of `1024x1024`, `1792x1024`, or `1024x1792` for `dall-e-3` models.
 * @type {!string}
 * @export
 */
API.Client.CreateImageRequest.prototype.size;

/**
 * The style of the generated images. Must be one of `vivid` or `natural`. Vivid causes the model to lean towards generating hyper-real and dramatic images. Natural causes the model to produce more natural, less hyper-real looking images. This param is only supported for `dall-e-3`.
 * @type {!string}
 * @export
 */
API.Client.CreateImageRequest.prototype.style;

/**
 * A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 
 * @type {!string}
 * @export
 */
API.Client.CreateImageRequest.prototype.user;

/** @enum {string} */
API.Client.CreateImageRequest.QualityEnum = { 
  standard: 'standard',
  hd: 'hd',
}
/** @enum {string} */
API.Client.CreateImageRequest.ResponseFormatEnum = { 
  url: 'url',
  b64_json: 'b64_json',
}
/** @enum {string} */
API.Client.CreateImageRequest.SizeEnum = { 
  256x256: '256x256',
  512x512: '512x512',
  1024x1024: '1024x1024',
  1792x1024: '1792x1024',
  1024x1792: '1024x1792',
}
/** @enum {string} */
API.Client.CreateImageRequest.StyleEnum = { 
  vivid: 'vivid',
  natural: 'natural',
}
