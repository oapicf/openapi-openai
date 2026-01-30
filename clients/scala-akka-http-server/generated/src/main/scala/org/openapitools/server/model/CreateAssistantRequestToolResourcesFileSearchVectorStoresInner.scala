package org.openapitools.server.model


/**
 * @param fileIds A list of [file](/docs/api-reference/files) IDs to add to the vector store. There can be a maximum of 10000 files in a vector store.  for example: ''null''
 * @param chunkingStrategy  for example: ''null''
 * @param metadata Set of 16 key-value pairs that can be attached to a vector store. This can be useful for storing additional information about the vector store in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  for example: ''null''
*/
final case class CreateAssistantRequestToolResourcesFileSearchVectorStoresInner (
  fileIds: Option[Seq[String]] = None,
  chunkingStrategy: Option[CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy] = None,
  metadata: Option[Any] = None
)

