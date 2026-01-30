
package org.openapitools.client.model


case class VectorStoreFileObject (
    /* The identifier, which can be referenced in API endpoints. */
    _id: String,
    /* The object type, which is always `vector_store.file`. */
    _object: String,
    /* The total vector store usage in bytes. Note that this may be different from the original file size. */
    _usageBytes: Integer,
    /* The Unix timestamp (in seconds) for when the vector store file was created. */
    _createdAt: Integer,
    /* The ID of the [vector store](/docs/api-reference/vector-stores/object) that the [File](/docs/api-reference/files) is attached to. */
    _vectorStoreId: String,
    /* The status of the vector store file, which can be either `in_progress`, `completed`, `cancelled`, or `failed`. The status `completed` indicates that the vector store file is ready for use. */
    _status: String,
    _lastError: VectorStoreFileObjectLastError,
    _chunkingStrategy: Option[VectorStoreFileObjectChunkingStrategy]
)
object VectorStoreFileObject {
    def toStringBody(var_id: Object, var_object: Object, var_usageBytes: Object, var_createdAt: Object, var_vectorStoreId: Object, var_status: Object, var_lastError: Object, var_chunkingStrategy: Object) =
        s"""
        | {
        | "id":$var_id,"object":$var_object,"usageBytes":$var_usageBytes,"createdAt":$var_createdAt,"vectorStoreId":$var_vectorStoreId,"status":$var_status,"lastError":$var_lastError,"chunkingStrategy":$var_chunkingStrategy
        | }
        """.stripMargin
}
