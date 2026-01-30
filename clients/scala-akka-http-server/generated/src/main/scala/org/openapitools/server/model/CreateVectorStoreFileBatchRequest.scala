package org.openapitools.server.model


/**
 * @param fileIds A list of [File](/docs/api-reference/files) IDs that the vector store should use. Useful for tools like `file_search` that can access files. for example: ''null''
 * @param chunkingStrategy  for example: ''null''
*/
final case class CreateVectorStoreFileBatchRequest (
  fileIds: Seq[String],
  chunkingStrategy: Option[ChunkingStrategyRequestParam] = None
)

