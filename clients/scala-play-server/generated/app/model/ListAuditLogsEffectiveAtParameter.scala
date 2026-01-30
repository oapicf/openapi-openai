package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for list_audit_logs_effective_at_parameter.
  * @param gt Return only events whose `effective_at` (Unix seconds) is greater than this value.
  * @param gte Return only events whose `effective_at` (Unix seconds) is greater than or equal to this value.
  * @param lt Return only events whose `effective_at` (Unix seconds) is less than this value.
  * @param lte Return only events whose `effective_at` (Unix seconds) is less than or equal to this value.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class ListAuditLogsEffectiveAtParameter(
  gt: Option[Int],
  gte: Option[Int],
  lt: Option[Int],
  lte: Option[Int]
)

object ListAuditLogsEffectiveAtParameter {
  implicit lazy val listAuditLogsEffectiveAtParameterJsonFormat: Format[ListAuditLogsEffectiveAtParameter] = Json.format[ListAuditLogsEffectiveAtParameter]
}

