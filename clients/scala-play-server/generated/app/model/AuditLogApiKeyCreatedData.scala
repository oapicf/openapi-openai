package model

import play.api.libs.json._

/**
  * The payload used to create the API key.
  * @param scopes A list of scopes allowed for the API key, e.g. `[\"api.model.request\"]`
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:38:29.809972473Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class AuditLogApiKeyCreatedData(
  scopes: Option[List[String]]
)

object AuditLogApiKeyCreatedData {
  implicit lazy val auditLogApiKeyCreatedDataJsonFormat: Format[AuditLogApiKeyCreatedData] = Json.format[AuditLogApiKeyCreatedData]
}

