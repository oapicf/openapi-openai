package model

import play.api.libs.json._

/**
  * The payload used to create the service account.
  * @param role The role of the service account. Is either `owner` or `member`.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:38:29.809972473Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class AuditLogServiceAccountCreatedData(
  role: Option[String]
)

object AuditLogServiceAccountCreatedData {
  implicit lazy val auditLogServiceAccountCreatedDataJsonFormat: Format[AuditLogServiceAccountCreatedData] = Json.format[AuditLogServiceAccountCreatedData]
}

