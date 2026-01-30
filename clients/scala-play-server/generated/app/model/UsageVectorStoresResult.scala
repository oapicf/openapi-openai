package model

import play.api.libs.json._

/**
  * The aggregated vector stores usage details of the specific time bucket.
  * @param usageBytes The vector stores usage in bytes.
  * @param projectId When `group_by=project_id`, this field provides the project ID of the grouped usage result.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class UsageVectorStoresResult(
  `object`: UsageVectorStoresResult.Object.Value,
  usageBytes: Int,
  projectId: Option[String]
)

object UsageVectorStoresResult {
  implicit lazy val usageVectorStoresResultJsonFormat: Format[UsageVectorStoresResult] = Json.format[UsageVectorStoresResult]

  // noinspection TypeAnnotation
  object Object extends Enumeration {
    val OrganizationUsageVectorStoresResult = Value("organization.usage.vector_stores.result")

    type Object = Value
    implicit lazy val ObjectJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

