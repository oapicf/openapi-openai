
package org.openapitools.client.model


case class CreateVectorStoreFileRequest (
    /* A [File](/docs/api-reference/files) ID that the vector store should use. Useful for tools like `file_search` that can access files. */
    _fileId: String,
    _chunkingStrategy: Option[ChunkingStrategyRequestParam]
)
object CreateVectorStoreFileRequest {
    def toStringBody(var_fileId: Object, var_chunkingStrategy: Object) =
        s"""
        | {
        | "fileId":$var_fileId,"chunkingStrategy":$var_chunkingStrategy
        | }
        """.stripMargin
}
