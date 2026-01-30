
package org.openapitools.client.model


case class CreateVectorStoreRequest (
    /* A list of [File](/docs/api-reference/files) IDs that the vector store should use. Useful for tools like `file_search` that can access files. */
    _fileIds: Option[List[String]],
    /* The name of the vector store. */
    _name: Option[String],
    _expiresAfter: Option[VectorStoreExpirationAfter],
    _chunkingStrategy: Option[CreateVectorStoreRequestChunkingStrategy],
    /* Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  */
    _metadata: Option[Any]
)
object CreateVectorStoreRequest {
    def toStringBody(var_fileIds: Object, var_name: Object, var_expiresAfter: Object, var_chunkingStrategy: Object, var_metadata: Object) =
        s"""
        | {
        | "fileIds":$var_fileIds,"name":$var_name,"expiresAfter":$var_expiresAfter,"chunkingStrategy":$var_chunkingStrategy,"metadata":$var_metadata
        | }
        """.stripMargin
}
