
package org.openapitools.client.model


case class DeleteVectorStoreResponse (
    _id: String,
    _deleted: Boolean,
    _object: String
)
object DeleteVectorStoreResponse {
    def toStringBody(var_id: Object, var_deleted: Object, var_object: Object) =
        s"""
        | {
        | "id":$var_id,"deleted":$var_deleted,"object":$var_object
        | }
        """.stripMargin
}
