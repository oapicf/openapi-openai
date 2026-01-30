package model

import play.api.libs.json._

/**
  * The aggregated costs details of the specific time bucket.
  * @param lineItem When `group_by=line_item`, this field provides the line item of the grouped costs result.
  * @param projectId When `group_by=project_id`, this field provides the project ID of the grouped costs result.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CostsResult(
  `object`: CostsResult.Object.Value,
  amount: Option[CostsResultAmount],
  lineItem: Option[String],
  projectId: Option[String]
)

object CostsResult {
  implicit lazy val costsResultJsonFormat: Format[CostsResult] = Json.format[CostsResult]

  // noinspection TypeAnnotation
  object Object extends Enumeration {
    val OrganizationCostsResult = Value("organization.costs.result")

    type Object = Value
    implicit lazy val ObjectJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

