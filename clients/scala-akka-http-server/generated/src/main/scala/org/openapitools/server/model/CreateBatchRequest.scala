package org.openapitools.server.model


/**
 * @param inputFileId The ID of an uploaded file that contains requests for the new batch.  See [upload file](/docs/api-reference/files/create) for how to upload a file.  Your input file must be formatted as a [JSONL file](/docs/api-reference/batch/request-input), and must be uploaded with the purpose `batch`. The file can contain up to 50,000 requests, and can be up to 200 MB in size.  for example: ''null''
 * @param endpoint The endpoint to be used for all requests in the batch. Currently `/v1/chat/completions`, `/v1/embeddings`, and `/v1/completions` are supported. Note that `/v1/embeddings` batches are also restricted to a maximum of 50,000 embedding inputs across all requests in the batch. for example: ''null''
 * @param completionWindow The time frame within which the batch should be processed. Currently only `24h` is supported. for example: ''null''
 * @param metadata Optional custom metadata for the batch. for example: ''null''
*/
final case class CreateBatchRequest (
  inputFileId: String,
  endpoint: String,
  completionWindow: String,
  metadata: Option[Map[String, String]] = None
)

