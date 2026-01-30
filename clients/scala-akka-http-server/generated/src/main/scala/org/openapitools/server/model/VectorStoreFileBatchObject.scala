package org.openapitools.server.model


/**
 * = Vector store file batch =
 *
 * A batch of files attached to a vector store.
 *
 * @param id The identifier, which can be referenced in API endpoints. for example: ''null''
 * @param `object` The object type, which is always `vector_store.file_batch`. for example: ''null''
 * @param createdAt The Unix timestamp (in seconds) for when the vector store files batch was created. for example: ''null''
 * @param vectorStoreId The ID of the [vector store](/docs/api-reference/vector-stores/object) that the [File](/docs/api-reference/files) is attached to. for example: ''null''
 * @param status The status of the vector store files batch, which can be either `in_progress`, `completed`, `cancelled` or `failed`. for example: ''null''
 * @param fileCounts  for example: ''null''
*/
final case class VectorStoreFileBatchObject (
  id: String,
  `object`: String,
  createdAt: Int,
  vectorStoreId: String,
  status: String,
  fileCounts: VectorStoreFileBatchObjectFileCounts
)

