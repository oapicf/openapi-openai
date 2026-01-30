
package org.openapitools.client.model


case class ProjectApiKeyDeleteResponse (
    _object: String,
    _id: String,
    _deleted: Boolean
)
object ProjectApiKeyDeleteResponse {
    def toStringBody(var_object: Object, var_id: Object, var_deleted: Object) =
        s"""
        | {
        | "object":$var_object,"id":$var_id,"deleted":$var_deleted
        | }
        """.stripMargin
}
