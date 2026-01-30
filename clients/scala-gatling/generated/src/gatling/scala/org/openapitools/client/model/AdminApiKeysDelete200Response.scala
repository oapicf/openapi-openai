
package org.openapitools.client.model


case class AdminApiKeysDelete200Response (
    _id: Option[String],
    _object: Option[String],
    _deleted: Option[Boolean]
)
object AdminApiKeysDelete200Response {
    def toStringBody(var_id: Object, var_object: Object, var_deleted: Object) =
        s"""
        | {
        | "id":$var_id,"object":$var_object,"deleted":$var_deleted
        | }
        """.stripMargin
}
