
package org.openapitools.client.model


case class CreateVectorStoreFileBatchRequest (
    /* A list of [File](/docs/api-reference/files) IDs that the vector store should use. Useful for tools like `file_search` that can access files. */
    _fileIds: List[String],
    _chunkingStrategy: Option[ChunkingStrategyRequestParam]
)
object CreateVectorStoreFileBatchRequest {
    def toStringBody(var_fileIds: Object, var_chunkingStrategy: Object) =
        s"""
        | {
        | "fileIds":$var_fileIds,"chunkingStrategy":$var_chunkingStrategy
        | }
        """.stripMargin
}
