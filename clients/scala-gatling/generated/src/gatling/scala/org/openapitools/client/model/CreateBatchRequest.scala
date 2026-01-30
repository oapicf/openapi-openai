
package org.openapitools.client.model


case class CreateBatchRequest (
    /* The ID of an uploaded file that contains requests for the new batch.  See [upload file](/docs/api-reference/files/create) for how to upload a file.  Your input file must be formatted as a [JSONL file](/docs/api-reference/batch/request-input), and must be uploaded with the purpose `batch`. The file can contain up to 50,000 requests, and can be up to 200 MB in size.  */
    _inputFileId: String,
    /* The endpoint to be used for all requests in the batch. Currently `/v1/chat/completions`, `/v1/embeddings`, and `/v1/completions` are supported. Note that `/v1/embeddings` batches are also restricted to a maximum of 50,000 embedding inputs across all requests in the batch. */
    _endpoint: String,
    /* The time frame within which the batch should be processed. Currently only `24h` is supported. */
    _completionWindow: String,
    /* Optional custom metadata for the batch. */
    _metadata: Option[Map[String, String]]
)
object CreateBatchRequest {
    def toStringBody(var_inputFileId: Object, var_endpoint: Object, var_completionWindow: Object, var_metadata: Object) =
        s"""
        | {
        | "inputFileId":$var_inputFileId,"endpoint":$var_endpoint,"completionWindow":$var_completionWindow,"metadata":$var_metadata
        | }
        """.stripMargin
}
