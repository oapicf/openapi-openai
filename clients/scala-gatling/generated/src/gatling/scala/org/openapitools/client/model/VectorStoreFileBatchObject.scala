
package org.openapitools.client.model


case class VectorStoreFileBatchObject (
    /* The identifier, which can be referenced in API endpoints. */
    _id: String,
    /* The object type, which is always `vector_store.file_batch`. */
    _object: String,
    /* The Unix timestamp (in seconds) for when the vector store files batch was created. */
    _createdAt: Integer,
    /* The ID of the [vector store](/docs/api-reference/vector-stores/object) that the [File](/docs/api-reference/files) is attached to. */
    _vectorStoreId: String,
    /* The status of the vector store files batch, which can be either `in_progress`, `completed`, `cancelled` or `failed`. */
    _status: String,
    _fileCounts: VectorStoreFileBatchObjectFileCounts
)
object VectorStoreFileBatchObject {
    def toStringBody(var_id: Object, var_object: Object, var_createdAt: Object, var_vectorStoreId: Object, var_status: Object, var_fileCounts: Object) =
        s"""
        | {
        | "id":$var_id,"object":$var_object,"createdAt":$var_createdAt,"vectorStoreId":$var_vectorStoreId,"status":$var_status,"fileCounts":$var_fileCounts
        | }
        """.stripMargin
}
