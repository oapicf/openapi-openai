
package org.openapitools.client.model


case class ProjectServiceAccountApiKey (
    /* The object type, which is always `organization.project.service_account.api_key` */
    _object: String,
    _value: String,
    _name: String,
    _createdAt: Integer,
    _id: String
)
object ProjectServiceAccountApiKey {
    def toStringBody(var_object: Object, var_value: Object, var_name: Object, var_createdAt: Object, var_id: Object) =
        s"""
        | {
        | "object":$var_object,"value":$var_value,"name":$var_name,"createdAt":$var_createdAt,"id":$var_id
        | }
        """.stripMargin
}
