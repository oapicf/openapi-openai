
package org.openapitools.client.model


case class AuditLogApiKeyUpdatedChangesRequested (
    /* A list of scopes allowed for the API key, e.g. `[\"api.model.request\"]` */
    _scopes: Option[List[String]]
)
object AuditLogApiKeyUpdatedChangesRequested {
    def toStringBody(var_scopes: Object) =
        s"""
        | {
        | "scopes":$var_scopes
        | }
        """.stripMargin
}
