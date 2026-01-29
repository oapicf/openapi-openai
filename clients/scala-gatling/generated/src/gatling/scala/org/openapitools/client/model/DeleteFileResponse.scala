
package org.openapitools.client.model


case class DeleteFileResponse (
    _id: String,
    _object: String,
    _deleted: Boolean
)
object DeleteFileResponse {
    def toStringBody(var_id: Object, var_object: Object, var_deleted: Object) =
        s"""
        | {
        | "id":$var_id,"object":$var_object,"deleted":$var_deleted
        | }
        """.stripMargin
}
