package model

import play.api.libs.json._

/**
  * The payload used to create the API key.
  * @param scopes A list of scopes allowed for the API key, e.g. `[\"api.model.request\"]`
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class AuditLogApiKeyCreatedData(
  scopes: Option[List[String]]
)

object AuditLogApiKeyCreatedData {
  implicit lazy val auditLogApiKeyCreatedDataJsonFormat: Format[AuditLogApiKeyCreatedData] = Json.format[AuditLogApiKeyCreatedData]
}

