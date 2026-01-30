package org.openapitools.server.model


/**
 * The payload used to create the API key.
 *
 * @param scopes A list of scopes allowed for the API key, e.g. `[\"api.model.request\"]` for example: ''null''
*/
final case class AuditLogApiKeyCreatedData (
  scopes: Option[Seq[String]] = None
)

