
package org.openapitools.client.model


case class AuditLogActor (
    /* The type of actor. Is either `session` or `api_key`. */
    _type: Option[String],
    _session: Option[AuditLogActorSession],
    _apiKey: Option[AuditLogActorApiKey]
)
object AuditLogActor {
    def toStringBody(var_type: Object, var_session: Object, var_apiKey: Object) =
        s"""
        | {
        | "type":$var_type,"session":$var_session,"apiKey":$var_apiKey
        | }
        """.stripMargin
}
