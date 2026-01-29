
package org.openapitools.client.model


case class ThreadObject (
    /* The identifier, which can be referenced in API endpoints. */
    _id: String,
    /* The object type, which is always `thread`. */
    _object: String,
    /* The Unix timestamp (in seconds) for when the thread was created. */
    _createdAt: Integer,
    /* Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long.  */
    _metadata: Any
)
object ThreadObject {
    def toStringBody(var_id: Object, var_object: Object, var_createdAt: Object, var_metadata: Object) =
        s"""
        | {
        | "id":$var_id,"object":$var_object,"createdAt":$var_createdAt,"metadata":$var_metadata
        | }
        """.stripMargin
}
