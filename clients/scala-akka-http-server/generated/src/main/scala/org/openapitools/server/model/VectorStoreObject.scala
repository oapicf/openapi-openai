package org.openapitools.server.model


/**
 * = Vector store =
 *
 * A vector store is a collection of processed files can be used by the `file_search` tool.
 *
 * @param id The identifier, which can be referenced in API endpoints. for example: ''null''
 * @param `object` The object type, which is always `vector_store`. for example: ''null''
 * @param createdAt The Unix timestamp (in seconds) for when the vector store was created. for example: ''null''
 * @param name The name of the vector store. for example: ''null''
 * @param usageBytes The total number of bytes used by the files in the vector store. for example: ''null''
 * @param fileCounts  for example: ''null''
 * @param status The status of the vector store, which can be either `expired`, `in_progress`, or `completed`. A status of `completed` indicates that the vector store is ready for use. for example: ''null''
 * @param expiresAfter  for example: ''null''
 * @param expiresAt The Unix timestamp (in seconds) for when the vector store will expire. for example: ''null''
 * @param lastActiveAt The Unix timestamp (in seconds) for when the vector store was last active. for example: ''null''
 * @param metadata Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  for example: ''null''
*/
final case class VectorStoreObject (
  id: String,
  `object`: String,
  createdAt: Int,
  name: String,
  usageBytes: Int,
  fileCounts: VectorStoreObjectFileCounts,
  status: String,
  expiresAfter: Option[VectorStoreExpirationAfter] = None,
  expiresAt: Option[Int] = None,
  lastActiveAt: Int,
  metadata: Any
)

