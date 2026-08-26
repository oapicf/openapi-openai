package model

import play.api.libs.json._

/**
  * The payload used to create the service account.
  * @param role The role of the service account. Is either `owner` or `member`.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-26T05:22:02.282422614Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class AuditLogServiceAccountCreatedData(
  role: Option[String]
)

object AuditLogServiceAccountCreatedData {
  implicit lazy val auditLogServiceAccountCreatedDataJsonFormat: Format[AuditLogServiceAccountCreatedData] = Json.format[AuditLogServiceAccountCreatedData]
}

