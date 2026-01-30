
package org.openapitools.client.model


case class VectorStoreObject (
    /* The identifier, which can be referenced in API endpoints. */
    _id: String,
    /* The object type, which is always `vector_store`. */
    _object: String,
    /* The Unix timestamp (in seconds) for when the vector store was created. */
    _createdAt: Integer,
    /* The name of the vector store. */
    _name: String,
    /* The total number of bytes used by the files in the vector store. */
    _usageBytes: Integer,
    _fileCounts: VectorStoreObjectFileCounts,
    /* The status of the vector store, which can be either `expired`, `in_progress`, or `completed`. A status of `completed` indicates that the vector store is ready for use. */
    _status: String,
    _expiresAfter: Option[VectorStoreExpirationAfter],
    /* The Unix timestamp (in seconds) for when the vector store will expire. */
    _expiresAt: Option[Integer],
    /* The Unix timestamp (in seconds) for when the vector store was last active. */
    _lastActiveAt: Integer,
    /* Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  */
    _metadata: Any
)
object VectorStoreObject {
    def toStringBody(var_id: Object, var_object: Object, var_createdAt: Object, var_name: Object, var_usageBytes: Object, var_fileCounts: Object, var_status: Object, var_expiresAfter: Object, var_expiresAt: Object, var_lastActiveAt: Object, var_metadata: Object) =
        s"""
        | {
        | "id":$var_id,"object":$var_object,"createdAt":$var_createdAt,"name":$var_name,"usageBytes":$var_usageBytes,"fileCounts":$var_fileCounts,"status":$var_status,"expiresAfter":$var_expiresAfter,"expiresAt":$var_expiresAt,"lastActiveAt":$var_lastActiveAt,"metadata":$var_metadata
        | }
        """.stripMargin
}
