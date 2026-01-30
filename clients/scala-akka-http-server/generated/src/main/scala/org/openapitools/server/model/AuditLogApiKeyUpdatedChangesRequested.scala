package org.openapitools.server.model


/**
 * The payload used to update the API key.
 *
 * @param scopes A list of scopes allowed for the API key, e.g. `[\"api.model.request\"]` for example: ''null''
*/
final case class AuditLogApiKeyUpdatedChangesRequested (
  scopes: Option[Seq[String]] = None
)

