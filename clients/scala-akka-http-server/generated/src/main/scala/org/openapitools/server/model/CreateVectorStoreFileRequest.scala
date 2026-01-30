package org.openapitools.server.model


/**
 * @param fileId A [File](/docs/api-reference/files) ID that the vector store should use. Useful for tools like `file_search` that can access files. for example: ''null''
 * @param chunkingStrategy  for example: ''null''
*/
final case class CreateVectorStoreFileRequest (
  fileId: String,
  chunkingStrategy: Option[ChunkingStrategyRequestParam] = None
)

