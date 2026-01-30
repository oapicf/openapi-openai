package org.openapitools.server.model


/**
 * = Vector store files =
 *
 * A list of files attached to a vector store.
 *
 * @param id The identifier, which can be referenced in API endpoints. for example: ''null''
 * @param `object` The object type, which is always `vector_store.file`. for example: ''null''
 * @param usageBytes The total vector store usage in bytes. Note that this may be different from the original file size. for example: ''null''
 * @param createdAt The Unix timestamp (in seconds) for when the vector store file was created. for example: ''null''
 * @param vectorStoreId The ID of the [vector store](/docs/api-reference/vector-stores/object) that the [File](/docs/api-reference/files) is attached to. for example: ''null''
 * @param status The status of the vector store file, which can be either `in_progress`, `completed`, `cancelled`, or `failed`. The status `completed` indicates that the vector store file is ready for use. for example: ''null''
 * @param lastError  for example: ''null''
 * @param chunkingStrategy  for example: ''null''
*/
final case class VectorStoreFileObject (
  id: String,
  `object`: String,
  usageBytes: Int,
  createdAt: Int,
  vectorStoreId: String,
  status: String,
  lastError: VectorStoreFileObjectLastError,
  chunkingStrategy: Option[VectorStoreFileObjectChunkingStrategy] = None
)

