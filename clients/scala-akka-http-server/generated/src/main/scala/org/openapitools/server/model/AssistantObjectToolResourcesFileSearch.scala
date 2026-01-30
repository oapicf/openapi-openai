package org.openapitools.server.model


/**
 * @param vectorStoreIds The ID of the [vector store](/docs/api-reference/vector-stores/object) attached to this assistant. There can be a maximum of 1 vector store attached to the assistant.  for example: ''null''
*/
final case class AssistantObjectToolResourcesFileSearch (
  vectorStoreIds: Option[Seq[String]] = None
)

