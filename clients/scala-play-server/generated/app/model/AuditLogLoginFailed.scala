package model

import play.api.libs.json._

/**
  * The details for events with this `type`.
  * @param errorCode The error code of the failure.
  * @param errorMessage The error message of the failure.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class AuditLogLoginFailed(
  errorCode: Option[String],
  errorMessage: Option[String]
)

object AuditLogLoginFailed {
  implicit lazy val auditLogLoginFailedJsonFormat: Format[AuditLogLoginFailed] = Json.format[AuditLogLoginFailed]
}

