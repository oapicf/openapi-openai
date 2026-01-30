
package org.openapitools.client.model


case class ProjectApiKeyOwner (
    /* `user` or `service_account` */
    _type: Option[String],
    _user: Option[ProjectUser],
    _serviceAccount: Option[ProjectServiceAccount]
)
object ProjectApiKeyOwner {
    def toStringBody(var_type: Object, var_user: Object, var_serviceAccount: Object) =
        s"""
        | {
        | "type":$var_type,"user":$var_user,"serviceAccount":$var_serviceAccount
        | }
        """.stripMargin
}
