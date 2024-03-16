
package org.openapitools.client.model


case class Model (
    _id: String,
    _object: String,
    _created: Integer,
    _ownedBy: String
)
object Model {
    def toStringBody(var_id: Object, var_object: Object, var_created: Object, var_ownedBy: Object) =
        s"""
        | {
        | "id":$var_id,"object":$var_object,"created":$var_created,"ownedBy":$var_ownedBy
        | }
        """.stripMargin
}
