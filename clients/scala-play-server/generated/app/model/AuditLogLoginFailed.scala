package model

import play.api.libs.json._

/**
  * The details for events with this `type`.
  * @param errorCode The error code of the failure.
  * @param errorMessage The error message of the failure.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-26T05:22:02.282422614Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class AuditLogLoginFailed(
  errorCode: Option[String],
  errorMessage: Option[String]
)

object AuditLogLoginFailed {
  implicit lazy val auditLogLoginFailedJsonFormat: Format[AuditLogLoginFailed] = Json.format[AuditLogLoginFailed]
}

