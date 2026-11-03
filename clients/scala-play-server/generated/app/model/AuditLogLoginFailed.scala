package model

import play.api.libs.json._

/**
  * The details for events with this `type`.
  * @param errorCode The error code of the failure.
  * @param errorMessage The error message of the failure.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:38:29.809972473Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class AuditLogLoginFailed(
  errorCode: Option[String],
  errorMessage: Option[String]
)

object AuditLogLoginFailed {
  implicit lazy val auditLogLoginFailedJsonFormat: Format[AuditLogLoginFailed] = Json.format[AuditLogLoginFailed]
}

