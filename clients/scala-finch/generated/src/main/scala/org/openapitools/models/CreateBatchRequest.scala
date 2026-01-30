package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param inputUnderscorefileUnderscoreid The ID of an uploaded file that contains requests for the new batch.  See [upload file](/docs/api-reference/files/create) for how to upload a file.  Your input file must be formatted as a [JSONL file](/docs/api-reference/batch/request-input), and must be uploaded with the purpose `batch`. The file can contain up to 50,000 requests, and can be up to 200 MB in size. 
 * @param endpoint The endpoint to be used for all requests in the batch. Currently `/v1/chat/completions`, `/v1/embeddings`, and `/v1/completions` are supported. Note that `/v1/embeddings` batches are also restricted to a maximum of 50,000 embedding inputs across all requests in the batch.
 * @param completionUnderscorewindow The time frame within which the batch should be processed. Currently only `24h` is supported.
 * @param metadata Optional custom metadata for the batch.
 */
case class CreateBatchRequest(inputUnderscorefileUnderscoreid: String,
                endpoint: String,
                completionUnderscorewindow: String,
                metadata: Option[Map[String, String]]
                )

object CreateBatchRequest {
    /**
     * Creates the codec for converting CreateBatchRequest from and to JSON.
     */
    implicit val decoder: Decoder[CreateBatchRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[CreateBatchRequest] = deriveEncoder
}
