package org.openapitools.server.model


/**
 * @param vectorStoreIds The [vector store](/docs/api-reference/vector-stores/object) attached to this thread. There can be a maximum of 1 vector store attached to the thread.  for example: ''null''
*/
final case class ModifyThreadRequestToolResourcesFileSearch (
  vectorStoreIds: Option[Seq[String]] = None
)

