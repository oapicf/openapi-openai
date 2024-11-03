
package org.openapitools.client.model


case class Model (
    /* The model identifier, which can be referenced in the API endpoints. */
    _id: String,
    /* The Unix timestamp (in seconds) when the model was created. */
    _created: Integer,
    /* The object type, which is always \"model\". */
    _object: String,
    /* The organization that owns the model. */
    _ownedBy: String
)
object Model {
    def toStringBody(var_id: Object, var_created: Object, var_object: Object, var_ownedBy: Object) =
        s"""
        | {
        | "id":$var_id,"created":$var_created,"object":$var_object,"ownedBy":$var_ownedBy
        | }
        """.stripMargin
}
