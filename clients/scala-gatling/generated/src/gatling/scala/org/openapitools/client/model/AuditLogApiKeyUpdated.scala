
package org.openapitools.client.model


case class AuditLogApiKeyUpdated (
    /* The tracking ID of the API key. */
    _id: Option[String],
    _changesRequested: Option[AuditLogApiKeyUpdatedChangesRequested]
)
object AuditLogApiKeyUpdated {
    def toStringBody(var_id: Object, var_changesRequested: Object) =
        s"""
        | {
        | "id":$var_id,"changesRequested":$var_changesRequested
        | }
        """.stripMargin
}
