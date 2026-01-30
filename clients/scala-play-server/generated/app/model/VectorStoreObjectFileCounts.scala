package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for VectorStoreObject_file_counts.
  * @param inProgress The number of files that are currently being processed.
  * @param completed The number of files that have been successfully processed.
  * @param failed The number of files that have failed to process.
  * @param cancelled The number of files that were cancelled.
  * @param total The total number of files.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class VectorStoreObjectFileCounts(
  inProgress: Int,
  completed: Int,
  failed: Int,
  cancelled: Int,
  total: Int
)

object VectorStoreObjectFileCounts {
  implicit lazy val vectorStoreObjectFileCountsJsonFormat: Format[VectorStoreObjectFileCounts] = Json.format[VectorStoreObjectFileCounts]
}

