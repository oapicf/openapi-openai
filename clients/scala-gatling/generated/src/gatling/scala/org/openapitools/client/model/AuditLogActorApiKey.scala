
package org.openapitools.client.model


case class AuditLogActorApiKey (
    /* The tracking id of the API key. */
    _id: Option[String],
    /* The type of API key. Can be either `user` or `service_account`. */
    _type: Option[String],
    _user: Option[AuditLogActorUser],
    _serviceAccount: Option[AuditLogActorServiceAccount]
)
object AuditLogActorApiKey {
    def toStringBody(var_id: Object, var_type: Object, var_user: Object, var_serviceAccount: Object) =
        s"""
        | {
        | "id":$var_id,"type":$var_type,"user":$var_user,"serviceAccount":$var_serviceAccount
        | }
        """.stripMargin
}
