package org.openapitools.server.model


/**
 * @param vectorStoreIds The [vector store](/docs/api-reference/vector-stores/object) attached to this thread. There can be a maximum of 1 vector store attached to the thread.  for example: ''null''
 * @param vectorStores A helper to create a [vector store](/docs/api-reference/vector-stores/object) with file_ids and attach it to this thread. There can be a maximum of 1 vector store attached to the thread.  for example: ''null''
*/
final case class CreateThreadRequestToolResourcesFileSearch (
  vectorStoreIds: Option[Seq[String]] = None,
  vectorStores: Option[Seq[CreateThreadRequestToolResourcesFileSearchVectorStoresInner]] = None
)

