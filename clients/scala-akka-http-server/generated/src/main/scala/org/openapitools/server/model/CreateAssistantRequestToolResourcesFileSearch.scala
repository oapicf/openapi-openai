package org.openapitools.server.model


/**
 * @param vectorStoreIds The [vector store](/docs/api-reference/vector-stores/object) attached to this assistant. There can be a maximum of 1 vector store attached to the assistant.  for example: ''null''
 * @param vectorStores A helper to create a [vector store](/docs/api-reference/vector-stores/object) with file_ids and attach it to this assistant. There can be a maximum of 1 vector store attached to the assistant.  for example: ''null''
*/
final case class CreateAssistantRequestToolResourcesFileSearch (
  vectorStoreIds: Option[Seq[String]] = None,
  vectorStores: Option[Seq[CreateAssistantRequestToolResourcesFileSearchVectorStoresInner]] = None
)

