
package org.openapitools.client.model


case class ProjectServiceAccountCreateResponse (
    _object: String,
    _id: String,
    _name: String,
    /* Service accounts can only have one role of type `member` */
    _role: String,
    _createdAt: Integer,
    _apiKey: ProjectServiceAccountApiKey
)
object ProjectServiceAccountCreateResponse {
    def toStringBody(var_object: Object, var_id: Object, var_name: Object, var_role: Object, var_createdAt: Object, var_apiKey: Object) =
        s"""
        | {
        | "object":$var_object,"id":$var_id,"name":$var_name,"role":$var_role,"createdAt":$var_createdAt,"apiKey":$var_apiKey
        | }
        """.stripMargin
}
