package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for createBatch_request.
  * @param inputFileId The ID of an uploaded file that contains requests for the new batch.  See [upload file](/docs/api-reference/files/create) for how to upload a file.  Your input file must be formatted as a [JSONL file](/docs/api-reference/batch/request-input), and must be uploaded with the purpose `batch`. The file can contain up to 50,000 requests, and can be up to 200 MB in size. 
  * @param endpoint The endpoint to be used for all requests in the batch. Currently `/v1/chat/completions`, `/v1/embeddings`, and `/v1/completions` are supported. Note that `/v1/embeddings` batches are also restricted to a maximum of 50,000 embedding inputs across all requests in the batch.
  * @param completionWindow The time frame within which the batch should be processed. Currently only `24h` is supported.
  * @param metadata Optional custom metadata for the batch.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CreateBatchRequest(
  inputFileId: String,
  endpoint: CreateBatchRequest.Endpoint.Value,
  completionWindow: CreateBatchRequest.CompletionWindow.Value,
  metadata: Option[Map[String, String]],
)

object CreateBatchRequest {
  implicit lazy val createBatchRequestJsonFormat: Format[CreateBatchRequest] = Json.format[CreateBatchRequest]

  // noinspection TypeAnnotation
  object Endpoint extends Enumeration {
    val V1ChatCompletions = Value("/v1/chat/completions")
    val V1Embeddings = Value("/v1/embeddings")
    val V1Completions = Value("/v1/completions")

    type Endpoint = Value
    implicit lazy val EndpointJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }

  // noinspection TypeAnnotation
  object CompletionWindow extends Enumeration {
    val _24h = Value("24h")

    type CompletionWindow = Value
    implicit lazy val CompletionWindowJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

