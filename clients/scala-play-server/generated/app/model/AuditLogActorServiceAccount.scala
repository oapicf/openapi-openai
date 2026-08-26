package model

import play.api.libs.json._

/**
  * The service account that performed the audit logged action.
  * @param id The service account id.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-26T05:22:02.282422614Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class AuditLogActorServiceAccount(
  id: Option[String]
)

object AuditLogActorServiceAccount {
  implicit lazy val auditLogActorServiceAccountJsonFormat: Format[AuditLogActorServiceAccount] = Json.format[AuditLogActorServiceAccount]
}

