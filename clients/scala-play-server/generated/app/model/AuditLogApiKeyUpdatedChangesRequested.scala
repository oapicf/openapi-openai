package model

import play.api.libs.json._

/**
  * The payload used to update the API key.
  * @param scopes A list of scopes allowed for the API key, e.g. `[\"api.model.request\"]`
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-26T05:22:02.282422614Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class AuditLogApiKeyUpdatedChangesRequested(
  scopes: Option[List[String]]
)

object AuditLogApiKeyUpdatedChangesRequested {
  implicit lazy val auditLogApiKeyUpdatedChangesRequestedJsonFormat: Format[AuditLogApiKeyUpdatedChangesRequested] = Json.format[AuditLogApiKeyUpdatedChangesRequested]
}

