goog.provide('API.Client.createBatch_request');

/**
 * @record
 */
API.Client.CreateBatchRequest = function() {}

/**
 * The ID of an uploaded file that contains requests for the new batch.  See [upload file](/docs/api-reference/files/create) for how to upload a file.  Your input file must be formatted as a [JSONL file](/docs/api-reference/batch/request-input), and must be uploaded with the purpose `batch`. The file can contain up to 50,000 requests, and can be up to 200 MB in size. 
 * @type {!string}
 * @export
 */
API.Client.CreateBatchRequest.prototype.inputFileId;

/**
 * The endpoint to be used for all requests in the batch. Currently `/v1/chat/completions`, `/v1/embeddings`, and `/v1/completions` are supported. Note that `/v1/embeddings` batches are also restricted to a maximum of 50,000 embedding inputs across all requests in the batch.
 * @type {!string}
 * @export
 */
API.Client.CreateBatchRequest.prototype.endpoint;

/**
 * The time frame within which the batch should be processed. Currently only `24h` is supported.
 * @type {!string}
 * @export
 */
API.Client.CreateBatchRequest.prototype.completionWindow;

/**
 * Optional custom metadata for the batch.
 * @type {!Object<!string, string>}
 * @export
 */
API.Client.CreateBatchRequest.prototype.metadata;

/** @enum {string} */
API.Client.CreateBatchRequest.EndpointEnum = { 
  /v1/chat/completions: '/v1/chat/completions',
  /v1/embeddings: '/v1/embeddings',
  /v1/completions: '/v1/completions',
}
/** @enum {string} */
API.Client.CreateBatchRequest.CompletionWindowEnum = { 
  24h: '24h',
}
