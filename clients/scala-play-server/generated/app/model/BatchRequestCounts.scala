package model

import play.api.libs.json._

/**
  * The request counts for different statuses within the batch.
  * @param total Total number of requests in the batch.
  * @param completed Number of requests that have been completed successfully.
  * @param failed Number of requests that have failed.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class BatchRequestCounts(
  total: Int,
  completed: Int,
  failed: Int
)

object BatchRequestCounts {
  implicit lazy val batchRequestCountsJsonFormat: Format[BatchRequestCounts] = Json.format[BatchRequestCounts]
}

