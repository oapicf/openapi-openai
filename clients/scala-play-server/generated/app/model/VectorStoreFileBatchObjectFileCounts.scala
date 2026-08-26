package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for VectorStoreFileBatchObject_file_counts.
  * @param inProgress The number of files that are currently being processed.
  * @param completed The number of files that have been processed.
  * @param failed The number of files that have failed to process.
  * @param cancelled The number of files that where cancelled.
  * @param total The total number of files.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-26T05:22:02.282422614Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class VectorStoreFileBatchObjectFileCounts(
  inProgress: Int,
  completed: Int,
  failed: Int,
  cancelled: Int,
  total: Int
)

object VectorStoreFileBatchObjectFileCounts {
  implicit lazy val vectorStoreFileBatchObjectFileCountsJsonFormat: Format[VectorStoreFileBatchObjectFileCounts] = Json.format[VectorStoreFileBatchObjectFileCounts]
}

